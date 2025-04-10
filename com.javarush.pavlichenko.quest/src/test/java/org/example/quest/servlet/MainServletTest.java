package org.example.quest.servlet;

import org.example.quest.model.RadioButton;
import org.example.quest.service.RadioButtonService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.List;
import static org.mockito.Mockito.*;

public class MainServletTest {

    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpServletResponse response;
    @Mock
    private RequestDispatcher requestDispatcher;
    @Mock
    private RadioButtonService radioButtonService;
    @Mock
    private RadioButton radioButton;

    private MainServlet servlet;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        servlet = new MainServlet();
        servlet.radioButtonService = radioButtonService;
    }

    @Test
    public void testDoGet_WithSelectedOption() throws Exception {

        when(request.getParameter("selectedOption")).thenReturn("OPTION_1");
        when(radioButtonService.getNextRadioButton("OPTION_1")).thenReturn(radioButton);
        when(radioButton.getAvalibleRadioButtons()).thenReturn(List.of(mock(RadioButton.class)));
        when(request.getRequestDispatcher("/start.jsp")).thenReturn(requestDispatcher);

        servlet.doGet(request, response);

        verify(request).setAttribute("currentOption", radioButton);
        verify(requestDispatcher).forward(request, response);
    }

    @Test
    public void testDoGet_DefaultStartOption() throws Exception {

        when(request.getParameter("selectedOption")).thenReturn(null);
        when(radioButtonService.getNextRadioButton("START")).thenReturn(radioButton);
        when(radioButton.getAvalibleRadioButtons()).thenReturn(List.of(mock(RadioButton.class)));
        when(request.getRequestDispatcher("/start.jsp")).thenReturn(requestDispatcher);

        servlet.doGet(request, response);

        verify(radioButtonService).getNextRadioButton("START");
    }

    @Test
    public void testDoGet_EmptyRadioButtons_RedirectToEnding() throws Exception {
        // 1. Условия теста (список радио-кнопок пуст)
        when(request.getParameter("selectedOption")).thenReturn("OPTION_1");
        when(radioButtonService.getNextRadioButton("OPTION_1")).thenReturn(radioButton);
        when(radioButton.getAvalibleRadioButtons()).thenReturn(Collections.emptyList());

        when(request.getRequestDispatcher("/ending.jsp")).thenReturn(requestDispatcher);
        when(request.getRequestDispatcher("/start.jsp")).thenReturn(requestDispatcher);

        servlet.doGet(request, response);

        verify(request, times(2)).setAttribute("currentOption",radioButton);
        verify(request).getRequestDispatcher("/ending.jsp");
        verify(requestDispatcher).forward(request, response); // Проверяем, что был переход
    }
}
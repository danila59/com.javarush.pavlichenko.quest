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
import javax.servlet.http.HttpSession;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class WelcomeServletTest {

    private WelcomeServlet servlet;

    @Mock
    private HttpServletRequest request;

    @Mock
    private HttpServletResponse response;

    @Mock
    private HttpSession session;

    @Mock
    private RequestDispatcher requestDispatcher;

    @Mock
    private RadioButtonService radioButtonService;

    @Mock
    private RadioButton radioButton;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        servlet = new WelcomeServlet();
        servlet.radioButtonService = radioButtonService;

        when(request.getSession()).thenReturn(session);
        when(request.getRequestDispatcher("/start.jsp")).thenReturn(requestDispatcher);
    }

    @Test
    public void testDoPostWithPlayerName() throws Exception {
        // Подготовка
        when(request.getParameter("playerName")).thenReturn("TestPlayer");
        when(request.getParameter("selectedOption")).thenReturn("START");
        when(radioButtonService.getNextRadioButton("START")).thenReturn(radioButton);

        // Выполнение
        servlet.doPost(request, response);

        // Проверки
        verify(request).getParameter("playerName");
        verify(session).setAttribute("UserName", "TestPlayer");
        verify(session).setAttribute("CountGame", 0);
        verify(radioButtonService).getNextRadioButton("START");
        verify(request).setAttribute("currentOption", radioButton);
        verify(requestDispatcher).forward(request, response);
    }

    @Test
    public void testDoPostWithNullSelectedOption() throws Exception {
        // Подготовка
        when(request.getParameter("playerName")).thenReturn("TestPlayer");
        when(request.getParameter("selectedOption")).thenReturn(null);
        when(radioButtonService.getNextRadioButton("START")).thenReturn(radioButton);

        // Выполнение
        servlet.doPost(request, response);

        // Проверки
        verify(radioButtonService).getNextRadioButton("START"); // Должен использовать значение по умолчанию
    }
}
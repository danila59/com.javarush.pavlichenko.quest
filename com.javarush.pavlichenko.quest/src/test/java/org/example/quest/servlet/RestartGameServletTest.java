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

import static org.mockito.Mockito.*;


public class RestartGameServletTest {

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
        MockitoAnnotations.openMocks(this);  // Инициализируем моки
        when(request.getSession(false)).thenReturn(session);  // Настраиваем поведение
    }

    @Test
    public void testDoPost_WithSession() throws Exception {
        // 1. Настраиваем моки
        when(request.getSession(false)).thenReturn(session);
        when(session.getAttribute("CountGame")).thenReturn(2); // Текущее значение счётчика
        when(request.getParameter("selectedOption")).thenReturn("OPTION_1");
        when(radioButtonService.getNextRadioButton("OPTION_1")).thenReturn(radioButton);
        when(request.getRequestDispatcher("/start.jsp")).thenReturn(requestDispatcher);

        // 2. Создаём сервлет и подменяем radioButtonService
        RestartGameServlet servlet = new RestartGameServlet();
        servlet.radioButtonService = radioButtonService; // Инъекция мока

        servlet.doPost(request, response);

        verify(session).setAttribute("CountGame", 3);
        verify(request).setAttribute("currentOption", radioButton);
        verify(requestDispatcher).forward(request, response);
    }

    @Test
    public void testDoPost_NoSession() throws Exception {
        // Если сессии нет ничего не должно происходить
        when(request.getSession(false)).thenReturn(null);

        RestartGameServlet servlet = new RestartGameServlet();
        servlet.doPost(request, response);

        // Проверяем, что не было взаимодействий с сессией
        verify(session, never()).setAttribute(any(), any());
        verify(request, never()).getRequestDispatcher(any());
    }

    @Test
    public void testDoPost_DefaultOption() throws Exception {
        // Если selectedOption == null должен подставиться "START"
        when(request.getSession(false)).thenReturn(session);
        when(request.getParameter("selectedOption")).thenReturn(null);
        when(radioButtonService.getNextRadioButton("START")).thenReturn(radioButton);
        when(request.getRequestDispatcher("/start.jsp")).thenReturn(requestDispatcher);
        RestartGameServlet servlet = new RestartGameServlet();
        servlet.radioButtonService = radioButtonService;
        servlet.doPost(request, response);

        verify(radioButtonService).getNextRadioButton("START");
    }
}
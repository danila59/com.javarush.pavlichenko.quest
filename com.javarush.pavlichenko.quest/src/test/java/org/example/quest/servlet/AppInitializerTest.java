package org.example.quest.servlet;

import org.example.quest.dao.ValueBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockedConstruction;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import static org.mockito.Mockito.*;


class AppInitializerTest {

    @Test
    public void testContextInitializedWithPowerMock() {

        ServletContext servletContext = mock(ServletContext.class);
        ServletContextEvent event = mock(ServletContextEvent.class);
        when(event.getServletContext()).thenReturn(servletContext);
        // 2. Мокируем конструктор ValueBase
        try (MockedConstruction<ValueBase> mocked = Mockito.mockConstruction(ValueBase.class,
                (mock, context) -> {
                    // Настраиваем поведение mock-объекта
                    doNothing().when(mock).initValueBase();
                })) {


            new AppInitializer().contextInitialized(event);

            // 4. Проверяем
            ValueBase mockValueBase = mocked.constructed().get(0);
            verify(mockValueBase).initValueBase();
            verify(servletContext).setAttribute("valueBase", mockValueBase);
        }
    }
}
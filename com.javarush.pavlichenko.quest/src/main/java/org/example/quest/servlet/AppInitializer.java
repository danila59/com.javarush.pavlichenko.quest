package org.example.quest.servlet;


import org.example.quest.dao.ValueBase;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppInitializer implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {
        ValueBase valueBase = new ValueBase();
        valueBase.initValueBase();
        event.getServletContext().setAttribute("valueBase", valueBase);
    }
}

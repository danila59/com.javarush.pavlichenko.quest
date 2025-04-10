package org.example.quest.servlet;

import org.example.quest.model.RadioButton;
import org.example.quest.service.RadioButtonService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Optional;

@WebServlet(value = "/RegisterPlayer")
public class WelcomeServlet extends HttpServlet {
    protected RadioButtonService radioButtonService = new RadioButtonService();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String playerName = request.getParameter("playerName");
        HttpSession session = request.getSession();
        session.setAttribute("UserName", playerName);
        session.setAttribute("CountGame", 0);

        String selectedOption = Optional.ofNullable(request.getParameter("selectedOption")).orElse("START");

        RadioButton radioButton = radioButtonService.getNextRadioButton(selectedOption);

        request.setAttribute("currentOption", radioButton);

        request.getRequestDispatcher("/start.jsp").forward(request, response);
    }
}

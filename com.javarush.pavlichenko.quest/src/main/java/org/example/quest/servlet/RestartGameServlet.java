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

@WebServlet(value = "/restart")
public class RestartGameServlet extends HttpServlet {
    protected RadioButtonService radioButtonService = new RadioButtonService();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession(false);

        if (session != null) {
            Integer countGame = (Integer) session.getAttribute("CountGame");
            countGame = (countGame == null) ? 0 : countGame;
            session.setAttribute("CountGame", countGame + 1);
            String selectedOption = Optional.ofNullable(request.getParameter("selectedOption")).orElse("START");
            RadioButton radioButton = radioButtonService.getNextRadioButton(selectedOption);
            request.setAttribute("currentOption", radioButton);
            request.getRequestDispatcher("/start.jsp").forward(request, response);
        }
    }
}

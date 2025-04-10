package org.example.quest.servlet;

import org.example.quest.model.RadioButton;
import org.example.quest.service.RadioButtonService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@WebServlet(value = "/mainServlet")
public class MainServlet extends HttpServlet {
protected RadioButtonService radioButtonService = new RadioButtonService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String selectedOption = Optional.ofNullable(request.getParameter("selectedOption")).orElse("START");

        RadioButton radioButton = radioButtonService.getNextRadioButton(selectedOption);

        request.setAttribute("currentOption", radioButton);

        List<RadioButton> radioButtonList = radioButton.getAvalibleRadioButtons();

        if (radioButtonList.isEmpty()) {
            request.setAttribute("currentOption", radioButton);
            request.getRequestDispatcher("/ending.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/start.jsp").forward(request, response);
        }
    }
}


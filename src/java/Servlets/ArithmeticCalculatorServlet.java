/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author param
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String message = "---";
        String first = request.getParameter("first"),
                second = request.getParameter("second");
        int firstInt = 0, secondInt = 0;
        String operator = request.getParameter("operator");
        
        if(first == null || second == null || first.equals("") || second.equals(""))
        message = "invalid";
        try
        {
            firstInt = Integer.parseInt(first);
            secondInt = Integer.parseInt(second);       
            
            
            if (operator.equals("+"))
            {
                message = "" + (firstInt + secondInt);
            }
            else if (operator.equals("-"))
            {
                message = "" + (firstInt - secondInt);
            }
            else if (operator.equals("*"))
            {
                message = "" + (firstInt * secondInt);
            }
            else if (operator.equals("%"))
            {
                message = "" + (firstInt % secondInt);
            }
        }
        catch (Exception ex)
        {
            message = "invalid";
        }
        
        
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        request.setAttribute("operator", operator);        
        request.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp").forward(request, response);
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author param
 */
public class AgeCalculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("age");
        String message = ("Your age next birthday will be ");
        
        request.setAttribute("age", age);
        int ageInt;
        
        if(age == null || age.equals(""))
        {
            message = "You must give your current age";
        }
        else
        {
            try
            {
                ageInt = Integer.parseInt(age); 
                message += (++ageInt);
            }
            catch(Exception e)
            {
                message = "You must enter a number";
            }
        }
        
        
        request.setAttribute("message", message);

        getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp").forward(request, response);
    }


}

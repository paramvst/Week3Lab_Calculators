<%-- 
    Document   : AgeCalculator
    Created on : 23-Sep-2022, 1:10:30 PM
    Author     : param
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="post">
            Enter your age: <input type="int" name="age" value="${age}"><br>
            <input type="submit" value="Age next birthday">
        </form>
            
            ${message}
            
            <nav>
                <a href ="arithmetic">Arithmetic Calculator</a>
            </nav>
              
    </body>
</html>

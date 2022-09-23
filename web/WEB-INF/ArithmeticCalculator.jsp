<%-- 
    Document   : ArithmeticCalculator
    Created on : 23-Sep-2022, 1:10:07 PM
    Author     : param
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            First: <input type="int" name="first" value="${first}"><br>
            Second: <input type="int" name="second" value="${second}"><br>
            <input type="submit" value="+">
            <input type="submit" value="-">
            <input type="submit" value="*">
            <input type="submit" value="%">
        </form>
            
            Result: ${message}
            
            <nav>
                <a href ="age">Age Calculator</a>
            </nav>
              
    </body>
</html>

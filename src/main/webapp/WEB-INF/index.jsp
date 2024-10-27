<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            color: #333;
        }

        h1 {
            color: #4CAF50;
        }

        h3 {
            margin-top: 20px;
        }

        a {
            text-decoration: none;
            color: #4CAF50;
            font-weight: bold;
            margin: 0 10px;
            padding: 10px 20px;
            border: 2px solid #4CAF50;
            border-radius: 5px;
            transition: background-color 0.3s, color 0.3s;
        }

        a:hover {
            background-color: #4CAF50;
            color: white;
        }

        .container {
            text-align: center;
            background: white;
            padding: 50px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Welcome to coMovies Website!</h1>
        <p>This website is my first Java crud application. The purpose of this website is to help me understanding how Java language is working.</p>
        <h3>
            <a href="/movies">Click here to see the list of all the movies</a>
            <a href="/addmoviepage">Click here to add a movie to the list</a>
        </h3>
    </div>
</body>
</html>
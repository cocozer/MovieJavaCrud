<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 20px;
            color: #333;
        }

        h1 {
            color: #4CAF50;
            text-align: center;
        }

        form {
            max-width: 600px;
            margin: auto;
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        label {
            display: block;
            margin-bottom: 10px;
            font-weight: bold;
        }

        input[type="text"], input[type="number"], input[type="date"], textarea {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

        a {
            text-decoration: none;
            color: #4CAF50;
            font-weight: bold;
            display: inline-block;
            margin-top: 20px;
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
            max-width: 800px;
            margin: auto;
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Add a movie to the list</h1>
        <p>
           <!-- <form:errors path="movie.*" cssClass="error" element="div" />-->
        </p>
        <form:form action="/addmovieaction" method="POST" modelAttribute="movie">
            <p>
                <form:label path="movieTitle">Title</form:label>
                <!--<form:errors path="movieTitle"/>-->
                <form:input path="movieTitle"/>
            </p>
            <p>
                <form:label path="movieGenre">Genre</form:label>
                <!--<form:errors path="movieGenre"/>-->
                <form:input path="movieGenre"/>
            </p>
            <p>
                <form:label path="movieDirector">Director</form:label>
                <!--<form:errors path="movieDirector"/>-->
                <form:input path="movieDirector"/>
            </p>
            <p>
                <form:label path="movieDescription">Description</form:label>
                <!--<form:errors path="movieDescription"/>-->
                <form:input path="movieDescription"/>
            </p>
            <p>
                <form:label path="movieRating">Rating</form:label>
                <!--<form:errors path="movieRating"/>-->
                <form:input path="movieRating"/>
            </p>
            <p>
                <form:label path="movieReleaseDate">Release Date</form:label>
                <!--<form:errors path="movieReleaseDate"/>-->
                <form:input path="movieReleaseDate" type="date"/>
            </p>
            <p>
                <form:label path="moviePoster">Poster URL</form:label>
                <!--<form:errors path="moviePoster"/>-->
                <form:input path="moviePoster"/>
            </p>
            <input type="submit" value="Add movie"/>
        </form:form>

        <a href="/movieswelcome">Click here to go back to the home page</a>
        <a href="/movies">Click here to see the list of all the movies</a>
    </div>
</body>
</html>
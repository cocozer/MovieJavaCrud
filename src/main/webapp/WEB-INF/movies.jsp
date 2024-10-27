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
            padding: 20px;
            color: #333;
        }

        h1 {
            color: #4CAF50;
            text-align: center;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 12px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #4CAF50;
            color: white;
        }

        tr:hover {
            background-color: #f1f1f1;
        }

        img {
            border-radius: 5px;
        }

        .container {
            max-width: 1200px;
            margin: auto;
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
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
    </style>
</head>
<body>
    <div class="container">
        <h1>List of all the movies</h1>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Poster</th>
                    <th>Title</th>
                    <th>Genre</th>
                    <th>Release Date</th>
                    <th>Director</th>
                    <th>Rating</th>
                    <th>Edit</th>
                    <th>Delete</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${listOfMovies}" var="movie">
                    <tr>
                        <td><c:out value="${movie.movieId}" /></td>
                        <td><img src="${movie.moviePoster}" alt="${movie.movieTitle}" width="100" height="150"></td>
                        <td><c:out value="${movie.movieTitle}" /></td>
                        <td><c:out value="${movie.movieGenre}" /></td>
                        <td><c:out value="${movie.movieReleaseDate}" /></td>
                        <td><c:out value="${movie.movieDirector}" /></td>
                        <td><c:out value="${movie.movieRating}" /> / 10</td>
                        <td><a href="movie/${movie.movieId}">edit</a></td>
                        <td><form action="remove/${movie.movieId}" method="POST" style="display:inline;">
                            <button type="submit">Delete</button>
                        </form></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="movieswelcome">Click here to go back to the home page</a>
    </div>
</body>
</html>
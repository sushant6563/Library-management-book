<%@ page import="java.util.List" %>
<%@ page import="com.dao.BookDAO" %>
<%@ page import="com.model.Book" %>

<%
    BookDAO dao = new BookDAO();
    List<Book> books = dao.getAllBooks();
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Manage Books</title>
</head>
<body>
    <h1>Manage Books</h1>
    <table border="1">
        <tr>
            <th>Book ID</th>
            <th>Title</th>
            <th>Author</th>
            <th>ISBN</th>
        </tr>
        <% for (Book book : books) { %>
        <tr>
            <td><%= book.getId() %></td>
            <td><%= book.getTitle() %></td>
            <td><%= book.getAuthor() %></td>
            <td><%= book.getIsbn() %></td>
        </tr>
        <% } %>
    </table>
</body>
</html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Manage Books</title>
</head>
<body>
    <h1>Manage Books</h1>
    <table border="1">
        <tr>
            <th>Book ID</th>
            <th>Title</th>
            <th>Author</th>
            <th>ISBN</th>
        </tr>
        <c:forEach var="book" items="${books}">
        <tr>
            <td>${book.id}</td>
            <td>${book.title}</td>
            <td>${book.author}</td>
            <td>${book.isbn}</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>

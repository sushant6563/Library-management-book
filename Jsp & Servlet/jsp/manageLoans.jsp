<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Manage Loans</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="container">
        <h1>Manage Loans</h1>
        <a href="addLoan.jsp" class="btn">Add New Loan</a>
        <table>
            <thead>
                <tr>
                    <th>Loan ID</th>
                    <th>Book ID</th>
                    <th>Member ID</th>
                    <th>Due Date</th>
                </tr>
            </thead>
            <tbody>
                <%
                    // Fetch loans list from the database (pseudo-code)
                    java.util.List<com.model.Loan> loans = com.dao.LoanDAO.getAllLoans();
                    for (com.model.Loan loan : loans) {
                %>
                <tr>
                    <td><%= loan.getLoanId() %></td>
                    <td><%= loan.getBookId() %></td>
                    <td><%= loan.getMemberId() %></td>
                    <td><%= loan.getDueDate() %></td>
                </tr>
                <% } %>
            </tbody>
        </table>
    </div>
</body>
</html>

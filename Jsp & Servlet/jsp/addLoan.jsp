<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Loan</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="container">
        <h1>Add Loan</h1>
        <form action="AddLoanServlet" method="post" class="form">
            <label for="loanId">Loan ID:</label>
            <input type="text" id="loanId" name="loanId" placeholder="Enter Loan ID" required>

            <label for="bookId">Book ID:</label>
            <input type="text" id="bookId" name="bookId" placeholder="Enter Book ID" required>

            <label for="memberId">Member ID:</label>
            <input type="text" id="memberId" name="memberId" placeholder="Enter Member ID" required>

            <label for="dueDate">Due Date:</label>
            <input type="date" id="dueDate" name="dueDate" required>

            <button type="submit" class="btn">Add Loan</button>
        </form>
    </div>
</body>
</html>

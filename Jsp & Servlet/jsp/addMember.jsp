<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Member</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="container">
        <h1>Add Member</h1>
        <form action="AddMemberServlet" method="post" class="form">
            <label for="memberId">Member ID:</label>
            <input type="text" id="memberId" name="memberId" placeholder="Enter Member ID" required>

            <label for="memberName">Member Name:</label>
            <input type="text" id="memberName" name="memberName" placeholder="Enter Member Name" required>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" placeholder="Enter Email Address" required>

            <button type="submit" class="btn">Add Member</button>
        </form>
    </div>
</body>
</html>

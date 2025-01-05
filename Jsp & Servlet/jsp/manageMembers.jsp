<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Manage Members</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="container">
        <h1>Manage Members</h1>
        <a href="addMember.jsp" class="btn">Add New Member</a>
        <table>
            <thead>
                <tr>
                    <th>Member ID</th>
                    <th>Name</th>
                    <th>Email</th>
                </tr>
            </thead>
            <tbody>
                <%
                    // Fetch members list from the database (pseudo-code)
                    java.util.List<com.model.Member> members = com.dao.MemberDAO.getAllMembers();
                    for (com.model.Member member : members) {
                %>
                <tr>
                    <td><%= member.getId() %></td>
                    <td><%= member.getName() %></td>
                    <td><%= member.getEmail() %></td>
                </tr>
                <% } %>
            </tbody>
        </table>
    </div>
</body>
</html>

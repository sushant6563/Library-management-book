<!DOCTYPE html>
<html lang="en">
<head>
    <title>Add Book</title>
</head>
<body>
    <h1>Add a New Book</h1>
    <form action="AddBookServlet" method="post">
        <label for="bookTitle">Book Title:</label>
        <input type="text" id="bookTitle" name="bookTitle" required><br><br>

        <label for="author">Author:</label>
        <input type="text" id="author" name="author" required><br><br>

        <label for="isbn">ISBN:</label>
        <input type="text" id="isbn" name="isbn" required><br><br>

        <button type="submit">Add Book</button>
    </form>
</body>
</html>

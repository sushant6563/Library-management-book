import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class AddBookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("addBook.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bookTitle = request.getParameter("bookTitle");
        String author = request.getParameter("author");
        String isbn = request.getParameter("isbn");

        // Add book to the database (assume BookDAO handles this)
        BookDAO dao = new BookDAO();
        boolean success = dao.addBook(bookTitle, author, isbn);

        if (success) {
            response.sendRedirect("manageBooks.jsp?message=Book+Added+Successfully");
        } else {
            response.sendRedirect("addBook.jsp?error=Unable+to+Add+Book");
        }
    }
}

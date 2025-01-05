import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import com.dao.LoanDAO;
import com.model.Loan;

public class AddLoanServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        String loanId = request.getParameter("loanId");
        String bookId = request.getParameter("bookId");
        String memberId = request.getParameter("memberId");
        String dueDate = request.getParameter("dueDate");

        // Create a new Loan object
        Loan loan = new Loan();
        loan.setLoanId(loanId);
        loan.setBookId(bookId);
        loan.setMemberId(memberId);
        loan.setDueDate(dueDate);

        // Add the loan record to the database
        LoanDAO dao = new LoanDAO();
        boolean success = dao.addLoan(loan);

        // Redirect based on the operation's success
        if (success) {
            response.sendRedirect("manageLoans.jsp?message=Loan+Added+Successfully");
        } else {
            response.sendRedirect("addLoan.jsp?error=Unable+to+Add+Loan");
        }
    }
}

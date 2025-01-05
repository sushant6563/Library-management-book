package SupportDAO;

import com.model.Loan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.util.DBUtil;

public class LoanDAO {
    public boolean addLoan(Loan loan) {
        String sql = "INSERT INTO loans (loan_id, book_id, member_id, due_date) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, loan.getLoanId());
            stmt.setString(2, loan.getBookId());
            stmt.setString(3, loan.getMemberId());
            stmt.setString(4, loan.getDueDate());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
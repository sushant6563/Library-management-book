import static org.junit.Assert.*;
import com.library.dao.LoanDAO;
import com.library.model.Loan;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

public class LoanDAOTest {
    private LoanDAO loanDAO;

    @Before
    public void setUp() {
        loanDAO = new LoanDAO();
    }

    @After
    public void tearDown() {
        // Clean up test data if needed.
    }

    @Test
    public void testAddLoan() {
        Loan loan = new Loan(301, 101, 201, Date.valueOf("2024-12-31"));
        boolean result = loanDAO.addLoan(loan);
        assertTrue("Loan should be added successfully", result);
    }

    @Test
    public void testRetrieveLoan() {
        Loan loan = loanDAO.getLoanById(301);
        assertNotNull("Loan should be retrieved successfully", loan);
        assertEquals(101, loan.getBookId());
    }

    @Test
    public void testDeleteLoan() {
        boolean result = loanDAO.deleteLoan(301);
        assertTrue("Loan should be deleted successfully", result);
    }
}

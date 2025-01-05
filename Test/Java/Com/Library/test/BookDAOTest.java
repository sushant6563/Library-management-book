import static org.junit.Assert.*;
import com.library.dao.BookDAO;
import com.library.model.Book;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BookDAOTest {
    private BookDAO bookDAO;

    @Before
    public void setUp() {
        bookDAO = new BookDAO();
        // Optionally, set up a test database connection here.
    }

    @After
    public void tearDown() {
        // Clean up test data if needed.
    }

    @Test
    public void testAddBook() {
        Book book = new Book(101, "Java Programming", "John Doe", 5);
        boolean result = bookDAO.addBook(book);
        assertTrue("Book should be added successfully", result);
    }

    @Test
    public void testRetrieveBook() {
        Book book = bookDAO.getBookById(101);
        assertNotNull("Book should be retrieved successfully", book);
        assertEquals("Java Programming", book.getTitle());
    }

    @Test
    public void testDeleteBook() {
        boolean result = bookDAO.deleteBook(101);
        assertTrue("Book should be deleted successfully", result);
    }
}

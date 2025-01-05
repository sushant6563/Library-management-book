import static org.junit.Assert.*;
import com.library.dao.MemberDAO;
import com.library.model.Member;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MemberDAOTest {
    private MemberDAO memberDAO;

    @Before
    public void setUp() {
        memberDAO = new MemberDAO();
    }

    @After
    public void tearDown() {
        // Clean up test data if needed.
    }

    @Test
    public void testAddMember() {
        Member member = new Member(201, "Alice", "alice@example.com");
        boolean result = memberDAO.addMember(member);
        assertTrue("Member should be added successfully", result);
    }

    @Test
    public void testRetrieveMember() {
        Member member = memberDAO.getMemberById(201);
        assertNotNull("Member should be retrieved successfully", member);
        assertEquals("Alice", member.getName());
    }

    @Test
    public void testDeleteMember() {
        boolean result = memberDAO.deleteMember(201);
        assertTrue("Member should be deleted successfully", result);
    }
}

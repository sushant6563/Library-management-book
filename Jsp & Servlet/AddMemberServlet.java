import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import com.dao.MemberDAO;
import com.model.Member;

public class AddMemberServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        String memberId = request.getParameter("memberId");
        String memberName = request.getParameter("memberName");
        String email = request.getParameter("email");

        // Create a new Member object
        Member member = new Member();
        member.setId(memberId);
        member.setName(memberName);
        member.setEmail(email);

        // Add the member to the database
        MemberDAO dao = new MemberDAO();
        boolean success = dao.addMember(member);

        // Redirect based on the operation's success
        if (success) {
            response.sendRedirect("manageMembers.jsp?message=Member+Added+Successfully");
        } else {
            response.sendRedirect("addMember.jsp?error=Unable+to+Add+Member");
        }
    }
}

package SupportDAO;


import com.model.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.util.DBUtil;

public class MemberDAO {
    public boolean addMember(Member member) {
        String sql = "INSERT INTO members (member_id, name, email) VALUES (?, ?, ?)";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, member.getId());
            stmt.setString(2, member.getName());
            stmt.setString(3, member.getEmail());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}

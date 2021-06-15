package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDAO() {
		try {
			String URL = "jdbc:mysql://localhost:3306/JK";
			String ID = "root";
			String PWD = "1234";
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, ID, PWD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int login(String uId, String uPwd) {
		String SQL = "select uPwd from user where uId = ?;";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, uId);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				if(rs.getString(1).equals(uPwd))
					return 1; //success
				else
					return 0; // wrong pwd
			}
			return -1; //id ㄴㄴ
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -2; //db오류
	}
	
	public int join(User user) {
		String SQL = "insert into user values(?, ?, ?, ?, ?);";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, user.getuId());
			pstmt.setString(2, user.getuPwd());
			pstmt.setString(3, user.getuName());
			pstmt.setString(4, user.getuGender());
			pstmt.setString(5, user.getuEmail());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1; //db오류
	}

}

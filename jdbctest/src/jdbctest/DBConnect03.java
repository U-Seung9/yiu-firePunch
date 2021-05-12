package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnect03 {
	public static void main(String[] args) {
		try
		{
			String url ="jdbc:mysql://localhost/db?characterEncoding=UTF-8&serverTimeZone=UTC";
			String user ="root";
			String passwd = "1234";
			Connection con = null;
			String sql = "insert into oneline(memo) values(?)";
			PreparedStatement pstmt = null;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(url, user, passwd);
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 4);
			pstmt.setString(1, "�ȳ��ϼ���");
			pstmt.executeUpdate();
			
			pstmt.close();
			con.close();
			System.out.println("DB ��ȸ ����");
			
		}
		catch (SQLException e)
		{
			System.out.println("DB���� ����");
			System.out.println("���� : " + e.getMessage());
		}
		catch (ClassNotFoundException ce)
		{
			System.out.println("Ŭ���� ������");
		}
	}

}

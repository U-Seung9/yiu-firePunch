package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class DBConnect02 {
	public static void main(String[] args) {
		try
		{
			String url ="jdbc:mysql://localhost/db?characterEncoding=UTF-8&serverTimeZone=UTC";
			String user ="root";
			String passwd = "1234";
			Connection con = null;
			String sql = "select * from oneline";
			PreparedStatement pstmt = null;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(url, user, passwd);
			
			pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(); //select
			while(rs.next())
			{
				int no = rs.getInt(1);
				String memo = rs.getString(2);
				String wdate = rs.getString(3);
				
				System.out.println(no + ": " + memo + " :(" + wdate + ")");
			}
			rs.close();
			pstmt.close();
			con.close();
			System.out.println("DB 조회 성공");
			
			con.close();
			System.out.println("DB연결 성공");
		}
		catch (SQLException e)
		{
			System.out.println("DB연결 실패");
			System.out.println("사유 : " + e.getMessage());
		}
		catch (ClassNotFoundException ce)
		{
			System.out.println("클래스 업서요");
		}
	}
}

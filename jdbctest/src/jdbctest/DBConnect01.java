package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect01 {
	
	public static void main(String[] args) {
		try
		{
			String url ="jdbc:mysql://localhost/?characterEncoding=UTF-8&serverTimeZone=UTC";
			String user ="root";
			String passwd = "1234";
			Connection con = null;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(url, user, passwd);
			con.close();
			System.out.println("DB���� ����");
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

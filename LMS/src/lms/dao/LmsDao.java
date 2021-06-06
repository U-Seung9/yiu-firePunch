package lms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;


import lms.controller.HttpUtil;
import lms.dao.LmsDao;

public class LmsDao {
	private static LmsDao dao = new LmsDao();
	private LmsDao() {}
	public static LmsDao getInstance() {
		return dao;
	}
	public Connection connect()
	{
		Connection conn = null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","1234");
		}catch(Exception e) {
			System.out.print("MDAO:connect"+e);
		}
		return conn;
	}
	public void close(Connection conn, PreparedStatement pstmt)
	{
	if(pstmt != null)
	{
		try {
			pstmt.close();
		}catch(Exception e) {
			System.out.print("conn close error"+e);
		}
	}
	if(conn != null)
	{
		try {
			conn.close();
		}catch(Exception e)
		{
			System.out.print("conn close error " + e);
		}
	}
	}
	
	public boolean login(String id, String pwd) {
		// TODO Auto-generated method stub
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			conn = connect();
			if(result)
				pstmt = conn.prepareStatement("select * from prof where id = ? and pwd = ?;");
			else
				pstmt = conn.prepareStatement("select * from prof where id = ? and pwd = ?;");
			pstmt.setString(1, id());
			pstmt.setString(2, pwd());
			rs = pstmt.executeQuery();
			if(rs.next())
			{
				result = true;
			}
			else
				result = false;
		}catch (Exception e)
		{
			System.out.print("login error"+e);
		}
		finally
		{
			close(conn,pstmt);
		}
		return result;
	}
	
	public boolean sLogin(String id, String pwd) {
		// TODO Auto-generated method stub
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			conn = connect();
			pstmt = conn.prepareStatement("select * from student where id = ? and pwd = ?;");
			pstmt.setString(1, id());
			pstmt.setString(2, pwd());
			rs = pstmt.executeQuery();
			if(rs.next())
			{
				result = true;
			}
			else
				result = false;
		}catch (Exception e)
		{
			System.out.print("login error"+e);
		}
		finally
		{
			close(conn,pstmt);
		}
		return result;
	}
	private String pwd() {
		// TODO Auto-generated method stub
		return null;
	}
	private String id() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public boolean search(String id) {
		// TODO Auto-generated method stub
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			conn = connect();
			pstmt = conn.prepareStatement("select id from subject where id = ?;");
			pstmt.setString(1, id());
			rs = pstmt.executeQuery();
			if(rs.next())
			{
				result = true;
			}
		}catch (Exception e)
		{
			System.out.print("error"+e);
		}
		finally
		{
			close(conn,pstmt);
		}
		return result;
	}
	
	public boolean sStudent(String id) {
		// TODO Auto-generated method stub
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			conn = connect();
			pstmt = conn.prepareStatement("select b.id, b.name from enroll a, subject b where a.subject = b.id and a.student='1235';");
			pstmt.setString(1, id());
			rs = pstmt.executeQuery();
			if(rs.next())
			{
				result = true;
			}
		}catch (Exception e)
		{
			System.out.print("error"+e);
		}
		finally
		{
			close(conn,pstmt);
		}
		return result;
	}
	
	public boolean pStudent(String id) {
		// TODO Auto-generated method stub
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			conn = connect();
			pstmt = conn.prepareStatement("select * from subject;");
			pstmt.setString(1, id());
			rs = pstmt.executeQuery();
			if(rs.next())
			{
				result = true;
			}
		}catch (Exception e)
		{
			System.out.print("error"+e);
		}
		finally
		{
			close(conn,pstmt);
		}
		return result;
	}
	
	public boolean pSubject(String id) {
		// TODO Auto-generated method stub
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			conn = connect();
			pstmt = conn.prepareStatement("select prof from subject where name = ?;");
			pstmt.setString(1, id());
			rs = pstmt.executeQuery();
			if(rs.next())
			{
				result = true;
			}
		}catch (Exception e)
		{
			System.out.print("error"+e);
		}
		finally
		{
			close(conn,pstmt);
		}
		return result;
	}

	public boolean pTitle(String id) {
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			conn = connect();
			pstmt = conn.prepareStatement(" select * from subject where id = ?;");
			pstmt.setString(1, id());
			rs = pstmt.executeQuery();
			if(rs.next())
			{
				result = true;
			}
		}catch (Exception e)
		{
			System.out.print("login error"+e);
		}
		finally
		{
			close(conn,pstmt);
		}
		return result;
		
	}
	
	public boolean sEnroll(String id) {
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			conn = connect();
			pstmt = conn.prepareStatement("select id from subject where id = ?;");
			pstmt.setString(1, id());
			rs = pstmt.executeQuery();
			if(rs.next())
			{
				result = true;
			}
		}catch (Exception e)
		{
			System.out.print("login error"+e);
		}
		finally
		{
			close(conn,pstmt);
		}
		return result;
		
	}
	public boolean enroll(String id) {
		// TODO Auto-generated method stub
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			conn = connect();
			pstmt = conn.prepareStatement("insert into subject values=('?', '?', '?', '0');");
			pstmt.setString(1, id());
			rs = pstmt.executeQuery();
			if(rs.next())
			{
				result = true;
			}
		}catch (Exception e)
		{
			System.out.print("login error"+e);
		}
		finally
		{
			close(conn,pstmt);
		}
		return result;
		
	}
}

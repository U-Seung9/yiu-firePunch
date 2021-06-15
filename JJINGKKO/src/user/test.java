

package user;

import java.sql.*;

	public class test{
		public static void main(String args[]) {



			Connection conn;



			try {

				Class.forName("com.mysql.jdbc.Driver").newInstance();

				conn = DriverManager.getConnection(

						"jdbc:mysql://localhost:3306/jk", "root", "1234");

				System.out.println("Success!");

			} catch (SQLException ex) {

				System.out.println("SQLException:" + ex);

			} catch (Exception e) {

				System.out.println("Exception:" + e);

			}

		}

	}

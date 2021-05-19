package twoline;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoTest {
	public static void main(String[] args) {
		OnelineDAO dao = new OnelineDAO();
		OnelineDTO dto = new OnelineDTO();
		
		dto.setMemo("TestTEst");
		dao.insert(dto);
		ArrayList<OnelineDTO> dtos  = dao.getList();
		for(int i = 0; i<dtos.size(); i++) {
			OnelineDTO dt = dtos.get(i);
			System.out.println("No : " + dt.getNo() + ", memo : " + dt.getMemo() + ", date : " + dt.getWdate());
		}
		
	}
}

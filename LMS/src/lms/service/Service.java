package lms.service;

import lms.service.Service;
import lms.dao.LmsDao;
import lms.vo.LmsVO;

public class Service {
	
	private static Service service = new Service();
	private Service() {}
	private LmsDao dao = LmsDao.getInstance();
	public static Service getInstance() {
		// TODO Auto-generated method stub
		return service;
	}

	public boolean login(String id, String pwd) {
		// TODO Auto-generated method stub
		return dao.login(id, pwd);
	}

	public boolean pSubject(String id) {
		// TODO Auto-generated method stub
		return dao.pSubject(id);
	}

	public boolean pTitle(String id) {
		// TODO Auto-generated method stub
		return dao.pTitle(id);
	}
	
	public boolean enroll(String id) {
		// TODO Auto-generated method stub
		return dao.enroll(id);
	}

}

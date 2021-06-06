package lms.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lms.service.Service;

public class PSubjectController implements Controller{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		
		boolean result = Service.getInstance().pSubject(id);
		String msg = null;
		if(result == false)
			msg = "false";
		else
			msg="true";
		request.setAttribute("msg", msg);
		request.setAttribute("rId", id);
		HttpUtil.forward(request, response, "/transfer.jsp");
}
}
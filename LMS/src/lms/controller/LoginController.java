package lms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lms.service.Service;

public class LoginController implements Controller {
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String checkbox = request.getParameter("checkbox");
		
		Service s = Service.getInstance();
		boolean result = s.login(id, pwd);
		String path = null;
		String radioValue= null;
		if(result)
		{
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
			if((radioValue = request.getParameter("regState")) == "Professor")
				path = "/proMenu.jsp";
			else
				path = "/stuMenu.jsp";
		}
		else
		{
			path = "/index.jsp";
		}
		HttpUtil.forward(request, response, path);
	}
		
	
}



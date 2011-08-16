package saif.project.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import saif.project.reg;
import saif.project.regUtil;

public class regSearchAll extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		List<reg> members;
		regUtil regUtility= new regUtil();
		String str= req.getParameter("lastname");
		members=regUtility.getAllData(str);
		req.setAttribute("members", members);
		req.getRequestDispatcher("/searchAll").forward(req, resp);
	}
}
package saif.project.servlet;


import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.DateFormatter;

import saif.project.reg;
import saif.project.regUtil;

public class regInsert extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String str_dob;
		SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		reg newReg= new reg();
		regUtil regUtility=new regUtil();
		newReg.setFirstName((String) req.getParameter("firstname"));
		newReg.setMiddleName((String) req.getParameter("middlename"));
		newReg.setLastName((String) req.getParameter("lastname"));
		//convert the string_birth to date format
		str_dob= (String) req.getParameter("birth");
		Date dob=null;
		try {
			 dob= (Date) df.parse(str_dob);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		newReg.setBirth(dob);
		regUtility.saveData(newReg);
		req.setAttribute("message", "Data Saved.");
		req.getRequestDispatcher("/insert.jsp").forward(req, resp);
	}

}

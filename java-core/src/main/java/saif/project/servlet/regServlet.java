package saif.project.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import saif.project.reg;
import saif.project.regUtil;

public class regServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String lnSearch=req.getParameter("lastnameSearch");
		String searchOption=req.getParameter("search1");
		if((lnSearch!=null)&& (!lnSearch.equals("")) &&(searchOption.equals("Search"))){
			reg data;
			regUtil dataUtil=new regUtil();
			
			data=dataUtil.getData(lnSearch);
			req.setAttribute("fn", data.getFirstName());
			req.setAttribute("mn", data.getMiddleName());
			req.setAttribute("ln", data.getLastName());
			req.setAttribute("dob", data.getBirth());
		}//if there is a search category
		else if((lnSearch!=null)&& (!lnSearch.equals("")) &&(searchOption.equals("SearchAll"))){
			List<reg> members;
			regUtil regUtility= new regUtil();
			members=regUtility.getAllData(lnSearch);
			req.setAttribute("members", members);

		}
		req.getRequestDispatcher("/search.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}

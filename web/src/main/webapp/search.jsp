<%@page import="java.util.List"%>
<%@page import="javax.swing.text.DateFormatter"%>
<%@ page language="java" import="java.lang.String"
	import="saif.project.reg" import="saif.project.regUtil"
	import="java.util.Date" import="java.text.ParseException"
	import="java.text.SimpleDateFormat"%>


<%
	if ((request.getMethod().equals("GET"))
			&& (request.getParameter("lastnameSearch") != null)&&(request.getParameter("Edit")!=null)) {
		
}
%>

<html>
<body>

	<table width="100%" border="0" height="100%">
		<tr>
			<td colspan="2" style="background-color: #FFA500;text-align: center" height="20%">
				<h1>Oslo Tiger Cricket Club</h1></td>
		</tr>
		
		<!-- nevigation  -->
		<tr valign="top">
			<td colspan="2" style="background-color: #FFB600; width:100%; height: 20px text-align: right" text-align="right">
			<a href="/webapp/index.jsp"><b>Home</b></a>
			<a href="/webapp/insert.jsp"><b>New Member</b></a>|
			<a href="/webapp/search.jsp"><b>Search Member</b></a>
			</td>
		</tr>

		<tr valign="top">
			<td style="background-color: #FFD700; width: 15%; text-align: top;" height="70%">
				<b>Menu</b><br /> HTML<br /> CSS<br /> JavaScript</td>
			<td
				style="background-color: #EEEEEE; height: 70%; width: 85%; text-align: top;">
				Content goes here

<!-- Page action and content -->
				<form action="/webapp/search" method="get">
				<%
				String searchOpt=request.getParameter("search1");
				if ((request.getMethod().equals("GET"))
						&& (request.getParameter("lastnameSearch") != null)&&(searchOpt.equals("Search"))) {
					
					String fn=(String) request.getAttribute("fn");
					String ln=(String) request.getAttribute("ln");
					String mn=(String) request.getAttribute("mn");
					Date d=(Date) request.getAttribute("dob");
						%>
						First name:
						<input type="text" name="firstname" value="<%=fn %>">
						<br>
						Middle name:
						<input type="text" name="middlename" value="<%=mn %>">
						<br>			
						Last name:
						<input type="text" name="lastname" value="<%=ln %>">
						<br>			
						Date of birth:
						<input type="date" name="dob" value="<%=d %>">
						<br>			
						<input type="submit" name="Edit" value="Edit">
						<br><br>
						<%
					}
				else if ((request.getMethod().equals("GET"))
						&& (request.getParameter("lastnameSearch") != null)&&(searchOpt.equals("SearchAll"))) {
					
					List<reg> members= (List<reg>) request.getAttribute("members");
					
					for(int i=0;i<members.size();i++)
					{
						reg newMember;
						newMember=members.get(i);
						String fn=newMember.getFirstName();
						%><br>First Name:=<%=fn %>
						<%
					}
				}
				%>
					Last Name: <input type="text" name="lastnameSearch"> 
					<input	type="submit" value="Search" name="search1">
					<input type="submit" value="SearchAll" name="search1">
				</form>



				</td>
		</tr>

		<tr>
			<td colspan="2" height="4%"
				style="background-color: #FFA500; text-align: center;">
				Copyright © 2011 OsloTigerCricketClub.Oslo.no</td>
		</tr>
	</table>
</body>
</html>


<%@ page language="java" import="java.lang.String"%>

<%
	if (request.getMethod().equals("GET")
			&& (request.getParameter("btnSubmit") != null)) {
		String op1 = (String) request.getParameter("opt1");
		if (op1.equals("insert")) {
%>
<jsp:forward page="./insert.jsp" />
<%
	} //opt1
		else if (op1.equals("search")) {
%>
<jsp:forward page="./search.jsp" />
<%
	}//opt2

	} else {
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
			<td colspan="2" style="background-color: #00FF00; width:100%; text-align: right" text-align="right" height="15px">
			<a href="/webapp/index.jsp"><b>Home</b></a><b>|</b>
			<a href="/webapp/insert.jsp"><b>New Member</b></a><b>|</b>
			<a href="/webapp/search.jsp"><b>Search Member</b></a>
			</td>
		</tr>

		<tr valign="top">
			<td style="background-color: #FFD700; width: 15%; text-align: top;" height="70%">
				<b>Menu</b><br /> HTML<br /> CSS<br /> JavaScript</td>
			<td
				style="background-color: #EEEEEE; height: 70%; width: 85%; text-align: top;">
				Content goes here
	<form action="/webapp/index.jsp" method="get">
		Insert: <input type="radio" name="opt1" value="insert"> <br>
		Search and update: <input type="radio" name="opt1" value="search">
		<br> <input type="submit" value="Continue" name="btnSubmit">
	</form>
	
	<table width="100%">
		<tr>
			<td>First name</td>
			<td>Middle name</td>
			<td>Last name</td>
			<td>Date of birth</td>
		</tr>
	</table>
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

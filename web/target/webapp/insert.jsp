<%@ page language="java" import="java.lang.String" import="saif.project.regUtil" import="java.util.Date" import="java.text.ParseException" import="java.text.SimpleDateFormat" %>

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
				<form action="/webapp/insert" method="get">
				<%
			if(request.getMethod().equals("GET")&& (request.getParameter("btnInsert")!=null))
			{
					String msg=(String) request.getAttribute("message");
					%>
					<h1><%=msg %></h1>
					<%
			}
					%>
				
					First Name:
					<input type="text" name="firstname">
					<br>
					Last Name:
					<input type="text" name="lastname">
					<br>
					Middle Name: 
					<input type="text" name="middlename">
					<br>
					Date of Birth:
					<input type="date" name="birth">
					<br>
					<input type="submit" value="Insert" name="btnInsert">
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

<html>
<body>
</body>
</html>

<html>
<head></head>
<body>
<%@ page language ="java" %>
<%
double dist = Double.parseDouble(request.getParameter("dist"));
double time = Double.parseDouble(request.getParameter("time"));
double radio = 0;
double sedan = 0;
double hatchback = 0;
double outstation = 0;
if (dist<=3.0)
{
	radio=69.0*dist;
	outstation=69.0*dist;
}
else if(dist>3.0)
{
	radio=207.0+16*(dist-3);
	outstation=207.0+16*(dist-3);
}
sedan=59.0+10.0*dist+1.50*time;
hatchback=49.0+8.0*dist+1.50*time;

response.sendRedirect("respMeruCalc.jsp");
session.setAttribute("cost","radio taxi = Rs." + radio +  "sedan = Rs." + sedan + "hatchback = Rs." + hatchback+ "outstation = Rs." + outstation);
%>
</body>
</html>
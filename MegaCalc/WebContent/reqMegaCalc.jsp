<html>
<head></head>
<body>
<%@ page language ="java" %>
<%
double dist = Double.parseDouble(request.getParameter("dist"));
double time = Double.parseDouble(request.getParameter("time"));
double megacab = 0;

if (dist<=3.0)
{
	megacab=23.0+69.0*dist;
}
else if(dist>3.0)
{
	megacab=23.0+207.0+23.0*(dist-3);
}

response.sendRedirect("respMegaCalc.jsp");
session.setAttribute("cost","mega cab = Rs." + megacab);
%>
</body>
</html>
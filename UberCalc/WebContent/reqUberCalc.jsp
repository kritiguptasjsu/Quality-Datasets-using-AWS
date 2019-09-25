<html>
<head></head>
<body>
<%@ page language ="java" %>
<%
double dist = Double.parseDouble(request.getParameter("dist"));
double time = Double.parseDouble(request.getParameter("time"));
double black = 0;
double hire_xl = 0;
double hire = 0;
double go = 0;
double xl = 0;
double uberpool = 0;
double premier = 0;

black = 9.0 + 3.0*(time) + 21.0*(dist);
hire_xl = 40.9 + 2.62*(time) + 17.85*(dist);
hire = 41.25 + 2.62*(time) + 11.55*(dist);
go = 52.5 + 2.10*(time) + 6.30*(dist);
xl = 84.0 + 2.10*(time) + 16.8*(dist);
uberpool = 52.5 + 2.10*(time) + 6.30*(dist);
premier = 68.25 + 1.58*(time) + 9.45*(dist);

response.sendRedirect("respUberCalc.jsp");
session.setAttribute("cost","black = Rs." + black +  "hire_xl = Rs." + hire_xl + "hire = Rs." + hire+ "go = Rs." + go+"xl = Rs." + xl+"uber pool = Rs." + uberpool +"premier = Rs." + premier);
%>
</body>
</html>
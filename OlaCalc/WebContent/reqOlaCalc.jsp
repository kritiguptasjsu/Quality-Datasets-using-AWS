<html>
<head></head>
<body>
<%@ page language ="java" %>
<%
double dist = Double.parseDouble(request.getParameter("dist"));
double time = Double.parseDouble(request.getParameter("time"));
double prime_sedan=0;
double mini = 0;
double micro = 0;
double lux = 0;
if(dist <= 20.0){
	prime_sedan = 50.0 +dist*(10.0) + time;
	mini = 50.0 + dist*(8.0) + time;
	micro = 40.0 + dist*(6.0) + time*(1.5);
	lux = 300.0 + dist*(25.0) + time*(3.0);
}
else if(dist > 20.0){
	prime_sedan = 50.0 + 200.0 + (dist-20.0)*(14.0) + time;
	mini = 50.0 + 160.0 + (dist-20.0)*(13.0) + time;
	micro = 40.0 + 120.0 + (dist-20.0)*(12.0) + time*(1.5);
	lux = 300.0 + 500.0 + (dist-20.0)*(30.0) + time*(3.0);
}

response.sendRedirect("respOlaCalc.jsp");
session.setAttribute("cost","Prime Sedan = Rs." + prime_sedan + "\n" + "Mini = Rs." + mini + "\n" +"Micro = Rs." + micro+ "\n" +"Lux = Rs." + lux);
%>
</body>
</html>
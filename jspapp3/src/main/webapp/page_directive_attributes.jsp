<%@page import="java.time.LocalDate"%>
<%@ page info="This is Welcome JSP Page"%>
<%@ page import="java.util.*" %>
<% 
out.println("<h1>"+getServletInfo()+"</h1>");
out.println("<h1>"+new Date()+"</h1>");
out.println("<h1>"+LocalDate.now()+"</h1>");
%>
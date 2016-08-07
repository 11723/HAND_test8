
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
 <%@ page import="com.hand.entities.Film" %>
<%@ page import="java.util.List" %>
  <%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
  %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>FirstJSP</title>
</head>
<body>
    <table align="center" border="1px" cellpadding="5px"  cellspacing="0px" width="80%" text-align="left" >
        <tr>
            <th>ID</th>
            <th>标题</th>
            <th>描述</th>
            <th>删除记录</th>
            <th>修改</th>
        </tr>

<%
     List<Film> lists = (List<Film>) request.getAttribute("lists");
    for (Film film : lists){
%>
             <tr>
                 <td><%= film.getId()%></td>
                 <td><%=film.getTitle() %></td>
                <td><%=film.getDescription() %></td>
                 
                
                <td><a href=<%="/DeleteServlet?title="+ film.getTitle()%>>删除本条记录</a></td> 
                  <td><a href="<%= request.getContextPath() %>/da1/updateService.jsp">修改</a> </td>
            </tr>

        <%
            }
        %>

        </table>
</body>
</html>

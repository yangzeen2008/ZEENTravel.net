<%--
  Created by IntelliJ IDEA.
  User: Zeen
  Date: 1/21/2020
  Time: 1:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<body>
<%
    String site = new String("product/findAll2.do");
    response.setStatus(response.SC_MOVED_TEMPORARILY);
    response.setHeader("Location", site);
%>

</body>
</html>

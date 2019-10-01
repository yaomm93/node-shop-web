<%--
  Created by IntelliJ IDEA.
  User: yaomm
  Date: 2019/9/28
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
</head>
<body>
    <br/>
    <div style="margin-left:400px">
        view-address.jsp <br>
        <c:forEach items="${addresses}" var="address">
            <h5>收件人:${address.name}</h5>
            <h5>收件地址:${address.city}${address.street}</h5>
            <h5>联系电话:${address.mobile}</h5>
            <h5>邮编:${address.zipcode}</h5>
            <h5>默认地址:${address.use}</h5>
        </c:forEach>
    </div>
</body>
</html>

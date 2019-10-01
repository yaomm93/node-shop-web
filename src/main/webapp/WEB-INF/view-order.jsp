<%--
  Created by IntelliJ IDEA.
  User: yaomm
  Date: 2019/9/28
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <div align="align" style="margin-left:400px">
        view-order.jsp<br>
        <h5>您的订单已经生成</h5>
        <h5>订单号:${order.id}</h5>
        <h5>商品：${order.goodsName}</h5>
    </div>
</body>
</html>

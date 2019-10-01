<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <script type="text/javascript">
        var URL_PREFIX="${pageContext.request.contextPath}";
        function buyGoods(userId,name,price,amount){
            window.location.href= URL_PREFIX +"/shop/buy?userId="+userId
                +"&name="+name
                +"&price="+price
                +"&amount="+amount;
        }
        function showAddress(userId){
            window.location.href= URL_PREFIX +"/shop/addresses?userId="+userId;
        } </script>
</head>
<body>
<div style="margin-left:400px">
    <table border="1" cellpadding="1" cellspacing="1" width="60%">
        <p>商品列表</p>    </table>
</div>
购买按钮 <tr>

    <td>iphone</td>
    <td>5000</td>
    <td>20</td>
    <td><a href="javascript:void(0)" onClick="buyGoods(1,'iphone','5000','1')"/>购买</td> </tr>
我的收件地址
<div style="margin-left:450px">
    <a href="javascript:void(0)" onClick="showAddress(2)" >我的收件地址</a>
</div>
</body>
</html>

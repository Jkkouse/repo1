<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/31
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>订单管理</title>
    <base href="http://localhost:9999/demo1/">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container">
        <table class="table">
            <thead>
                <th>采购单编号</th>
                <th>采购人</th>
                <th>申请部门</th>
                <th>申请人</th>
                <th>说明</th>
                <th>采购总价</th>
                <th>创建时间</th>
                <th>订单状态</th>
                <th>操作</th>
            </thead>
            <tbody id="mytbody">

            </tbody>
        </table>
    </div>
</body>
<script>
    //订单数据
    var orderdata

    $(function () {
        selAllPurOrder()
    })

    function selAllPurOrder(){
        $.ajax({
            url: "pur/selAllPurOrder",
            type: "post",
            dataType: "json",
            success: function (data) {
                orderdata = data
                for (var i in data){
                    var tr = "<tr>"
                    tr+= "<td>"+data[i].purno+"</td>"
                    tr+= "<td>"+data[i].purman+"</td>"
                    tr+= "<td>"+data[i].applydep+"</td>"
                    tr+= "<td>"+data[i].applyman+"</td>"
                    tr+= "<td>"+data[i].description+"</td>"
                    tr+= "<td>"+data[i].buymoney+"</td>"
                    tr+= "<td>"+data[i].createtime+"</td>"
                    tr+= "<td>"+data[i].purstatus+"</td>"
                    tr+= "<td><button class='btn btn-primary'>查看订单详情</button></td>"
                    tr+= "</tr>"
                    $("#mytbody").append(tr)
                }
            }
        })
    }
</script>
</html>

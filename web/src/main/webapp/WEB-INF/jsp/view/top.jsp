<%--
  Created by IntelliJ IDEA.
  User: GG
  Date: 2018/5/26
  Time: 13:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>


</head>
<body>
<div >
    <canvas id="canvas" style="position:fixed;z-index:-2;height:auto;width: 100%; "></canvas>
</div>

<div id="header" class="container bg-fff">
    <div class="row">
        <div class="col-md-1 col-sm-0"></div>
        <div class="col-md-8 col-sm-10">
            <nav class="navbar navbar-default bg-fff" role="navigation">
                <div class="container-fluid">
                    <div>
                        <ul class="nav navbar-nav">
                            <li>
                                <div class="navbar-header">
                                    <a id="logo" class="navbar-brand" href="#">Logo</a>
                                </div>
                            </li>
                            <li>
                                <a href="#"><b>首页</b></a>
                            </li>
                            <li>
                                <a href="#">广场</a>
                            </li>
                            <li>
                                <a href="#wirte">发贴</a>
                            </li>
                            <li>
                                <form class="navbar-form navbar-left" role="search">
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="Search" size="32">
                                    </div>
                                    <button type="button" class="btn btn-default" id="search">寻找</button>
                                </form>
                            </li>
                        </ul>

                    </div>
                </div>
            </nav>
        </div>
        <div class="col-md-2 col-sm-2">
            <c:if test="${ empty user}">
                <ul class="nav navbar-nav">
                    <li class="top_li"><span id="registerBtn">[&nbsp;&nbsp;注册&nbsp;&nbsp;]</span></li>
                    <li class="top_li"><span id="loginBtn" onclick="login()">[&nbsp;&nbsp;登录&nbsp;&nbsp;]</span></li>
                </ul>
            </c:if>
            <c:if test="${ not empty user}">
                <ul class="nav navbar-nav">
                    <li class="top_li"><span >[&nbsp;&nbsp;欢迎：&nbsp;&nbsp;]</span></li>
                    <li class="top_li" id="user_parent">
                        <span>[&nbsp;&nbsp;${user.userName}&nbsp;&nbsp;]</span>
                        <dl id="user_child">
                            <dd>
                                <a href="/admin/">个人管理</a>
                            </dd>
                            <dd>
                                <a href="">安全退出</a>
                            </dd>
                        </dl>
                    </li>
                </ul>
            </c:if>
        </div>
        <div class="col-md-1 col-sm-0"></div>
    </div>
</div>
</body>

<script>
function login() {
    window.location.href="/login";
}

</script>
</html>
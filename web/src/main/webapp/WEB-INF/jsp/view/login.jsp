<%--
  Created by IntelliJ IDEA.
  User: GG
  Date: 2018/5/26
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <link rel="stylesheet" href="/static/css/login.css">
</head>
<canvas id="canvas" style="position:absolute;z-index:-1;"></canvas>

<body>
<form  id="myform">
<div id="login">
    <dl class="admin_login">

        <dt>
            <strong>LOGIN</strong>
        </dt>
        <dd class="user_icon">
            <input type="text" name="loginName" id='username' placeholder="账号" class="login_txtbx"/>
        </dd>
        <dd class="pwd_icon">
            <input type="password" name="loginPwd"  id="password" placeholder="密码" class="login_txtbx"/>
        </dd>

        <dd class="val_icon">
            <div class="checkcode">
                <input type="text" name=""  id="J_codetext" placeholder="验证码" maxlength="4" class="login_txtbx">
                <canvas class="J_codeimg" id="myCanvas" onclick="createCode()">对不起，您的浏览器不支持canvas，请下载最新版浏览器!</canvas>
            </div>
            <input type="button" value="点击更换" class="ver_btn" onClick="validate();">
        </dd>
        <dd>
            <button id="bs"  type="button"  value="立即登陆" class="submit_btn"/>登录</button>
        </dd>
        <dd>
            <p>© 2018 版权所有</p>
        </dd>

    </dl>
</div>
</form>
</body>
<script src="/static/js/base.js"></script>
<script src="/static/js/login.js"></script>
</html>
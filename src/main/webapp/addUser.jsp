<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>添加用户</title>
    


  </head>
  
  <body>
   <form action="/testSSM/userController/addUser.do" method="post" style="text-align:center" >
   账号：<input type="text" name="username" /><br>
   密码 ：<input type="text" name="userpwd" /><br>
   <input type="submit" value="确定" />
   </form>
  </body>
</html>

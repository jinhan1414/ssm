<html>
<%@ page isELIgnored="false" %> <!-- 启用el表达式 ，以便 可以进行\${}这类的操作-->
<head>
    <script src="https://cdn.bootcss.com/sockjs-client/1.1.4/sockjs.js"></script>
    <script src="https://cdn.bootcss.com/stomp.js/2.3.3/stomp.js"></script>
    <link rel='stylesheet' href='webjars/bootstrap/css/bootstrap.min.css'>  
    <!-- 注意
    webjars/bootstrap/css/bootstrap.min.css 与
    /webjars/bootstrap/css/bootstrap.min.css是有区别的，
    / 开头的代表以根路径作为起始目录，否则就是以当前目录作为起始目录
    
     -->
</head>
<body>
<h2>site say : ${name} Hello !</h2>
</body>
</html>


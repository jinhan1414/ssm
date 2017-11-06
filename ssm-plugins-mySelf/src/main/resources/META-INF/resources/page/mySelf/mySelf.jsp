
<html>
<%@ page isELIgnored="false"  contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <link rel='stylesheet' href='webjars/bootstrap/css/bootstrap.min.css'> 
    <link rel='stylesheet' href="public/css/mySelf.css" >
    <script src="webjars/jquery/jquery.js"></script>
    <title>个人简介</title>
</head>
<body>
<div class='leftDiv'>
  <div id='baseInformation'>
    <div id="person">
      <img alt="head" src="public/image/head/${personDO.head}.jpg" id="selfHead"/>
      <div id="personInformation">
        <label class="label_br">姓名：<span>${personDO.name}</span></label>
        <label class="label_br">性别：<span>${personDO.sex}</span></label>
        <label class="label_br">学历：<span>${personDO.education}</span></label>
        <label class="label_br">位置：<span>${personDO.address}</span></label>
        <label class="label_br">email: <span>${personDO.email}</span></label>
      </div>
    </div>
      
    <div id="works">
      <label class="label_br" style="margin-right: 10px;">作品</label>
      
      <div style="margin-left: 30px;">
      <c:forEach var="workDO" items="${workDOs}" >      
	        <div class="work" >
	          <img alt="作品1" src="public/image/works/${workDO.icon}" class="workImage"/>
	          <a style="writing-mode: vertical-rl;font-size: 15px;" href="${workDO.url}">${workDO.name}</a>
	        </div>
      </c:forEach>  
        
      </div>
      
    </div>
  
  </div>
  
  <div id='projectExperiences'>
    <label   style="font-size:20px;margin-left: 50px;">项目经历</label>
    <ul>
      <c:forEach var="projectDO" items="${projectDOs}">
	      <li class="project">
	        <a href="${projectDO.url}">${projectDO.name}</a>
	        <p>${projectDO.overView}</p>
	      </li>
      </c:forEach>
    </ul>
  </div>
  
  <div id='skills' >
    <label  style="font-size:20px;margin-left: 50px;">我的技术栈</label>
    <ul>
    
      <c:forEach var="skillDO" items="${skillDOs }">
        <li class="skill">
        <a href="#">${skillDO.direction }</a>
        <ul class="skillLevels">
          <c:forEach var="skillLevelDO" items="${skillDO.skillLevels }">
            <li class="skillLevel">${skillLevelDO.name }</li>
          </c:forEach>
        </ul>
      </li>
      </c:forEach>
      
    </ul>
  </div>
</div>

<div class='rightDiv'>
  <div id="sideBar">
      <c:forEach var="articeDO" items="${articeDOs }">
        <a href="${articeDO.url }" class="a_br">${articeDO.title }</a>
      </c:forEach>
    
  </div>

</div>
  
</body>
</html>


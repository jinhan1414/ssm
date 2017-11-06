<%@ page language="java" contentType="text/html; charset=utf8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>简介管理</title>
  <link rel="stylesheet" href="webjars/zTree/css/zTreeStyle/zTreeStyle.css" type="text/css">
  <link rel="stylesheet" href="webjars/bootstrap/css/bootstrap.min.css" type="text/css">
  <script type="text/javascript" src="webjars/jquery/jquery.js"></script>
  <script type="text/javascript" src="webjars/zTree/js/jquery.ztree.core.js"></script>
  <SCRIPT LANGUAGE="JavaScript">
   var zTreeObj;
   var zTreeObj2;
   // zTree 的参数配置，深入使用请参考 API 文档（setting 配置详解）
   var setting = {};
   // zTree 的数据属性，深入使用请参考 API 文档（zTreeNode 节点数据详解）
   var zNodes = [
     {
	   "name":"个人基本信息",
	   "contant":"*****"
	   },{
    	  "name":"项目经历"
      },{
    	  "name":"技术栈"
      },{
    	  "name":"侧栏链接"
      }
   ];
   $(document).ready(function(){
      zTreeObj = $.fn.zTree.init($("#treeDemo"), setting, zNodes); 
      zTreeObj2 = $.fn.zTree.init($("#treeDemo2"), setting, zNodes);
   });
  </SCRIPT>
</head>
<body>

<div class="container">
  <div class="row">
  	<div class="col-md-2">
	  <ul id="treeDemo" class="ztree"></ul>
	</div>
	
	<div class="col-md-10">
	  <ul id="treeDemo2" class="ztree"></ul>
	</div>
  </div>

<div>
	<label for="personName">个人姓名：</label>
	<input id="personName" />
	
	<label for="personSex">性别：</label>
	<select id="personSex" >
	  <option value="man">男</option>
	  <option value="woman">女</option>
	</select>
	
	<label for="personEducation">学历：</label>
	<select id='personEducation'>
	  <option value="05">普通全日制本科</option>
	</select>
	
	<label for="personAddress">位置：</label>
	<input id="personAddress" />
	
	<label for="personEmail">邮箱：</label>
	<input id="personEmail" />
</div>

</div>
</div>
</body>
</html>
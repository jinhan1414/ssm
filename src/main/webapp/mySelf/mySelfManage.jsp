<%@ page language="java" contentType="text/html; charset=utf8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>简介管理</title>
  <link rel="stylesheet" href="webjars/zTree/css/zTreeStyle/zTreeStyle.css" type="text/css">
  <link rel="stylesheet" href="webjars/bootstrap/css/bootstrap.min.css" type="text/css">
  <link rel="stylesheet" href="public/css/ztreeForOutLook.css" type="text/css">
  <script type="text/javascript" src="webjars/jquery/jquery.js"></script>
  <script type="text/javascript" src="webjars/zTree/js/jquery.ztree.core.js"></script>
  <SCRIPT LANGUAGE="JavaScript">
   var manageTree;
   // zTree 的参数配置，深入使用请参考 API 文档（setting 配置详解）
   var setting = {};
   // zTree 的数据属性，深入使用请参考 API 文档（zTreeNode 节点数据详解）
   var zNodes = [
     {
	   "name":"个人基本信息"
	   },{
    	  "name":"项目经历"
      },{
    	  "name":"技术栈"
      },{
    	  "name":"侧栏链接"
      }
   ];
   
   $(document).ready(function(){
      manageTree = $("#manageTree");
      $.fn.zTree.init($("#manageTree"), setting, zNodes);
   });
  </SCRIPT>
  
</head>
<body>

<div class="container-fluid">

  <div class="row">
  
      <div class="col-md-2">
        <ul id="manageTree" class="ztree"></ul>
      </div>
      <div class="col-md-10">
      <div class="row">
	    <p class="h3">基本信息</p>
		<div class="">
			<label for="personName" >个人姓名：</label>
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
	
	<div class="row">
	    <p class="h3">项目经历</p>
		<div>
		  <div row="row">
		    
		    <label >项目名称：<input class="projectName"></input></label>
			<label >项目url：<input class="projectUrl"></input></label>
			<label class="col-md-12">项目内容：<textarea class="projectContent col-md-12"></textarea></label>
			<div class="relativeSkillStack">
			  <p class="h4">关联技术栈</p>
			  <ul>
			    <li>spring</li>
			    <li>spring</li>
			    <li>spring</li>
			  </ul>
			</div>
		  </div>
	
		</div>
	</div>
	
	<div class="row">
	    <p class="h3">技术栈</p>
		<div>
		  <div>
		    <label>方向：<input></input></label>
		    <div>
		    <label>技术：</label>
		      <ul>
		        <li>调试</li>
		      </ul>
		    </div>
		  </div>		
			
		</div>
	</div>
	
	<div class="row">
	    <p class="h3">侧栏链接</p>
		<div>
		  <div>
		    <label>标题：<input></input></label>
	        <label>url：<input></input></label>
		  </div>		
			
		</div>
	</div>
	
	</div>
  </div>
</div>

</body>
</html>
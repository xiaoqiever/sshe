<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
<title>电力交易数据统计系统</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="jslib/jquery-easyui-1.4.2/jquery.min.js"></script>
<script type="text/javascript" src="jslib/jquery-easyui-1.4.2/jquery.easyui.min.js"></script>
<script type="text/javascript" src="jslib/jquery-easyui-1.4.2/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" href="jslib/jquery-easyui-1.4.2/themes/bootstrap/easyui.css" type="text/css"></link>
<link rel="stylesheet" href="jslib/jquery-easyui-1.4.2/themes/icon.css" type="text/css"></link>
<link rel="stylesheet" href="jslib/jquery-easyui-1.4.2/themes/color.css" type="text/css"></link>
<script type="text/javascript" src="jslib/ghUtil.js"></script>

</head>
<body class="easyui-layout">
	<div data-options="region:'north'" style="height:60px">
		<h1>电力交易数据统计系统</h1>
	</div>
	<div data-options="region:'south'" style="height:30px"></div>
	<div data-options="region:'west',title:'功能导航'" style="width:250px">
		<jsp:include page="layout/west.jsp"></jsp:include>
	</div>
	<div data-options="region:'east',title:'east'" style="width:200px"></div>
	<div data-options="region:'center',title:'电力交易数据统计'">
		<jsp:include page="layout/center.jsp"></jsp:include>
	</div>
	<jsp:include page="user/login.jsp"></jsp:include>
	<jsp:include page="user/reg.jsp"></jsp:include>
</body>
</html>

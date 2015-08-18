<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<script type="text/javascript">
	$(function() {
		$('#admin_jhsjdr_upload').dialog({
		    title: '计划数据导入',
		    width: 400,
		    height: 200,
		    closed: false,
		    cache: false,
		    href: '',
		    modal: true
		});
		$('#admin_jhsjdr_datagrid').datagrid({
			url : '',
			toolbar: [{
				iconCls: 'icon-edit',
				handler: function(){$('#admin_jhsjdr_upload').dialog('refresh', '');}
			},'-',{
				iconCls: 'icon-help',
				handler: function(){alert('help');}
			}],
			columns : [ [ {
				field : 'code',
				title : '发电企业',
				width : 150
			}, {
				field : 'name',
				title : '电力用户',
				width : 150
			}, {
				field : 'price',
				title : '交易电量',
				width : 150				
			}, {
				field : 'price',
				title : '浮动电价',
				width : 150				
			}, {
				field : 'price',
				title : '合计',
				width : 150				
			} ] ]
		});
	});
</script>
<div id="admin_jhsjdr_upload"><input type="file"></div>
<table id="admin_jhsjdr_datagrid"></table>


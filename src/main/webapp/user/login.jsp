<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript">
	$(function() {
		$('#user_login_loginForm').form({
			url : '${pageContext.request.contextPath}/userAction!login.action',
			success : function(data) {
				var obj = jQuery.parseJSON(data);
				if (obj.success) {
					$('#user_login_loginDialog').dialog('close');
				}
				$.messager.show({
					title : '提示',
					msg : obj.msg
				});
			}
		});
		$('#user_login_loginForm input').bind('keyup', function(event) {
			//13代表回车
			if (event.keyCode == '13') {
				$(user_login_loginForm).submit();
			}
		});

		window.setTimeout(function() {
			$('#user_login_loginForm input[name=name]').focus();
		}, 0);

	});
</script>
<div id="user_login_loginDialog" class="easyui-dialog" data-options="title:'登录',modal:true,closable:false,buttons:[{
				text:'注册',
				handler:function(){
				  $('#user_reg_regForm input').val('');
				  $('#user_reg_regDialog').dialog('open');
				}
			},{
				text:'登录',
				handler:function(){
					 $(user_login_loginForm).submit();
				}
			}]">
	<form id="user_login_loginForm" method="post">
		<table>
			<tr>
				<th>用户名</th>
				<td><input name="name" class="easyui-validatebox" data-options="required:true"></td>
			</tr>
			<tr>
				<th>密码</th>
				<td><input name="pwd" type="password" class="easyui-validatebox" data-options="required:true"></td>
			</tr>
		</table>
	</form>
</div>
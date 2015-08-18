<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript">
$(function() {	
	$('#user_reg_regForm').form({
		url:'${pageContext.request.contextPath}/userAction!reg.action',
   		success:function(data){ 	
    		var obj = jQuery.parseJSON(data);
    		if (obj.success) {
    			$('#user_reg_regDialog').dialog('close');	
    		}
    		$.messager.show({
    			title : '提示',
    			msg : obj.msg
    		});
   		}
	  });
	$('#user_reg_regForm input').bind('keyup', function(event) {
		//13代表回车
		if( event.keyCode == '13') {
			$(user_reg_regForm).submit();
		}
	});
});
</script>
<div id="user_reg_regDialog" class="easyui-dialog" data-options="title:'注册',closed:true,modal:true,buttons:[{
				text:'注册',
				handler:function(){
				  $(user_reg_regForm).submit();
				}
			}]">
	<form id="user_reg_regForm" method="post">
		<table>
			<tr>
				<th>用户名</th>
				<td><input name="name" class="easyui-validatebox" data-options="required:true">
				</td>
			</tr>
			<tr>
				<th>密码</th>
				<td><input name="pwd" type="password" class="easyui-validatebox" data-options="required:true">
				</td>
			</tr>
			<tr>
				<th>重复密码</th>
				<td><input name="repwd" type="password" class="easyui-validatebox" data-options="required:true,validType:'eqPwd[\'#user_reg_regForm input[name=pwd]\']'">
				</td>
			</tr>
		</table>
	</form>
</div>
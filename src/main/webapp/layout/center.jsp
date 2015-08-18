<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<script type="text/javascript">
	function addTab(opts){
		var t = $('#layout_center_centerTabs');
		if(t.tabs('exists',opts.title)){
			t.tabs('select',opts.title);
		}else{
			t.tabs('add',opts);
		}
		
	}
</script>

<div id="layout_center_centerTabs" class="easyui-tabs" data-options="fit:true,border:false">
	<div title="首页">发答复</div>
</div>
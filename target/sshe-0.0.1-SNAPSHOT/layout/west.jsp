<%@ page language="java" pageEncoding="UTF-8"%>
<div class="easyui-accordion" data-options="fit:true,border:false">
	<div title="系統导航" data-options="iconCls:'icon-save'" style="overflow:auto;padding:10px;">
		<ul class="easyui-tree" data-options="
			url:'${pageContext.request.contextPath}/menuAction!getAllTreeNode.action',
			parentField:'pid',
			lines:true,
			onClick : function(node) {
				console.info(node);
				if(node.attributes.url){
					var url = '${pageContext.request.contextPath}' + node.attributes.url;
					addTab({
						title : node.text,
						closable:true,
						href : url
					});
				}				
			}
			">
		</ul>
	</div>
</div>
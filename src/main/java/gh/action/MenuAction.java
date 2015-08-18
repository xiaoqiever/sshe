package gh.action;

import org.apache.log4j.Logger;

import gh.pageModel.Menu;
import gh.service.MenuServiceI;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;

@Namespace("/")
@Action(value = "menuAction")
public class MenuAction extends BaseAction implements ModelDriven<Menu> {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(MenuAction.class);

	private Menu menu = new Menu();
	
	private MenuServiceI menuService;
	
	public MenuServiceI getMenuService() {
		return menuService;
	}

	@Autowired
	public void setMenuService(MenuServiceI menuService) {
		this.menuService = menuService;
	}

	@Override
	public Menu getModel() {
		return null;
	}
	
	public void getTree(){
		//异步获取树节点
		logger.info(menu.getId());
		super.writeJson(menuService.getTree(menu.getId()));	
	}

	public void getAllTreeNode(){
		super.writeJson(menuService.getAllTreeNode());	
	}
}

package gh.service;

import gh.pageModel.Menu;

import java.util.List;

public interface MenuServiceI {
	
	public List<Menu> getTree(String id);
	
	public List<Menu> getAllTreeNode();

}

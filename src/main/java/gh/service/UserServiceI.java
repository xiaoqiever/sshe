package gh.service;

import gh.pageModel.DataGrid;
import gh.pageModel.User;

public interface UserServiceI {
	
	public User save(User user);

	public User login(User user);

	public DataGrid datagrid(User user);

	public void remove(String ids);

	public User edit(User user);

}

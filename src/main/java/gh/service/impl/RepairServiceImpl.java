package gh.service.impl;

import gh.dao.BaseDaoI;
import gh.model.Tmenu;
import gh.model.Tuser;
import gh.service.RepairServiceI;
import gh.util.Encrypt;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("repairService")
public class RepairServiceImpl implements RepairServiceI {

	private BaseDaoI<Tmenu> menuDao;

	public BaseDaoI<Tmenu> getMenuDao() {
		return menuDao;
	}

	@Autowired
	public void setMenuDao(BaseDaoI<Tmenu> menuDao) {
		this.menuDao = menuDao;
	}

	private BaseDaoI<Tuser> userDao;

	public BaseDaoI<Tuser> getUserDao() {
		return userDao;
	}

	@Autowired
	public void setUserDao(BaseDaoI<Tuser> userDao) {
		this.userDao = userDao;
	}

	@Override
	public void repair() {
		
		repairUser();
		
		repairMenu();
	}

	private void repairMenu() {
		Tmenu root = new Tmenu();
		root.setId("sy");
		root.setText("首页");
		root.setUrl("");
		menuDao.saveOrUpdata(root);
		
		Tmenu dybbtb = new Tmenu();
		dybbtb.setId("1dybbtb");
		dybbtb.setText("当月报表填报");
		dybbtb.setTmenu(root);
		dybbtb.setUrl("");
		menuDao.saveOrUpdata(dybbtb);
		
		Tmenu jhsjdr = new Tmenu();
		jhsjdr.setId("1jhsjdr");
		jhsjdr.setText("计划数据导入");
		jhsjdr.setTmenu(dybbtb);
		jhsjdr.setUrl("/admin/jhsjdr.jsp");
		menuDao.saveOrUpdata(jhsjdr);
		
		Tmenu ywsjdr = new Tmenu();
		ywsjdr.setId("2ywsjdr");
		ywsjdr.setText("营销业务数据导入");
		ywsjdr.setTmenu(dybbtb);
		ywsjdr.setUrl("");
		menuDao.saveOrUpdata(ywsjdr);
		
		Tmenu cjhzb = new Tmenu();
		cjhzb.setId("3cjhzb");
		cjhzb.setText("直接交易成交汇总表生成");
		cjhzb.setTmenu(dybbtb);
		cjhzb.setUrl("");
		menuDao.saveOrUpdata(cjhzb);
		
		Tmenu sdqkb = new Tmenu();
		sdqkb.setId("4sdqkb");
		sdqkb.setText("直接交易试点情况表生成");
		sdqkb.setTmenu(dybbtb);
		sdqkb.setUrl("");
		menuDao.saveOrUpdata(sdqkb);
		
		Tmenu tjb = new Tmenu();
		tjb.setId("5tjb");
		tjb.setText("直接交易统计表生成");
		tjb.setTmenu(dybbtb);
		tjb.setUrl("");
		menuDao.saveOrUpdata(tjb);
		
		Tmenu lsbjcx = new Tmenu();
		lsbjcx.setId("2lsbjcx");
		lsbjcx.setText("历史报表查询");
		lsbjcx.setTmenu(root);
		lsbjcx.setUrl("");
		menuDao.saveOrUpdata(lsbjcx);
		
		Tmenu dlyhwh = new Tmenu();
		dlyhwh.setId("3dlyhwh");
		dlyhwh.setText("电力用户维护");
		dlyhwh.setTmenu(root);
		dlyhwh.setUrl("");
		menuDao.saveOrUpdata(dlyhwh);
		
		Tmenu fdqywh = new Tmenu();
		fdqywh.setId("4fdqywh");
		fdqywh.setText("发电企业维护");
		fdqywh.setTmenu(root);
		fdqywh.setUrl("");
		menuDao.saveOrUpdata(fdqywh);
		
		Tmenu zhgl = new Tmenu();
		zhgl.setId("5zhgl");
		zhgl.setText("账户管理");
		zhgl.setTmenu(root);
		zhgl.setUrl("/admin/yhgl.jsp");
		menuDao.saveOrUpdata(zhgl);
		
	}
	
	private void repairUser() {
		Map<String, Object> m = new HashMap<String, Object>();
		m.put("name","admin");
		Tuser t = userDao.get("from Tuser t where t.name = :name and t.id !='0'", m);
		if(t!=null){
			t.setId(UUID.randomUUID().toString());
		}
		Tuser admin = new Tuser();
		admin.setId("0");
		admin.setName("admin");
		admin.setPwd(Encrypt.e("admin"));
		admin.setModifytime(new Date());
		userDao.saveOrUpdata(admin);
	}

}

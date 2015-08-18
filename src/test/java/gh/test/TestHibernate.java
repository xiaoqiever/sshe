package gh.test;

import gh.model.Tuser;
import gh.service.UserServiceI;

import java.util.Date;
import java.util.UUID;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHibernate {
	
	@Test
	public void test(){
	/*	ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml","classpath:spring-hibernate.xml"}); 
		UserServiceI userService = (UserServiceI) ac.getBean("userService");
		Tuser t = new Tuser();
		t.setId(UUID.randomUUID().toString());
		t.setName("古恒");
		t.setPwd("7u8i9o0p");
		t.setCreatetime(new Date());
		userService.save(t);*/
	}

}

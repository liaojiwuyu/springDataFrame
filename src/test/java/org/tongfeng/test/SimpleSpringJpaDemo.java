package org.tongfeng.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tongfeng.Entity.AccountInfo;
import org.tongfeng.service.UserService;

public class SimpleSpringJpaDemo {
	 public static void main(String[] args){ 
		 ClassPathXmlApplicationContext ctx = 
		 new ClassPathXmlApplicationContext("config/applicationContext.xml"); 
		 UserService userService = ctx.getBean("userService", UserService.class); 
		 userService.CreateNewAcount((long) 3275, "dfadlupass", 12); 
		// userService.CreateNewAcount((long) 3267, "dfhlupdass", 16); 
		 AccountInfo info =  userService.findByAccountId((long)6521);
		 System.out.println(info);
	} 
}

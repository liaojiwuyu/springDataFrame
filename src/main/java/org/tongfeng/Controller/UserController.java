package org.tongfeng.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.tongfeng.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping(value = "/add_user", method=RequestMethod.GET)
	public void skip_user(){
		System.out.println("skip_user()");
	}
	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
	public ModelAndView saveOrUpdateUser(Long id,String username,  Integer balance) {
		System.out.println("id:"+id+"username:"+username+"balance:"+balance);
		userService.CreateNewAcount(id, username, balance);
		return new ModelAndView("redirect:sucsess","username",username);
	}
}

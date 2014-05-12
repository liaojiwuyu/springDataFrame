package org.tongfeng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tongfeng.Entity.AccountInfo;
import org.tongfeng.Entity.UserInfo;
import org.tongfeng.dao.UserDao;
import org.tongfeng.service.UserService;
@Service(value="userService")
public class UserServiceImp implements UserService {
	@Autowired
	private UserDao userDao ;
	@Transactional
	public AccountInfo CreateNewAcount(Long id,String username,  Integer balance) {
		AccountInfo accountInfo = new AccountInfo();
		/*UserInfo userInfo = new UserInfo();
		userInfo.setUsername(username);
		userInfo.setPassword(password);*/
		accountInfo.setAccountId(id);
		accountInfo.setBalance(balance);
		accountInfo.setName(username);
		//accountInfo.setUserInfo(userInfo);
		return userDao.save(accountInfo);
	}
	public AccountInfo findByAccountId(long l) {
		return userDao.findByAccountId(l);
	}

}

package org.tongfeng.service;

import org.tongfeng.Entity.AccountInfo;

public interface UserService {
	public AccountInfo CreateNewAcount(Long id,String username,  Integer balance);

	public AccountInfo findByAccountId(long l);
	
}

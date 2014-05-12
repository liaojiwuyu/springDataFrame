package org.tongfeng.dao;

import org.springframework.data.repository.Repository;
import org.tongfeng.Entity.AccountInfo;

public interface UserDao extends Repository<AccountInfo, Long>{
	public AccountInfo save(AccountInfo accountInfo);
	
	public AccountInfo findByAccountId(Long accountId);
}

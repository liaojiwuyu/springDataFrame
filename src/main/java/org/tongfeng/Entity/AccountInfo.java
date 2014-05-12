package org.tongfeng.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="t_accountinfo")
public class AccountInfo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long accountId;
	private Integer balance;
	private String name;
	//private UserInfo userInfo;
	@Id
	@Column(name="accountId")
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	@Column(name="balance")
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	@Column(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "AccountInfo [accountId=" + accountId + ", balance=" + balance
				+ ", name=" + name + "]";
	}
	
	
	
}

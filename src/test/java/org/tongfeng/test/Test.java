package org.tongfeng.test;

import org.tongfeng.service.impl.UserServiceImp;

public class Test {
	public static void main(String[] args) {
		new UserServiceImp().CreateNewAcount((long) 12345,"liaojiwwu",  22);
	}
}

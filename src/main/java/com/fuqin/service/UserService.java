package com.fuqin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fuqin.dao.UserDao;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	public int selectcountbyorderno() {
		
		return userDao.selectcountbyorderno();
	}
	
	
	
}

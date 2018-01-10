package com.cisco.la.service.impl;

import com.cisco.la.mapper.UserModelMapper;
import com.cisco.la.model.UserModel;
import com.cisco.la.service.UserService;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private SqlSession sqlSession;
	
	public void addUser(UserModel userModel) {
		UserModelMapper userModelMapper = sqlSession.getMapper(UserModelMapper.class);
		
		userModelMapper.insert(userModel);
	}

	public void inactiveUser(String id) {

	}

	public void updateUser(UserModel userModel) {

	}

	public UserModel getUserByID(String id) {
		return null;
	}
}

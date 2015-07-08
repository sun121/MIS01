package com.sun.mis.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sun.mis.bean.User;
import com.sun.mis.dao.UserMapper;
import com.sun.mis.service.UserService;

@Service
@Transactional  //此处不再进行创建SqlSession和提交事务，都已交由spring去管理了。
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper mapper;

	public void add(User user) {
		mapper.addUser(user);
	}

	public boolean modifyUser(User user) {
		return mapper.modifyUser(user);
	}

	public boolean removeUser(User user) {
		return mapper.removeUser(user);
	}

	public User queryUserById(String id) {
		return mapper.queryUserById(id);
	}
	public List<User> queryUserByIds(List<String> idList) {
		return mapper.queryUserByIds(idList);
	}

	public List<User> queryUserList(User user) {
		return mapper.queryUserList(user);
	}

}

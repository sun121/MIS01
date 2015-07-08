package com.sun.mis.dao;

import java.util.List;

import com.sun.mis.bean.User;


public interface UserMapper {
	void addUser(User user);
	boolean modifyUser(User user);
	boolean removeUser(User user);
	User queryUserById(String id);
	List<User> queryUserByIds(List<String> idList);
	List<User> queryUserList(User user);
}

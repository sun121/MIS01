package com.sun.mis.bean;

import java.util.Date;


/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private String id;
	private String name;
	private String email;
	private String loginPassword;
	private Integer sex;
	private String tel;
	private Integer state;
	private String createrId;
	private Date createDate;
	private Date workDate;
	private String roleId;
	private Integer isAdmin;

	// Constructors

	/** default constructor */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String id, String name, String email, String loginPassword,
			Integer sex, String tel, Integer state, String createrId,
			Date createDate, Date workDate, String roleId, Integer isAdmin) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.loginPassword = loginPassword;
		this.sex = sex;
		this.tel = tel;
		this.state = state;
		this.createrId = createrId;
		this.createDate = createDate;
		this.workDate = workDate;
		this.roleId = roleId;
		this.isAdmin = isAdmin;
	}

	// Property accessors


	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoginPassword() {
		return this.loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getCreaterId() {
		return this.createrId;
	}

	public void setCreaterId(String createrId) {
		this.createrId = createrId;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getWorkDate() {
		return workDate;
	}

	public void setWorkDate(Date workDate) {
		this.workDate = workDate;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public Integer getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Integer isAdmin) {
		this.isAdmin = isAdmin;
	}

}
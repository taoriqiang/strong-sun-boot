package org.example.models;

import java.io.Serializable;
import java.util.List;

public class UserForm implements Serializable {
    private String userName;
	private String sso;
	private String password;
	private String role;
	private String fullName;
	
	private String chineseName;
	private String gender;
	private String phone;
	private String mobilePhone;
	private String location;
	private String email;
	private String roleName;
	private String empssoTitleid;
	private List<UserForm> userFormList;

	public String getSso() {
		return sso;
	}

	public void setSso(String sso) {
		this.sso = sso;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getChineseName() {
		return chineseName;
	}

	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getEmpssoTitleid() {
		return empssoTitleid;
	}

	public void setEmpssoTitleid(String empssoTitleid) {
		this.empssoTitleid = empssoTitleid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<UserForm> getUserFormList() {
		return userFormList;
	}

	public void setUserFormList(List<UserForm> userFormList) {
		this.userFormList = userFormList;
	}
}
package org.example.models;

import java.util.List;


public class AdminUserForm {

	private UserForm adminUser;

	private List<Access> accessList;


	public UserForm getAdminUser() {
		return adminUser;
	}

	public void setAdminUser(UserForm adminUser) {
		this.adminUser = adminUser;
	}

	public List<Access> getAccessList() {
		return accessList;
	}

	public void setAccessList(List<Access> accessList) {
		this.accessList = accessList;
	}
}

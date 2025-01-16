package com.umas.model;


public class User {

	private int userId;
	private String userName;
	private long contactNo;
	private String userAddress;
	private String userAdharNo;
	private String userEmailId;

	public String getUserEmailId() {
		return userEmailId;
	}

	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

	private String userPanNo;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserAdharNo() {
		return userAdharNo;
	}

	public void setUserAdharNo(String userAdharNo) {
		this.userAdharNo = userAdharNo;
	}

	public String getUserPanNo() {
		return userPanNo;
	}

	public void setUserPanNo(String userPanNo) {
		this.userPanNo = userPanNo;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", contactNo=" + contactNo + ", userAddress="
				+ userAddress + ", userAdharNo=" + userAdharNo + ", userEmailId=" + userEmailId + ", userPanNo="
				+ userPanNo + "]";
	}

}

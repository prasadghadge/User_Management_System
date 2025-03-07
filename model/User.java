package com.Exponent.model;

public class User {
private int uid;
private String userName;
private String uaddress;
private double usalary;
private String userGender;
private int userNo;


public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getUaddress() {
	return uaddress;
}
public void setUaddress(String uaddress) {
	this.uaddress = uaddress;
}
public double getUsalary() {
	return usalary;
}
public void setUsalary(double usalary) {
	this.usalary = usalary;
}
public String getUserGender() {
	return userGender;
}
public void setUserGender(String userGender) {
	this.userGender = userGender;
}
public int getUserNo() {
	return userNo;
}
public void setUserNo(int userNo) {
	this.userNo = userNo;
}
@Override
public String toString() {
	return "User [uid=" + uid + ", userName=" + userName + ", uaddress=" + uaddress + ", usalary=" + usalary
			+ ", userGender=" + userGender + ", userNo=" + userNo + "]";
}

}




package com.dm.app.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pmctl_user_info database table.
 * 
 */
@Entity
@Table(name="pmctl_user_info")
public class PmctlUserInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;

	@Column(name="AREA_CODE")
	private String areaCode;

	@Column(name="BUYER_LEVEL")
	private String buyerLevel;

	@Column(name="CERTIFICATE_CODE")
	private String certificateCode;

	@Column(name="CERTIFICATE_TYPE")
	private String certificateType;

	@Column(name="CERTIFICATE_URL")
	private String certificateUrl;

	@Column(name="CONTACT_PHONE")
	private String contactPhone;

	@Column(name="CREATE_DATE")
	private String createDate;

	@Column(name="CREATE_TIME")
	private String createTime;

	private String field1;

	private String field2;

	@Column(name="LOGIN_NAME")
	private String loginName;

	@Column(name="MOBILE_PHONE")
	private String mobilePhone;

	@Column(name="NICK_NAME")
	private String nickName;

	@Column(name="PASS_WORD")
	private String passWord;

	@Column(name="REAL_NAME")
	private String realName;

	@Column(name="SUPPLIER_LEVEL")
	private String supplierLevel;

	@Column(name="USER_ADDR")
	private String userAddr;

	@Column(name="USER_CODE")
	private String userCode;

	@Column(name="USER_EMAIL")
	private String userEmail;

	@Column(name="USER_STATE")
	private String userState;

	public PmctlUserInfo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAreaCode() {
		return this.areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getBuyerLevel() {
		return this.buyerLevel;
	}

	public void setBuyerLevel(String buyerLevel) {
		this.buyerLevel = buyerLevel;
	}

	public String getCertificateCode() {
		return this.certificateCode;
	}

	public void setCertificateCode(String certificateCode) {
		this.certificateCode = certificateCode;
	}

	public String getCertificateType() {
		return this.certificateType;
	}

	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}

	public String getCertificateUrl() {
		return this.certificateUrl;
	}

	public void setCertificateUrl(String certificateUrl) {
		this.certificateUrl = certificateUrl;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getField1() {
		return this.field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return this.field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPassWord() {
		return this.passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getSupplierLevel() {
		return this.supplierLevel;
	}

	public void setSupplierLevel(String supplierLevel) {
		this.supplierLevel = supplierLevel;
	}

	public String getUserAddr() {
		return this.userAddr;
	}

	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}

	public String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserState() {
		return this.userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}

}
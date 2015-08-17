package com.dm.app.controller;

import java.rmi.RemoteException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dm.app.entity.PmctlUserInfo;
import com.dm.app.mapping.UserInfoDao;
import com.dm.app.repository.BaseDao;
import com.dm.app.service.UserService;

@Controller
public class TestController {
	@Autowired
	private UserService a;
	@Autowired
	private BaseDao basedao;
	@Autowired
	private UserInfoDao userInfoDao;
	/**
	 * jpa query注解
	 * @return
	 * @throws RemoteException 
	 */
	@RequestMapping(value="ha")
	@ResponseBody
	public List<PmctlUserInfo> ceshi() throws RemoteException {
		return a.find();
	}
	/**
	 * 自带简单查询
	 * @return
	 */
	@RequestMapping(value="ss")
	@ResponseBody
	public List<PmctlUserInfo> ss() {
		return basedao.findAll();
	}
	/**
	 * mybatis
	 * @return
	 */
	@RequestMapping(value="uu")
	@ResponseBody
	public List<PmctlUserInfo> uu() {
		return userInfoDao.getUser();
	}
	
}

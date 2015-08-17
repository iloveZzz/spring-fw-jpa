package com.dm.app.service.impl;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.dm.app.entity.PmctlUserInfo;
import com.dm.app.repository.BaseDao;
import com.dm.app.service.UserService;
@Service
public class UserServiceImpl implements UserService{
protected UserServiceImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
@Autowired
private BaseDao basedao;
@Cacheable(value="usercache")
public List<PmctlUserInfo> find() {
	return basedao.getById();
}
public List<PmctlUserInfo> getLs(){
	return basedao.findAll();
}
}

package com.dm.app.test;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dm.app.mapping.UserInfoDao;
import com.dm.app.service.UserService;
import com.google.gson.Gson;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/*/application-context.xml")
public class EhCacheTest {
	@Autowired
	private UserInfoDao userInfoDao;
	@Autowired
	private UserService userService;
	@Test
	public void test() throws RemoteException, MalformedURLException {
		System.out.println(userInfoDao.getUser());
		System.out.println("===================");
		System.out.println(userService.find());
		System.out.println("===================");
		Gson json = new Gson();
		System.out.println(json.toJson(userService.find()));
		System.out.println("===================");
		System.out.println(userService.find());
		System.out.println("===================");
		System.out.println(userService.find());
//		 LocateRegistry.createRegistry(6600);  
         //注册通讯路径  
//         Naming.rebind("rmi://127.0.0.1:6600/userService", userService);  
         System.out.println(1);
	}
}

package com.dm.app.service;

import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import com.dm.app.entity.PmctlUserInfo;

public interface UserService  {
	
	public List<PmctlUserInfo> find() ;
	@CacheEvict(value="usercache",allEntries=true)
	public List<PmctlUserInfo> getLs();
}

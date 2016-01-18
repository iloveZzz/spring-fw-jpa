package com.dm.app.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dm.app.entity.PmctlUserInfo;
public interface BaseDao extends JpaRepository<PmctlUserInfo, Long>{
	@Query("select p from PmctlUserInfo p")
    public List<PmctlUserInfo> getById();
}
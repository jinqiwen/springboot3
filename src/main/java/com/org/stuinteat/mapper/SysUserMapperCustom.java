package com.org.stuinteat.mapper;

import java.util.List;

import com.org.stuinteat.pojo.SysUser;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserMapperCustom {
	
	List<SysUser> queryUserSimplyInfoById(String id);
}
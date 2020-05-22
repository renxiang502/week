package com.renxiang.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.renxiang.beans.Info;
import com.renxiang.beans.Teacher;
import com.renxiang.mapper.InfoMapper;
@Service
public class InfoServiceImpl implements InfoService{

	@Resource
	private InfoMapper iMapper;
	public List<Info> queryAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return iMapper.queryAll(map);
	}
	public List<Teacher> queryTeacher() {
		// TODO Auto-generated method stub
		return iMapper.queryTeacher();
	}
	public int insertInfo(Info info) {
		// TODO Auto-generated method stub
		return iMapper.insertInfo(info);
	}
	
}

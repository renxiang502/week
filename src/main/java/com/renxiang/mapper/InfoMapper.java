package com.renxiang.mapper;

import java.util.List;
import java.util.Map;

import com.renxiang.beans.Info;
import com.renxiang.beans.Teacher;

public interface InfoMapper {
	//查讯
	public List<Info> queryAll(Map<String,Object>map);
	//查找老师
	public List<Teacher> queryTeacher();
	//添加
	public int insertInfo(Info info);
}

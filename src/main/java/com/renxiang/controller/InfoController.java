package com.renxiang.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.renxiang.beans.Info;
import com.renxiang.beans.Teacher;
import com.renxiang.service.InfoService;

@Controller
public class InfoController {
	
	@Resource
	private InfoService iService;
	
	@RequestMapping("queryAll")
	public String queryAll(Model model,@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="1")String status,
			@RequestParam(defaultValue="")String tname){
		int pageSize = 2;
		PageHelper.startPage(pageNum, pageSize );
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", status);
		map.put("tname", tname);
		List<Info> ilist = iService.queryAll(map);
		PageInfo<Info> plist = new PageInfo<Info>(ilist);
		model.addAttribute("plist",plist);
		return "list";
	}
	
	@RequestMapping("findTeacher.do")
	@ResponseBody
	public List<Teacher> findOne(){
		List<Teacher> tlist = iService.queryTeacher();
		return tlist;
	}
	@RequestMapping("add.do")
	public String sayAdd(Info info){
		int insertInfo = iService.insertInfo(info);
		if(insertInfo>0){
			return "redirect:query.do";
		}
		return "add";
	}
	@RequestMapping("look.do")
	@ResponseBody
	public String sayLook(Info info){
		int insertInfo = iService.insertInfo(info);
		if(insertInfo>0){
			return "redirect:query.do";
		}
		return "add";
	}
}

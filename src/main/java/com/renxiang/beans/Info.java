package com.renxiang.beans;

public class Info {
	private Integer id;
	private Integer tid;
	private String name;
	private String uptime;
	private Integer status;
	
	private String tname;
	
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUptime() {
		return uptime;
	}
	public void setUptime(String uptime) {
		this.uptime = uptime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Info [id=" + id + ", tid=" + tid + ", name=" + name + ", uptime=" + uptime + ", status=" + status + "]";
	}
	
	
}

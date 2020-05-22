<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<table>
		<tr>
			<td colspan="10">
				<form action="queryAll" method="post">
					<select id="">
						<option>输入宿舍号</option>
					</select>
					<select id="status">
						<option>晾晒中</option>
						<option>已收被</option>
					</select>
					<select id="tname">
						<option>陈老师</option>
						<option>董老师</option>
						<option>王老师</option>
					</select>
					<input type="submit" value="查询">
				</form>
			</td>
		</tr>
		<tr>
			<td>id</td>
			<td>宿舍号</td>
			<td>负责老师</td>
			<td>凉被时间</td>
			<td>状态</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${plist.list}" var="t">
			<tr>
				<td>${t.tid}</td>
				<td>${t.id}</td>
				<td>${t.tname}</td>
				<td>${t.uptime}</td>
				<td>${t.status}</td>
				<td>
					<a href="add.jsp">新增</a>
					<a href="look.do?id=${t.id}">查看</a>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="10">
				当前${plist.pageNum}/${plist.pages}页,共${plist.total}条
				<a href="queryAll.do?pageNum=${plist.firstPage}">首页</a>
				<a href="queryAll.do?pageNum=${plist.prePage}">上一页</a>
				<a href="queryAll.do?pageNum=${plist.nextPage}">下一页</a>
				<a href="queryAll.do?pageNum=${plist.lastPage}">末页</a>
			</td>
		</tr>
	</table>	
</body>
</html>
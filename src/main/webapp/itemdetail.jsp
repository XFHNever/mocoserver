<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="./bootstrap-3.1.1-dist/css/bootstrap.min.css">
<title>ConfigItem Detail</title>
<sb:head/>
</head>
<body>
	<div class="container">
		<h1 class="page-header">ConfigItem Detail Information</h1>
	
		<s:form action="modifyitem" enctype="multipart/form-data" theme="bootstrap" cssClass="form-horizontal">
			<div class="form-group"> 
            	<s:textfield name="id" value="%{configItem.id}" label="ID" readonly="true"></s:textfield>
            </div>
            <div class="form-group"> 
            	<s:textarea name="content" value="%{configItem.content}" label="Content" rows="8"></s:textarea>
            </div>
            <div class="form-group"> 
				<s:textfield value="%{configItem.date}" label="Date" readonly="true"></s:textfield>
            </div>

			<div class="form-group" style="text-align: center; "> 
            	<s:submit cssClass="btn btn-primary" value="Modify"></s:submit>
            </div>
		</s:form>
	</div>
</body>
</html>
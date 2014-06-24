<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

	<link rel="stylesheet" href="./bootstrap-3.1.1-dist/css/bootstrap.min.css">
	<link rel="stylesheet" href="./css/mocoserver.css">
	
	<script src="./js/bootstrap-wysiwyg.js"></script>
	<script src="./js/jquery.hotkeys.js"></script>
	
	<script>
		function init() {
			$('#editor').wysiwyg();
			window.prettyPrint && prettyPrint();
		}
		
	</script>
	
	<title>mocoserver</title>
	<sb:head/>
	
</head>
<body onLoad="init();">
	<!--navbar-->
    <nav class="navbar navbar-fixed-top navbar-inverse" role="navigation">
        <div class="container">
            <div class="navbar-header">
                 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                 </button>
                 <a class="navbar-brand" href="#">Mocoserver</a>    
            </div>
            
            <div class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href="#about">Moco</a></li>
                    <li><a href="#contact">About</a></li>
                    <li><a href="#contact">Source</a></li>
                </ul>
            </div><!-- /.nav-collapse -->
       </div>
    
    </nav>


	<!-- Introduction and add new configuration -->
	<div class="container">
    	<!--Add New Configuration-->
		<h1 class="page-header">Add new configuration</h1>    
	  	<s:actionerror theme="bootstrap"/>
        <s:actionmessage theme="bootstrap"/>
        <s:fielderror theme="bootstrap"/>
        <s:form role="form"  action="createitem" enctype="multipart/form-data" theme="bootstrap" cssClass="form-horizontal">
        	<div class="form-group">
            	<label for="configItem">Configuration</label>
            	<s:textarea name="content" cssClass="form-control" rows="8" requiredLabel="true"></s:textarea>
            </div>
            <div class="form-group"> 
            	<s:submit cssClass="btn btn-primary"></s:submit>
            </div>
        </s:form>
        
        <!-- List all the existing configurations-->
        <h1 class="page-header">Existing Configurations</h1>
    	<table class="table table-hover "> 
        	<thead>
            	<th>ID</th>
                <th>Content</th>
                <th>Date</th>
                <th>Modify</th>
                <th>Delete</th>
            </thead>
            <s:iterator value="items" var="item">
    	        <tr>
	            	<td><s:property value="id"/></td>
	                <td><s:property value="content"/></td>
	                <td><s:property value="date"/></td>
	            
	                <td><a href='<s:url action="itemdetail">
	                	<s:param name="itemid" value="#item.id"></s:param>
	                	<s:param name="itemcontent" value="#item.content"></s:param>
	                	<s:param name="itemdate" value="#item.date"></s:param>
	                </s:url>'>Modify</a></td>
	                
	                <td><a href='<s:url action="deleteitem">
	                	<s:param name="itemid" value="#item.id"></s:param>
	                </s:url>'>Delete</a></td>
	            </tr>
            
            </s:iterator>

        </table>
    </div>
</body>
</html>
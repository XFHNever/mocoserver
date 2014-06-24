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
	
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"></script>
	<link rel="stylesheet" href="./bootstrap-3.1.1-dist/js/bootstrap.min.js">
	<script src="./js/bootstrap-wysiwyg.js"></script>
	<script src="./js/jquery.hotkeys.js"></script>
	
	<script>
		function insertData() {
			$('#hiddeneditor').text($('#editor').text());
		}
	
		function init() {
			$('#editor').wysiwyg();
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
                    <li><a href="https://github.com/dreamhead/moco">Moco</a></li>
                    <li><a href="#contact">About</a></li>
                    <li><a href="https://github.com/XFHNever/mocoserver">Source</a></li>
                </ul>
            </div><!-- /.nav-collapse -->
       </div>
    
    </nav>


	<!-- Introduction and add new configuration -->
	<div class="container">
		<!-- introduction -->
		<div class=" moco-header">
			<div class="jumbotron">
            	<h1>Moco server</h1>
                <p>this is a central server for  integration testing with moco framework! Below is a list of existing configuration. you could add more u need using a JSON format!</p>
                <p><a class="btn btn-primary btn-lg" role="button" data-toggle="modal" data-target="#myModal">Add more</a></p>
       		</div>        	
        </div>   
	    
	    <!-- Modal(add new configuration) -->
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">New configuration</h4>
              </div>
             
             <s:form role="form"  action="createitem" enctype="multipart/form-data" theme="bootstrap" cssClass="form-horizontal">
                  <div class="modal-body" style="">
                  	  <s:div id="editor" onblur="insertData();"></s:div>
                  	  <div class="hidden">
                  	  		<s:textarea class="hidden"  id="hiddeneditor" name="content" rows="8"></s:textarea>
                  	  </div>

                  </div>
                
                  <div class="modal-footer">
                    <button type="close" class="btn btn-default" data-dismiss="modal">Cancel</button>
                    <s:submit cssClass="btn btn-info"></s:submit>
                  </div>             
             </s:form>
             
            
            </div>
          </div>
        </div>
		
    	
    	
<!-- 
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
        
  -->     
        <!-- List all the existing configurations-->
  <!--        <h1 class="page-header">Existing Configurations</h1>
       
        <div class="row">
     		<s:iterator value="items" var="item">
        		<div class="col-6 col-sm-6 col-lg-4">
	        		<h2><s:property value="id"/></h2>
	        		<p><s:property value="content"/></p>
	        		<p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
        		</div>
        	</s:iterator>  	
        </div>
 -->
        
        
        <!--List all the existing configurations-->
        <hr/>
        <div class="panel panel-primary">
	       	<div class="panel-heading">
				<h3 class="panel-title">Existing Configurations</h3>
			</div>
		
	    	<table class="table table-hover "> 
	        	<thead>
	        		<tr>
		            	<th>ID</th>
		                <th>Content</th>
		                <th>Date</th>
		                <th>Modify</th>
		                <th>Delete</th>
	                </tr>
	            </thead>
	            <s:iterator value="items" var="item">
	    	        <tr>
		            	<td><s:property value="id"/></td>
		                <td><s:property value="content"/></td>
		                <td><s:property value="date"/></td>
		            
		                <td><a class="btn btn-primary btn-xs" href='<s:url action="itemdetail">
		                	<s:param name="itemid" value="#item.id"></s:param>
		                	<s:param name="itemcontent" value="#item.content"></s:param>
		                	<s:param name="itemdate" value="#item.date"></s:param>
		               	 </s:url>'><span class="glyphicon glyphicon-pencil"></span></a>
		                </td>
		                             
		                <td><a class="btn btn-danger btn-xs" href='<s:url action="deleteitem">
			                	 <s:param name="itemid" value="#item.id"></s:param>
			               		</s:url>'><span class="glyphicon glyphicon-trash"></span>
		               		</a>
		                </td>
		            </tr>
	            
	            </s:iterator>
	
	        </table>
        </div>  
         
    </div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fun"%>
<!DOCTYPE html >
<html>
<head>



    <meta charset="UTF-8">
	<title>Basic DataGrid - jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="/testSSM/jquery-easyui-1.4.5/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="/testSSM/jquery-easyui-1.4.5/themes/icon.css">
	<script type="text/javascript" src="/testSSM/jquery-1.11.2.js"></script>
	<script type="text/javascript" src="/testSSM/jquery-easyui-1.4.5/jquery.easyui.min.js"></script>
<script>
 $(function(){

$("#datagrid").datagrid({ 
   
    url:'/testSSM/userController/showAllUser.do', 
    pagination:true,
    rownumbers:true,
    fitColumns:true,
    striped:true,
    nowrap: false,
    striped: true,
    collapsible: true,
    idField: 'id',
    remoteSort: false,
    frozenColumns:[[
{ field: 'ck', checkbox: true }  ]],
    columns:[[    
        {field:'id',title:'id',width:100,hidden:true},    
        {field:'createdatetime',title:'createdatetime',width:100},    
        {field:'modifydatetime',title:'modifydatetime',width:100,align:'right'},  
        {field:'name',title:'name',width:100,align:'right'},
        {field:'pwd',title:'pwd',width:100,align:'right'}, 
        {field:'createTime',title:'createTime',width:100,align:'right'},  
        {field:'updateTime',title:'updateTime',width:100,align:'right'},
        {field:'asd',title:'操作',width:100,align:'center',
        	
        formatter:function(value,row,index){
        	
        	return '<a href="/testSSM/userController/deletUser.do?id='+row.id+'" >删除</a>&nbsp;<a href="/testSSM/userController/updateUser.do?id1='+row.id+'">修改</a>';
        }
        
        }
             
    ]]
   
             
             
             


}); 

$('#datagrid').datagrid({
	 onLoadSuccess: function () {
         $('.datagrid-toolbar').append($('#txtSearch'));
         $('#txtSearch').show();
     },
	toolbar: [{
		    	id: 'btnSearch',
		        text: '搜索',
		        disabled: false,
		        iconCls: 'icon-search',
		        handler: function () {
		             $('#datagrid').datagrid('options').url = '/testSSM/userController/likeSelect.do?news=' + escape($('#txtSearch').val());
		            $('#datagrid').datagrid("reload"); 
		        }
		    	
		    },
		    {
		    	iconCls: 'icon-no',
				handler: function(){
					var selRow = $("#datagrid").datagrid("getSelections");//将选的行提出来
					
					if (selRow.length>0&&selRow!=null) {
						 var ids=new Array();
						for (var int = 0; int < selRow.length; int++) {
							var id=selRow[int].id;
							ids.push(id);
						}
						
						if (confirm("确定要删除选中的吗?")) {
							 location.href= "/testSSM/userController/batchDelete.do?ids="+ids;
							
						}
						 
					}else{
						  alter("请选择一行");
						 
					}
					
					
					
					
				}

		    }
]
});







});
 function woai() {
	
	var test=$("#aa1").val();
	alert(test);
}
</script>
<!-- <script type="text/javascript">
	function getUserAll() {
		alert(123);
		$.getJSON("/testSSM/userController/showAllUser.do", function(json) {
			var html="";
			for (var i = 0; i <json.length; i++) {
				html+="<tr>";
				html+="<td>"+json[i].id+"</td>";
				html+="<td>"+json[i].createdatetime+"</td>";
				html+="<td>"+json[i].modifydatetime+"</td>";
				html+="<td>"+json[i].name+"</td>";
				html+="<td>"+json[i].pwd+"</td>";
			    html+="<td><a href='/testSSM/userController/deletUser.do?id="+json[i].id+"'>删除</a>&nbsp;<a href='/testSSM/userController/updateUser.do?id1="+json[i].id+"'>修改</a></td>" ; 
				html+="</tr>";
			};
			  $("#FORLIST").append(html); 
		});
	}</script> -->


</head>
<body>
	<h1 style="color: red;pitch: 10px;text-align:center">你好：${user.name}</h1>
	<a href="/testSSM/showUser.jsp" class="easyui-linkbutton" data-options="iconCls:'icon-search'">查看全部</a>
	<a href="/testSSM/addUser.jsp"class="easyui-linkbutton" data-options="iconCls:'icon-add'">添加新用户</a> 
<div id="datagrid" style="text-align:center;"> </div>
<div id="tb" hidden="hidden">
<input class="easyui-textbox" data-options="iconCls:'icon-search'" style="display: none;" id="txtSearch" >  
</div>

<input class="easyui-datebox">
<input class="easyui-combobox">
<div class="easyui-pan" title="登陆" style="width:400px;padding:50px 70px 20px 70px;margin:0px auto" >
		<div style="margin-bottom:10px">
			<input class="easyui-textbox" style="width:100%;height:40px;padding:12px" data-options="prompt:'Username',iconCls:'icon-man',iconWidth:38">
		</div>
		<div style="margin-bottom:20px">
			<input class="easyui-textbox" type="password" style="width:100%;height:40px;padding:12px" data-options="prompt:'Password',iconCls:'icon-lock',iconWidth:38">
		</div>
		<div style="margin-bottom:20px">
			<input type="checkbox" checked="checked">
			<span>Remember me</span>
		</div>
		<div>
			<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-ok'" style="padding:5px 0px;width:100%;">
				<span style="font-size:14px;">Login</span>
			</a>
		</div>
	</div>
<input class="easyui-numberspinner" name="a" id="aa1" data-options="min:0,max:59,required:true,prompt:'0'" style="width:80px;"></input>
<input type="button" onclick="woai()" value="ssc">
</body>
</html>
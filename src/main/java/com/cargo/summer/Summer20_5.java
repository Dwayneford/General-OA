package com.cargo.summer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * 入职卡歌科技时技术问题总结
 * @author DYB
 * @date 2020年05月15日 15:12
 */
public class Summer20_5 {
    public static void main(String[] args) {
        System.out.println("请输入");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());


        // 1. 使用 Iterator 遍历 HashMap EntrySet
        Map<Integer, String> coursesMap = new HashMap<Integer, String>();
        coursesMap.put(1, "C");
        coursesMap.put(2, "C++");
        coursesMap.put(3, "Java");
        coursesMap.put(4, "Spring Framework");
        coursesMap.put(5, "Hibernate ORM framework");

        Iterator<Map.Entry<Integer, String>> iterator = coursesMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey()+"="+entry.getValue());
        }


        // 2. 使用 Iterator 遍历 HashMap KeySet
        Iterator < Integer > iterator2 = coursesMap.keySet().iterator();
        while (iterator2.hasNext()) {
            Integer key = iterator2.next();
            System.out.println(key);
            System.out.println(coursesMap.get(key));
        }


        // 3. 使用 For-each 循环遍历 HashMap
        for (Map.Entry < Integer, String > entry: coursesMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // 4. 使用 Lambda 表达式遍历 HashMap
        coursesMap.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
        });



    }
}
/*

模糊查询添加参数的方式
if (StringUtils.isNotEmpty(tradeCode)) {
			sqlCondition += " and vcbi.trade_code like ?";
			parameters.add("%" + tradeCode.trim() + "%");
		}


ssh老框架分页查询
pageData = service.queryForMap(sql, totalSql, page, rows, parameters.toArray());
		write(pageData);


maven springMVC导出Excel表查询
List<Map<String, Object>> listk = sendDepartureReportService.nativeQueryForMap(sql,paras.toArray());


制表符
&#9;



easyUI加载完成后渲染的格式
$('#p').panel('move',{
  left:100,
  top:100 ,
  title:''
});


$('#dd').draggable({
handle:'#title'
});


$.ajax({
            type:"POST",
            url:"",
            dataType:"json",
            success:function(data){
                $.each(data,function(key,value){
                    //---
                });
            }
		});


初始化表格
<table id="boxStatusDetails"></table>

function initBoxStatusDetails() {
	var width=$("#down").panel('options').width;
	var height=$('#down').panel('options').height;
	$('#boxStatusDetails').datagrid({
		width:width,
  		rownumbers:true,
  		checkOnSelect: true,
  		selectOnCheck: true,
  		singleSelect: false,
  		pagination: true,
	    url:'/application/finance/payManage/lock_bill_DetailQuery_forleader.action?ifFinancial=ifFinancial',
	    queryParams: global,
  		loadMsg:'正在加载数据...',
	    pageNumber:1,
		pageSize: 20,//每页显示的记录条数，默认为10
        pageList: [100,200,300,500],//可以设置每页记录条数的列表
	    columns:[[
	    	{field:'ck',checkbox:true},
	    	{field:'trade_type',hidden:true},
	    	{
				field : "trade_code",
				title : "托单编号",
				width : "80",
				sortable : true,
				resizable : true,
				align : "center",
				formatter:function(value,row,index){
					return "<span style=\"color:blue;cursor:pointer\" onclick=\"details('"+value+"','"+row.trade_type+"','"+row.bol_code+"')\">"+value+"</span>";
		        }
			},{
				field : "dongtai",
				title : "锁单动态",
				width : "120",
				resizable : true,
				align : "center"
			},{
				field : "total_monry",
				title : "单票收款费用",
				width : "120",
				resizable : true,
				align : "center"
			},{
        field : "pay_leader_reason",
        title : "推送原因",
        width : "100",
        sortable : true,
        resizable : true,
        align : "center",
        formatter:function (value,row,index){
        return '<span title="'+value+'" > '+value+'</span>';
        }
        }
        ]],

        //加载完成后执行的函数
        onLoadSuccess:function(data){
            $("#user_msgList").datagrid("clearSelections");
        }
        onDblClickRow:function(index, row){
        //var income_unit = row.INCOME_UNIT;
        var agency_man = row.agency_man;
        $('#income_unit_win').window({
        closed: false,
        doSize:true,
        cache:false,

        loadingMessage:'正在加载数据，请稍后...',
        method:'post',
        queryParams:{agency_man : agency_man},
        href:"yuqixijie.jsp"
        })
        }
        });
}



postgresql 中两个冒号::表示强制类型转换


















 */
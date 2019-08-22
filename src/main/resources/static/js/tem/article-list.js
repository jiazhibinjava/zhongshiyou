/**资讯-列表*/
$(function(){
    $('.table-sort').dataTable({
        "aaSorting":
            [
                [ 1, "desc"
                ]
            ],//默认第几个排序
        "bStateSave": true,//状态保存
        "pading":false,
        "aoColumnDefs": [
            //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
            {"orderable":false,"aTargets":[0,2,4,5]}// 不参与排序的列
        ]
    });
});
/*资讯-编辑
* article_show('查看','article-show.html','${article.id}')*/
function article_edit(title,url,id,w,h){
    var index = layer.open({
        type: 2,
        title: title,
        content: url
    });
    layer.full(index);
}
/*资讯-删除*/
function article_del(obj,id){
    layer.confirm('确认要删除吗？',function(index){
        $.ajax({
            type: 'POST',
            url: '',
            dataType: 'json',
            success: function(data){
                $(obj).parents("tr").remove();
                layer.msg('已删除!',{icon:1,time:1000});
            },
            error:function(data) {
                console.log(data.msg);
            },
        });
    });
}
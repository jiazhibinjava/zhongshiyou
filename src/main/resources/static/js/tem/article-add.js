$().ready(function(){
    $("#form-article-add").validate({
        submitHandler:function(form){
            var title=$("#title").val();
            var content=UE.getEditor('container').getContent();
            if(title==null || title==''){
                alert("请输入标题！");
            }else if(content==null || content==''){
                alert("请输入内容！");
            }else {
                $.ajax({
                    dataType : "json",
                    url : "/article/add",
                    type : "post",
                    data : $("#form-article-add").serialize(),
                    success : function(data) {
                        if(data.success){
                            alert("发表成功");
                            window.location.reload();
                        }
                        else {
                            alert("发表失败...");
                        }
                    },
                    error:function () {
                        alert("获得失败!");
                    }

                });
            }
        }
    });
});






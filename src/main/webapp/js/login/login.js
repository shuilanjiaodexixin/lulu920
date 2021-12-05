
//1.给登录按钮绑定单击时间
$('#btn_sub').click(function () {
    //2.发送ajax请求，提交表单数据
    $.post("/loginServlet",$('#loginForm').serialize(),function (data) {
        //data:{flag:false,errorMsg:''}
        console.log(data);
        if(data.flag){
            location.href='/index.html'
        }else {
            //登陆失败
            $('#errorMsg').html(data.errorMsg);
        }
    })
})

    //3.处理响应结果

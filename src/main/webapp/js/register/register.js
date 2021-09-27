//验证码
function changeCheckCode(img) {
    img.src = "checkCode?" + new Date().getTime();
}

/*
    表单校验：
        1.用户名：单词字符，长度8到20位
        2.密码：单词字符，长度8到20位
        3.email：邮件格式
        4.姓名：非空
        5.手机号：手机号格式
        6.出生日期：非空
        7.验证码：非空
 */
//校验用户名
function checkUsername() {
    //1.获取用户名值
    var username = $("#username").val();
    //2.定义正则
    var  reg_username =  /^\w{8,20}$/;
    //3.判断 给出提示信息
    var  flag= reg_username.test(username);
    if(flag){
        //用户名合法
        $("#username").css("border","");
    }else {
        //用户名非法，加一个红色边框
        $("#username").css("border","1px solid red");
    }
    return flag;
}

//校验密码
function checkPassword() {
    //1.获取密码值
}
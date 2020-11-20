<!--Login组件-->

<template>
<div>
    <div class="header_container">
            <img src="../assets/execution.png" class="logo_img" alt />
    </div>

    <div class="main_container">
      <div class="text_container">
      <span class="text">虚拟仿真实验平台-EXECUTION</span>
      </div>

        <div class="login_box">
          <!--添加表单-->
          <el-form
            ref="loginFormRef"
            :model="loginForm"
            :rules="loginRules"
            class="login_form"
            label-width="0px"
          >
            <el-form-item prop="username">
              <!--v-model="loginForm.adminid"  -->
              <el-input v-model="loginForm.username" prefix-icon="iconfont icon-"></el-input>
            </el-form-item>
            <el-form-item prop="password">
              <el-input v-model="loginForm.password" prefix-icon="iconfont iconmima" type="password"></el-input>
            </el-form-item>
            <el-form-item class="btns">
              <el-button type="primary" @click="login">登录</el-button>
              <el-button type="info" @click="resetLoginForm">重置</el-button>
            </el-form-item>
          </el-form>
        </div>
</div>
</div>
</template>

<script>
export default {
  data() {
    return {
      loginForm: {
        username:"",
        password: "" ,//必须是String类型的
        // adminid: "admin1",//admin1
        // password: "admin1"//admin1
      },
      loginRules: {
        username: [
          { required: true, message: "请输入用户名", trigger: "blur" },
          { min: 1, max: 20, message: "长度在 1 到 20 个字符", trigger: "blur" }
        ],
        password: [
          { required: true, message: "请输入密码", trigger: "blur" },
          { min: 1, max: 20, message: "密码为 1-20 位", trigger: "blur" }
        ]
      }
    };
  },
  methods: {
    resetLoginForm() {
      this.$refs.loginFormRef.resetFields();
      console.log("你点击了重置")
    },
    login() {
      console.log("你点击了登录s")
      this.$refs.loginFormRef.validate(async valid => {
        //如果没有正确填写密码，则跳出方法
        if (!valid) return;
        // 调用get请求
        //await会把信息给解析，data数据重命名为res
        const {data :res} = await this.$http.post("login", this.loginForm);
        console.log(res);
        //res.flag == "OK"
        // res.flag == "ok" 我的电脑的
         if (res.flag == "ok" ) {
           this.$message.success("登陆成功！！！");//这个字段用来调试信息
          window.sessionStorage.setItem('user',res.user); // 存储user对象session 放置
           this.$router.push({ path: "/home"});
         }else{
            this.$message.error("登录失败！！！");
         }
      });
    }
  }
};
</script>

<style lang="less" scoped>

.main_container {
  background-color: whitesmoke;
  position: fixed;
  width:100%;
  height: 700px;
  .text_container {
  background-color:whitesmoke;
  height:110px;
  width:800px;
    position: absolute;// 绝对定位
    left: 50%;
    top:17%;
    transform: translate(-50%, -80%);
    .text{
      font-family: 'happyzcool2016';
      color:#4A5064;
      font-size:56px;
      padding-left:0;
      
    }
  }
    .login_box {
    width: 500px;
    height: 200px;
    background-color: #0cd268;
    padding-top: 10px;
    border-radius: 3px;// 圆角
    position: absolute;// 绝对定位
    left: 50%;
    top:30%;
    transform: translate(-50%, -50%);// 根据自己位置 以自己为长度位移
    头像框
    .avatar_box {
      width: 130px;
      height: 130px;
      border: 1px solid #eee;
      border-radius: 20%; // 加圆角
      box-shadow: 0 0 10px #ddd;// 盒子阴影
      // position: absolute;
      // left: 50%;
      // transform: translate(-50%, -50%);
      background-color: #0cd268;
          img {
        width: 100px;
        height: 100px;
        border-radius: 0%; // 加圆角
        background-color: #eee;
      }

    }

    .btns {
      display: flex;// 弹性布局
      justify-content: flex-end; // 尾部对齐
    }
    .login_form {
      position: absolute;
      bottom: 0%;
      width: 100%;
      padding: 0 10px;
      box-sizing: border-box;// 设置边框
    }
  }
}
// 跟节点样式
.text_container {
  background-color: #0cd268;
  height:800px;
    .text{
      font-family: 'happyzcool2016';
      padding-left: 30%;
    color: #fff;
    font-size:56px;
  }
}

  
.login_container {
  background-color: #2b4b6b;
  height: 100%;
}

  .el-carousel__item h3 {
    color: #475669;
    font-size: 14px;
    opacity: 0.75;
    line-height: 150px;
    margin: 0;
  }

  .header_container {
    background-color:#4A5064;
    height: 250px;
    .logo_img {
      position: absolute;
      left: 50%;
      top: 25px;
      transform: translate(-50%, 0%);
}
  }

</style>

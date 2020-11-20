<template>
<!-- 引入布局 -->
    <el-container class="home-container">
        <!-- 头部 -->
    <el-header>
        <div>
            <img src="../assets/execution.png" class="logo_img" alt />
            <span>
            虚拟仿真实验平台-EXECUTION
            </span>
        </div>
        <el-button  @click="logout">安全退出</el-button>
    </el-header>
    <!-- 主体 -->
    <el-container>
        <!-- 侧边栏 -->
    <el-aside width="350px">
      <el-menu background-color="#0cd268" text-color="#fff" active-text-color="black">
     <div class="toggle-button">|||</div> 
      <!-- 一级菜单 -->
      <el-submenu :index="item.id+''" v-for ="item in menuList" :key="item.id">
        <template slot="title">
          <i class="el-icon-menu"></i>
          <span class="menu_text">{{item.title}}</span>
        </template>
        <!-- 二级菜单 --> 
        <!-- 我的后台是slist,ke 的是sList -->
        <el-menu-item :index="it.path+''" v-for ="it in item.slist" :key="it.id">
            <template slot="title">
              <i class="el-icon-menu"></i>
              <span>{{it.title}}</span>
            </template>
        </el-menu-item>
      </el-submenu>
    </el-menu>
</el-aside>
        <!-- 主体内容 -->
        <el-main>
          <router-view></router-view>
        </el-main>
    </el-container>
</el-container>

</template>


<script>

export default {
    data() {
        return {
            // 左侧菜单列表
            menuList: [],
            iconsObject: {
              '100':'iconfont iconguanliyuan',
              '200':'iconfont iconsport',
              '101':'iconfont icondenglu',
              '102':'iconfont iconmima',
              '103':'iconfont iconsport',
              '104':'iconfont iconshangpin',
              '201':'iconfont iconshu',
              '202':'iconfont iconkaluli',
              '203':'iconfont iconshiwu',
              '204':'iconfont icondenglu',
            },
            isCollapse:false,
            // 被激活的连接
            activePath:'',
        }
    },
  // 类似onload
  created() {
      this.getMenuList();
      this.activePath = window.sessionStorage.getItem('activePath');// 取出session里的访问路径
  },
  methods: {
      //安全退出
    logout() {
      window.sessionStorage.clear();
      this.$router.push("/login");
    },
    // 获取所有的导航菜单
    async getMenuList(){
      //直接解析在res中
      const {data:res} = await this.$http.get("menus");
      console.log(res);
      // if( res.status != 200) return this.$message.error("操作失败！！！");
      if( res.flag != 200) return this.$message.error("操作失败！！！");
      // this.menuList = res.menus;
      this.menuList = res.data;//是个JSON串，所以是mneuList是个[]
    },
    // 切换菜单折叠与展开
    toggleCollapase(){
      this.isCollapse = !this.isCollapse;
    },
//     // 保存二级菜单的路径
//     saveNavState(activePath){
//       window.sessionStorage.setItem('activePath',activePath);// 存放点击的二级菜单
//       this.activePath = activePath;// 给点击的菜单添加高亮
    // },
  }
};


</script>

<style lang="less" scoped>
.el-header {
  background-color: #303137;
  display: flex;
  justify-content: space-between;// 左右贴边
  padding-left: 0%;// 左边界
  align-items: center;// 水平
  color: #fff;
  font-size: 20px;
  > div { //左侧div加布局
    display: flex;
    align-items: center;
    span {
      margin-left: 10px;
    }
  }
}
.el-aside {
  background-color: #0cd268;
  .el-menu{
    border-right: none;// 对其右边框
  }
      .menu_text{
      font-size: 25px;
      font-weight: bold;
    }
}
.el-main {
  background-color: #eaedf1;
}
.home-container {
  height: 100%;
}
.logo_img {
    padding-left: 5%;
  width: 14%;
  height: 100%;
}
.iconfont{
  margin-right: 10px;
}
.toggle-button{
  background-color:#4A5064;
  font-size: 10px;
  line-height: 24px;
  color:#fff;
  text-align: center;
  letter-spacing: 0.2em;
  cursor: pointer;// 显示鼠标指针为：小手
}
</style>

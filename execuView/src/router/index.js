import Vue from 'vue'
import VueRouter from 'vue-router'
import Login from '../components/Login.vue' //引入Login组件
import Home from '../components/Home.vue'
import Welcome from '../components/Welcome.vue'
import Lab from '../components/Lab.vue'

Vue.use(VueRouter)

const routes = [
  //配置路由
  {
    path:"/",
    //重定向到login
    redirect:"/login"
  },
  {
    //转发的东西
    path:"/login",
    //component引入真正的组件
    component:Login,
  },
  
  {
    path:"/home",
    component:Home,  
    redirect:"/welcome",
    children:[
      {path:"/welcome",component:Welcome, },     
    ]
  },
  {
    //转发的东西
    path:"/lab",
    //component引入真正的组件
    component:Lab,
  },
  {
    //转发的东西
    path:"/comehome",
    component:Home,  
    redirect:"/welcome",
    children:[
      {path:"/welcome",component:Welcome, }
  
]
}
]
const router = new VueRouter({
  routes
})
//挂载路由导航守卫
router.beforeEach((to, from, next) => {
  // to:将要访问的路径
  // from:从哪里访问的路径
  // next:之后要做的任务，是一个函数
  //    next（）放行， next（'/URL'）强制跳转的路径。
  if (to.path == '/login') return next();// 访问路径为登录
  if(to.path == '../../public/experiments/list.html') return next();
  // 获取user
  const userFlag = window.sessionStorage.getItem("user");// session取值
  if (!userFlag) return next('/login');// 无值返回登陆页
  next();//符合要求
})


export default router

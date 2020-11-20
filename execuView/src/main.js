import Vue from 'vue'
import App from './App.vue'
import router from './router'
import './plugins/element.js'
import store from './store'
//添加全局样式
import './assets/css/global.css'
//引入iconfont
import './assets/font/iconfont.css'
//导入axios
import axios from 'axios'

import  "./assets/font/font.css"

//全局能使用的跨域请求的挂载的axios
Vue.prototype.$http = axios
//设置默认访问根路径
//"http://192.168.0.135:9000"
axios.defaults.baseURL = "http://localhost:9000"

Vue.config.productionTip = false

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')

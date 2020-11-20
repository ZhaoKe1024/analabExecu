<template>
<div>
 <!-- v-bind:src="getPageUrl"    -->
      <el-button  @click="logout">回到登录页</el-button>
      <span>如未显示页面，请稍等几秒钟</span>
      <iframe name = "iframeMap" id="iframeMapViewComponent"  src="/list.html"
               width="100%" height="500px"
               frameborder="0" scrolling="no" ref="iframeDom"></iframe>
</div>    

</template>

<script>
export default {
    data() {
      return {
        getPageUrl: '/list.html'
      }
    },
    created() {
      // 初始化时为window绑定一个方法
      window['vueDefinedMyProp'] = (receiveParams) => {
        this.receiveParamsFromHtml(receiveParams)
      }
    },
    methods: {
      receiveParamsFromHtml(res) {
        console.log(res)
      },
      invokeHtmlMethod() {
        window.frames['iframeMap'].lodaTable()
      },
      logout() {
      window.sessionStorage.clear();
      this.$router.push("/comehome");
    },
  }
}
</script>

<style lang="less" scoped>
  
</style>
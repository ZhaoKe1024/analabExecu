<template>
    <el-card class="box-card">
        <div slot="header" class="clearfix">
            <span style="font-size:20px">单链表实验</span>
            <el-button style="float: right;background-color:#0cd268" 
            type="success" round @click="start">
            <span @click="start">
            开始实验</span>
            </el-button>
        </div>       
      <el-container>
        <el-aside width="200px">
          <img src="../assets/单链表.png" class="logo_img" alt />
        </el-aside>
        <el-main>
          <span class="text">
              实验目的：了解线性表的链式存储存储结构和顺序存取特性，熟练掌握线性表的链式存储结构的C语言描述方法，熟练掌握动态链表的基本操作，查找、插入、定位等，能在实际应用中选择适当的链式结构。掌握用链表表示特定形式的数据的方法，并能编写出有关运算的算法。
          </span>
        </el-main>
      </el-container>
    </el-card>
</template>

<script>
export default {
    methods: {
    start() {
      this.$router.push("/lab");
    },
    }
}
</script>
<style lang="less" scoped>
  .text {
    font-size: 15px;
  }

  .item {
    margin-bottom: 18px;
  }

  .clearfix:before,
  .clearfix:after {
    display: table;
    content: "";
  }
  .clearfix:after {
    clear: both
  }

  .box-card {
    width: 800px;
    height:250px;
    .logo_img {
      width: 200px;
      height:130px;
    }
    .text{
    font-size: 18px;
    }
  }
</style>
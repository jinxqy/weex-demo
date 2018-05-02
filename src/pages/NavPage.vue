<template>
  <div>
    <text>菜单页</text>
    <div class="link" @click="jumpWeb()">
          <text style="color: #3A95FF;">UI-demo01</text>
    </div>
    <div class="link" @click="jumpWebWX()">
          <text style="color: #3A95FF;">UI-demo02</text>
    </div>
    <div class="link" @click="jumpComponent()">
          <text style="color: #3A95FF;">组件交互</text>
    </div>
    <div class="link" @click="jumpScan()">
          <text style="color: #3A95FF;">扫二维码</text>
    </div>
  </div>
</template>
<style scoped>
  .link {
    font-size: 36;
    display: block;
    margin-top: 100;
    margin-left: 200;   
    border-bottom: 1;   
  }

</style>
<script>
 module.exports = {
 	  //导入navigator模块
    data: function () {
      return {
        
      };
    },
    methods: {
      jumpWeb () {
         this.$router && this.$router.push('/IndexPage')    
      },
      jumpWebWX(){
      	this.$router && this.$router.push('/WXPage')     	
      },
      jumpComponent () {
         this.$router && this.$router.push('/ComponentPage')    
      },
      jumpScan(){
      	 this.$router && this.$router.push('/ScanPage')
      }
    }
  };
</script>

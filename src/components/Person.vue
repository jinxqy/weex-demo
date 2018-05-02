<template>
  <div>
    <text>111</text>
    <div class="button" @click="jumpWeb()">
          go123321
     </div>

    <router-view class="r-box"></router-view>
  </div>
</template>
<style scoped>
  .input {
    font-size: 60px;
    height: 80px;
    width: 750px;
  }
  .button {
    font-size: 36;
    width: 200;
    color: #41B883;
    text-align: center;
    padding-top: 10;
    padding-bottom: 10;
    border-width: 2;
    border-style: solid;
    margin-right: 20;
    border-color: rgb(162, 217, 192);
    background-color: rgba(162, 217, 192, 0.2);
  }
  
  .r-box{
  	height: 30px;
  	width: 200px;
  }
</style>
<script>
 module.exports = {
 	  //导入navigator模块

    data: function () {
      return {
        msg: "123"
      };
    },
    methods: {
      jumpWeb () {
         this.$router && this.$router.push('/HelloWorld')    
      }
    }
  };
</script>

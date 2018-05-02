<template>
  <div>
     <text>{{msg}}</text>
     <text class="button" @click='toIndex'>跳转到首页</text>
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
  var navigator = weex.requireModule('navigator')
  module.exports = {
    data: function () {
      return {
        msg: "123"
      };
    },
    methods: {
      toIndex(){
      	this.msg= "456";
      	navigator.push({
          url: 'http://192.168.31.52:7777/dist/index.js',
          animated: "true"
        })
      }
    }
  };
</script>

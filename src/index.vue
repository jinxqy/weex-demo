<template>
  <div>
<!--     <div class="button" @click="jumpWeb()">
          go
    </div>-->
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
</style>

<script>
  import util from './assets/util';
  import weexVueRouter from 'weex-vue-router'

 
  module.exports = {
    data: function () {
      return {
        msg: "123"
      };
    },
    methods: {
    	
    }
  };
</script>

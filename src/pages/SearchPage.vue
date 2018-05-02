<template>
	<div id="root">
		<div class="navication" style="display:flex; flex-direction: row; height: 100px; background-color: #F6F6F6;">
			<div style="flex: 0.3; justify-content: center;align-items: center; ">
				<text style="color: #9F9F9F;">二手房</text>
			</div>
			<div style="flex: 1;padding-top: 10px; justify-content: left;align-items:center;">
				<input type="text" auto-appear="false" placeholder="请输入小区名或地址" class="input" value=""  @focus="toSearch"/>
			</div>
		    <div style="flex: 0.3; justify-content: center;align-items: center;">
				<text style="color: #9F9F9F;" @click="goBack();">取消</text>
	        </div>
		</div>
		
		<section>
			<div>
			   <div stlye="height: 70; line-height: 70;font-family：'微软雅黑';">
				热门搜索
			   </div>
			   <div style="display: flex; flex-direction: row; justify-content: left; padding-left: 30;">
			      <text class="item-label">邛崃</text><text class="item-label">大邑</text><text class="item-label">新都</text><text class="item-label">郫都区</text><text class="item-label">郫都区</text>
			   </div>
			</div>
			<div style="background-color: #F7F7F7; height: 20;margin-top: 20;"></div>
			<div>
			   <div stlye="height: 70; line-height: 70;font-family：'微软雅黑';">
				历史记录
			   </div>
			</div>
		</section>
	</div>
</template>

<script>
  var navigator = weex.requireModule('navigator')
  module.exports = {
    data: function () {
      return {
        msg: "123"
      };
    },
    methods: {
      goBack(){
      	navigator.push({
          url: 'http://192.168.31.52:7777/dist/index.js',
          animated: "true"
        })
      }
    }
  };
</script>

<style>
	.input {
    font-size: 20px;
    height: 80px;
    width: 470px;
    background-color: #ffffff;
  }
  
  .item-label{
  	background-color: #E6FDEE;
  	color: #54B153;
  	padding: 10;
  	display: inline-block;
  	margin-left: 20;
  }
</style>
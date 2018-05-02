<template>
	<div id="root">
		<div class="navication" style="display:flex; flex-direction: row; height: 100px; background-color: #11A900;">
			<div style="flex: 0.3; justify-content: center;align-items: center; ">
				<text style="color: #ffffff;">成都△</text>
			</div>
			<div style="flex: 1;justify-content: center;align-content: center;">
				<div style="flex-direction: row; height: 70;  background-color: #FFFFFF; justify-content:space-between; align-items: center;" @click="toSearch">
					<image :src="searchSrc" style="width: 44; height: 44;"></image>
					<text style="font-size: 34; color: #cccccc;">找好房，上安居客</text>
					<image :src="scanSrc" style="width: 44; height: 44;"></image>
				</div>
				<!--<input type="text" auto-appear="false" placeholder="找好房，上安居客" class="input" value=""  @focus="toSearch"/>-->
			</div>
		    <div style="flex: 0.3; justify-content: center;align-items: center;display:flex; flex-direction: row;">
		    	<image style="width:50;height:50;flex: 1;" src="http://182.140.223.171/static/image/map.png"></image>
				<text style="color: #ffffff; flex: 1;">地图</text>			
	       </div>
		</div>
		
	    <div class="tab" style="flex-direction: row;">
	        <div v-for="item in items1" style="flex-wrap： wrap-reverse; width: 82px;margin-top: 20;flex:1;justify-content: center; align-items: center;">
	        	<image style="width: 80; height: 80;" :src="item.url"></image>
	        	<text>{{item.name}}</text>
	        </div>
	    </div>
	    
	    <div class="tab" style="flex-direction: row;">
	        <div v-for="item in items2" style="flex-wrap： wrap-reverse; width: 82px;margin-top: 20;flex:1;justify-content: center; align-items: center;">
	        	<image style="width: 100; height: 80;" :src="item.url"></image>
	        	<text>{{item.name}}</text>
	        </div>
	    </div>
	</div>
</template>

<script>
var navigator = weex.requireModule('navigator');
var api = require('./api.js');
module.exports = {
   data: function () {
     return {
       items1:[
          {name: "新房", url: api.source.resurl + "/image/01.png"}, {name: "二手房", url: api.source.resurl + "/image/02.png"}, {name: "租房", url: api.source.resurl + "/image/03.png"},
          {name: "商铺写字楼", url: api.source.resurl + "/image/04.png"}, {name: "海外房产", url: api.source.resurl + "/image/05.png"}        
       ],
       items2: [
          {name: "查房价", url: api.source.resurl + "/image/06.png"},{name: "查房价", url: api.source.resurl + "/image/07.png"}, {name: "找小区", url: api.source.resurl + "/image/08.png"}, 
          {name: "我是业主", url: api.source.resurl + "/image/09.png"},{name: "免费看房", url: api.source.resurl + "/image/10.png"}
       ],
       searchSrc: api.source.resurl + "/image/search.png",
       scanSrc: api.source.resurl + "/image/scan.png"
     };
   },
   methods: {
      toSearch (){
      	  this.$router && this.$router.push('/SearchPage') 
      }
   }
  };
</script>

<style>
.input {
    font-size: 20px;
    height: 80px;
    width: 470px;
    background-color: #E9F5E7;
  }
</style>
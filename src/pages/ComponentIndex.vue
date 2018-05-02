<template>
   <div>
   	<div>
   	  <text>父组件</text>
   	  <input type="text" class="input" v-model="parantParam"/>	  
   	  <text class="button" value="传值" type="primary" @click="setParantParam"></text>
   	  <text>父组件接收到的值为: {{childParam}}</text>
   	  <ChildComponents ref="poster" @childParamEvent="parentLisen"></ChildComponents>
   	</div>
   </div>
</template>

<script>
	import ChildComponents from "../components/childComponent"
	export default{
 	components: {
 		ChildComponents
 	},
    data(){
      return {
      	 parantParam: "",
      	 childParam: ""
      }
    },
    methods: {
      setParantParam(){    	 
      	 const $poster = this.$refs.poster;
      	 if($poster){
      	 	$poster.update(this.parantParam);
      	 }
      },
      parentLisen (evtValue) {  
        this.childParam = evtValue;
　　         }  
    },
    props:["parantParam"]
  }
</script>

<style>
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
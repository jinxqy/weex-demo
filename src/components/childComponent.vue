<template>
	<div>
		<div>
			<text>我是子组件，接收到的参数是：</text>
			<text>{{parantParam}}</text>						
		</div>
		<div>
			<text>我是子组件，向父组件传了一个参数：</text>
			<text></text>	
			<input type="text" class="input" v-model="childParam"/>	  
   	        <text class="button" value="传值" type="primary" @click="setChildParam"></text>
		</div>
	</div>
</template>

<script>
 export default{
 	name: 'childComponent',
    data(){
      return {
      	parantParam: "",
      	childParam: ""
      }
    },
    methods: {
      update (parantParam) {
        this.parantParam = parantParam
      },
      setChildParam (pars) {  
　　　　　　this.$emit('childParamEvent', this.childParam);
　　　　 }  
    },
    props:["message"]
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
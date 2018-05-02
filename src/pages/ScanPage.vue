<template>
  <div class="wrapper center">
    <div class="center">
      <div class="btn center" @click="scan">       
        <text class="btn-text">扫码二维码</text>
		<text>{{ msg }}</text>
      </div>
    </div>
  </div>
</template>

<script>
  const navigator = weex.requireModule('navigator')
  const event = weex.requireModule('event')
  const globalEvent = weex.requireModule('globalEvent')
  export default {
    data: function(){
	  return{
	    msg: ""
	  };
	},
		ready: function () {
          var self = this;
           
           globalEvent.addEventListener("cam_finish", function(e){
				this.msg = "finish";
				event.showToast('finish');
           });
},
    methods: {

      scan () {
        try {
		  this.msg = "ready";
         event.openCamera()
        } catch (e) {
          try {
            navigator.push({ url: 'weex://go/scan' })
          } catch (e) {}
        }
      }
    }
  }
</script>

<style scoped>

</style>

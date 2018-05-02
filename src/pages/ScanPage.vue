<template>
  <div class="wrapper center">
    <div class="center">
      <div class="btn center" @click="scan">       
        <text class="btn-text">扫码二维码</text>
      </div>
    </div>
  </div>
</template>

<script>
  const navigator = weex.requireModule('navigator')
  const event = weex.requireModule('event')
  export default {
    methods: {
      scan () {
        try {
          event.openURL('weex://go/scan')
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

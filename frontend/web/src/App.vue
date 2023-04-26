<template>
  <nav-bar/>
  <router-view></router-view>
</template>

<script>
import NavBar from '@/components/NavBar.vue'
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap/dist/js/bootstrap.js"

export default {
  name: 'App',
  components: {
    NavBar,
  },
  setup() {
  }
}
</script>

<style>
body {
  margin: 0;
}
</style>

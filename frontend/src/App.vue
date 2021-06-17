<template>
  <div id="nav">
    <!--<router-link to="/">Home</router-link> -->
     <h1 id = "headline">Weather page</h1>
  </div>
  <router-view/>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  background-image: url("assets/BG.jpg");
  height: 100%;
  min-height: 100vh;
  background-size: cover;
  background-position-y: -100px;
  background-repeat: no-repeat;
  background-attachment: fixed, scroll;
}

#headline{
  color: white;
}

#nav {
  display: flex;
  padding: 5px;
  justify-content: space-between;
  align-items: center;
}

#nav a {
  font-weight: bold;
  color: #ffffff;
}

body{
  margin: 0;
}
</style>

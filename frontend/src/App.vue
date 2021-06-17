<template>
  <div id="nav">
    <!--<router-link to="/">Home</router-link> -->
     <router-link to="/" id="logo"><img src="./assets/test.png" /></router-link>
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

  height: 100%;
  min-height: 100vh;
  background-size: cover;
  background-position-y: -100px;
  background-repeat: no-repeat;
  background-attachment: fixed, scroll;
}

#nav {
  display: flex;
  padding: 5px;
  justify-content: space-between;
  align-items: center;
}

.buttons {
  margin: 1em;
  display: flex;
}

.buttons h4{
  margin-right: 1em;
}

.buttons a {
  margin-right: 2em;
}

#logo img {
  width: 15em;
  height: auto;
  margin: 1em;
}

#nav a {
  font-weight: bold;
  color: #ffffff;
}

.loggedInUser{
  position: absolute;
  top: 35px;
  font-size: larger;
  right: 80px;
  text-decoration: none;
}
</style>

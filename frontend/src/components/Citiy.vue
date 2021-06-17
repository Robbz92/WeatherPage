<template>
  <div class="container">
    <div class="city">
      <h1>City: {{ city }}</h1>
    </div>
    <div class="sky" v-for="(desc, index) in getWeatherDescription" :key="index">
      <h1>Sky: {{ desc.description }}</h1>
    </div>

    <div class="temperature">
        <h1>Temperature: {{Math.ceil(getWeatherTemp.temp -273.15)}} Celsius</h1>
        <h1>Feels like: {{Math.ceil(getWeatherTemp.temp -273.15)}} Celsius</h1>
        <h1>Max temp: {{Math.ceil(getWeatherTemp.temp_max -273.15)}} Celsius</h1>
        <h1>Min temp: {{Math.ceil(getWeatherTemp.temp_min -273.15)}} Celsius</h1>
        <h1>Pressure: {{getWeatherTemp.pressure}} </h1>
    </div>

    <div class="weatherWind">
        <h1>Speed: {{getWeatherWind.speed}} m/s</h1>
    </div>
  </div>
</template>

<script>
export default {
  props: ["city"],

  computed: {
    getWeatherDescription() {
      // dispatchen för att visa descriptions ligger i /home.vue onclick.
      return this.$store.getters.getWeatherDescription;
    },
    
    getWeatherTemp() {
      // dispatchen för att visa descriptions ligger i /home.vue onclick.
      return this.$store.getters.getWeatherTemp;
    },
    
    getWeatherWind() {
      // dispatchen för att visa descriptions ligger i /home.vue onclick.
      return this.$store.getters.getWeatherWind;
    },
  },
};
</script>

<style scoped>
.container{
    display: flex;
	flex-direction: column;
	flex-wrap: nowrap;
	justify-content: center;
	align-items: center;
	align-content: space-between;
    margin-bottom: 1em;
    padding-bottom: 1em;
    border-bottom: 1px solid rgb(187, 184, 184);
}

</style>
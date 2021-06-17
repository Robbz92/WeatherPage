<template>
  <div class="container">
    <div class="input">
      <input type="text">
      <button @click="search">Search</button>
      <div class="CityCard" v-if="showCity">
         <CityCard :city="city"/>
      </div>
    </div>
  </div>
</template>

<script>
import CityCard from '../components/Citiy.vue'
export default {
  components:{
    CityCard,
  },

  data(){
    return{
      showCity: false,
      city: '',
    }
  },

  methods:{
    search(){
      this.city = document.querySelector('input').value;
      this.$store.dispatch("fetchWeatherDescription", this.city);
      this.$store.dispatch("fetchWeatherTemp", this.city);
      this.$store.dispatch("fetchWeatherWind", this.city);
      this.showCity = true;
    }
  }
}
</script>

<style>

</style>
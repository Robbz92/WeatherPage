import { createStore } from 'vuex'
import axios from 'axios';

export default createStore({
  state: {
    weatherDesc: [],
    weatherTemp: [],
    weatherWind: [],
  },
  mutations: {
    setWeatherDescription(state, payload){
      state.weatherDesc = payload;
    },

    setWeatherTemp(state, payload){
      state.weatherTemp = payload;
    },
    setWeatherWind(state, payload){
      state.weatherWind = payload;
    }
  },
  actions: {
    async fetchWeatherDescription(store, city){
      await axios.get("http://localhost:3000/api/getWeatherDescription/" + city)
      .then(response => {
        this.commit("setWeatherDescription", response.data)
      })
    },

    async fetchWeatherTemp(store, city){
      await axios.get("http://localhost:3000/api/getWeatherTemp/" + city)
      .then(response => {
        console.log(response.data)
        this.commit("setWeatherTemp", response.data)
      })
    },

    async fetchWeatherWind(store, city){
      await axios.get("http://localhost:3000/api/getWeatherWind/" + city)
      .then(response => {
        console.log(response.data)
        this.commit("setWeatherWind", response.data)
      })
    },
  },
  getters:{
    getWeatherDescription(state){
      return state.weatherDesc;
    },

    getWeatherTemp(state){
      return state.weatherTemp;
    },

    getWeatherWind(state){
      return state.weatherWind;
    }
  }
})

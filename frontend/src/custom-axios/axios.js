import axios from "axios";

const instance = axios.create({
  baseURL: 'https://llibrary2022.herokuapp.com/api/',
  headers: {
    'Access-Control-Allow-Origin': '*'
  }
})

export default instance;

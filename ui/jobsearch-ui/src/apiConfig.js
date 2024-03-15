// src/apiConfig.js
const getApiUrl = () => {
    return process.env.REACT_APP_API_URL || "http://localhost:8080";
  };
  
  export default getApiUrl;
  
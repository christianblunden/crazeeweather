(ns crazeeweather.weather
  (:require [clojure.data.json :as json]))

(def city_url "http://api.openweathermap.org/data/2.5/weather?q=%s")

(defn get-city-weather
  [city]
  (-> (format city_url city)
      slurp
      (json/read-str :key-fn keyword)))

(get-city-weather "london")

(require '[clojure.string :as str])

(defn solve [s]
  (let [x (str/split s #" ")]
    (map #(apply str (reverse %)) x)))
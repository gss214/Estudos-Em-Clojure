(require '[clojure.string :as str])
(use '[clojure.test :only [is]])

(defn high-and-low [s]

  (def xs (map #(Integer/parseInt %)
               (str/split s #" ")))

  (str (format "%d %d" (reduce max xs) (reduce min xs))))

(defn tests []

  (is (= (high-and-low "8 3 -5 42 -1 0 0 -9 4 7 4 -4") "42 -9"))
  (is (= (high-and-low "1 2 3") "3 1")))

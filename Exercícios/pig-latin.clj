(require '[clojure.string :as str])
(use '[clojure.test :only [is]])

(defn solve [s]
  (let [x (map #(apply str (concat % (subs % 0 1))) (str/split s #" "))]
    (str/join " " (map #(apply str (concat (subs % 1 (count %)) "ay")) x))))

(defn tests []
  (is (= (solve "Pig latin is cool") "igPay atinlay siay oolcay"))
  (is (= (solve "This is my string") "hisTay siay ymay tringsay")))

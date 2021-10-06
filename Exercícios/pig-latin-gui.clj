(require '[clojure.string :as str])
(use '[clojure.test :only [is]])

(defn solve [s]
  (str/join " " (map #(apply str (concat (reverse %) "ay")) (str/split s #" "))))

(defn testPig []
  (is (= (solve "Pig latin is cool") "igPay atinlay siay oolcay"))
  (is (= (solve "This is my string") "hisTay siay ymay tringsay")))

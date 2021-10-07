(require '[clojure.string :as str])

(defn solve [s]
  (str/join " " (map #(apply str (concat (reverse %) "ay")) (str/split s #" "))))

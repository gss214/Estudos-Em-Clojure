(use '[clojure.test :only [is]])

(defn get-middle [s]
  (cond
    (even? (count s))
    (subs s (- (/ (count s) 2) 1) (+ 1 (/ (count s) 2)))
    (odd? (count s))
    (subs s (/ (count s) 2) (+ 1 (/ (count s) 2)))))

(defn tests []
  (is (= (get-middle "test") "es"))
  (is (= (get-middle "testing") "t"))
  (is (= (get-middle "middle") "dd"))
  (is (= (get-middle "A") "A")))
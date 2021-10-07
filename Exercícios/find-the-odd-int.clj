(use '[clojure.test :only [is]])

(defn find-odd-int [xs]
  (map first (filter (fn [[_ v]] (odd? v)) (frequencies xs))))

(defn tests []

  (is (= (find-odd-int [20 1 -1 2 -2 3 3 5 5 1 2 4 20 4 -1 -2 5]) 5))
  (is (= (find-odd-int [1 1 2 -2 5 2 4 4 -1 -2 5]) -1))
  (is (= (find-odd-int [10]) 10))
  (is (= (find-odd-int [5 4 3 2 1 5 4 3 2 10 10]) 1)))

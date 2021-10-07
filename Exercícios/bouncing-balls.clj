(use '[clojure.test :only [is]])

(defn calculate [h bounce window]
  (if (< h window)
    1
    (+ 2 (calculate (* h bounce) bounce window))))

(defn bouncing-balls [h bounce window]
  (if (and (> h 0) (> bounce 0) (< bounce 1) (< window h))
    (calculate (* h bounce) bounce window)
    -1))

(defn tests []
  (is (= (bouncing-balls 3 0.66 1.5) 3))
  (is (= (bouncing-balls 30 0.66 1.5) 15)))
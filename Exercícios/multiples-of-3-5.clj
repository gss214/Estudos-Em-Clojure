(use '[clojure.test :only [is]])

(defn multiple [x]
  (or (zero? (mod x 3)) (zero? (mod x 5))))

(defn multiples-of-3-and-5 [x]
  (if (neg? x)
    0
    (reduce + (filter multiple (range 1 x)))))

(defn test-multiples-of-3-and-5 []
  (is (= (multiples-of-3-and-5 10) 23))
  (is (= (multiples-of-3-and-5 0) 0))
  (is (= (multiples-of-3-and-5 3) 3))
  (is (= (multiples-of-3-and-5 -9) 0))
  (is (= (multiples-of-3-and-5 20) 78)))
  
  

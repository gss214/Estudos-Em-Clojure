(require '[clojure.test :only [is]])

(defn odd-or-even [xs]
    (if (or (nil? xs) (even? (apply + xs)))
        (str "even")
        (str "odd")))


(defn test-odd-or-even []
  (is (= (odd-or-even [1]) "odd"))
  (is (= (odd-or-even [-1]) "odd"))
  (is (= (odd-or-even [1, -2]) "odd"))
  (is (= (odd-or-even [2, 5, 34, 6]) "odd"))
  (is (= (odd-or-even [0]) "even"))
  (is (= (odd-or-even [2]) "even"))
  (is (= (odd-or-even [-2]) "even"))
  (is (= (odd-or-even [0, -1, -5]) "even"))
  (is (= (odd-or-even []) "even")))

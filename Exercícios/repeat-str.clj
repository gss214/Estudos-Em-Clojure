(use '[clojure.test :only [is]])

(defn repeat-str [n strng]

    (apply str (repeat n strng)))


(defn test-repeat-str []

    (is (= (repeat-str 4 "a") "aaaa"))
    (is (= (repeat-str 3 "hello ") "hello hello hello "))
    (is (= (repeat-str 2 "abc") "abcabc"))
    (is (= (repeat-str 5 "gui") "guiguiguiguigui")))
    


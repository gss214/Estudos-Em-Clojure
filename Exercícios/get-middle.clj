(defn get-middle [s]
    (cond 
        (even? (count s))
        (subs s (- (/ (count s) 2) 1) (+ 1 (/ (count s) 2)))
        (odd? (count s))
        (subs s (/ (count s) 2) ( + 1 (/ (count s) 2)))))
    
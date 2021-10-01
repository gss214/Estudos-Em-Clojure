(defn calculate [h bounce window]
  (if (< h window)
      1
    (+ 2 (calculate (* h bounce) bounce window))))
    
(defn bouncing-balls [h bounce window]
  (if (and (> h 0) (> bounce 0) (< bounce 1) (< window h))
      (calculate (* h bounce) bounce window)
      -1))
      

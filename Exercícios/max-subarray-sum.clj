(defn max-subarray [xs]                                           
        (loop [here 0 sofar 0 ar xs]                                    
              (if (not (empty? ar))                                     
                  (let [x (first ar) new-here (max 0 (+ here x))]       
                    (recur new-here (max new-here sofar) (rest ar)))    
                sofar)))  
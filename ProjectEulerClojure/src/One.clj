(defn one-sum [n]
  (cond (= 1000 n)
    0
    (or (= 0 (mod n 3))(= 0 (mod n 5)))
;    (do (println n) (one-sum (inc n)))
    (+ n (one-sum (inc n)))
    :else (one-sum (inc n))))

(println (one-sum 1))
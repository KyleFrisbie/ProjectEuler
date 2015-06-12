;(defn triangle
;  ([upper-limit]
;    (triangle upper-limit 1))
;  ([upper-limit current]
;    (cond (= upper-limit current)
;      upper-limit
;    :else
;    (+ current (triangle upper-limit (inc current))))))

(defn divisors
  ([n]
    (divisors n 2 0))
  ([n i x]
    (cond (> i (/ n 2))
      (+ 2 x)
      (= 0 (mod n i))
      (divisors n (inc i) (inc x))
      :else
      (divisors n (inc i) x))))

;(defn triangle
;  ([current-sum i]
;    (def x (divisors current-sum))
;    (println current-sum i)
;    (cond (> x 15)
;      current-sum
;      :else
;      (triangle (+ current-sum i) (inc i)))))
;
;(println (triangle 1 2))

(defn triangle [n]
  (def x (* (* (/ 1 2) n) (+ n 1)))
  (cond (> x 499)
    x
    :else
    (triangle (inc n))))

(println (triangle 1))
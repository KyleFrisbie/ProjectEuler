(defn fib-sum [n m]
  (if (> 4000000 (+ n m))
    0
    (+ n (fib-sum (m (+ n m))))))

(println (fib-sum 1 2))
;(defn below-upper [n i]
;  (< 1/2 (/ n 2)))
;
;(defn devides-evenly [n i]
;  (= 0 (mod n i)))
;

;
;(defn largest-primes [n i]
;  (cond (below-upper n i)
;    (cond (and (devides-evenly n i) (is-prime i))
;      (do (println i) (largest-primes n (inc i)))
;      :else (largest-primes n (inc i)))
;    :else nil))
;
;(println (largest-primes 13195 5))

;(defn upper-limit
;  ([n]
;    (upper-limit n 1))
;  ([n i]
;    (if (<= 1/2 (/ i n))
;      i
;      (upper-limit n (inc i)))))

(defn is-prime
  ([i]
    (is-prime i 2))
  ([n i]
    (cond (= n i)
      true
      (not (= 0 (mod n i)))
      (is-prime n (inc i))
      :else false)))

(defn find-primes
  ([n]
    (find-primes n 2))
  ([n i]
    (cond (< (/ n 2) i)
      nil
      (and (= 0 (mod n i)) (is-prime i))
        (cons i (find-primes n (inc i)))
      :else (find-primes n (inc i)))))

(println (find-primes 13195))
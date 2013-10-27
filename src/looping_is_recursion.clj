(ns looping-is-recursion)

(defn power [n k]
  (let [helper (fn [acc num pot]
                 (if (zero? pot)
                   acc
                     (recur (* acc num) num (dec pot))))]
                 (helper 1 n k)))

(defn last-element [coll]
  (if (empty? coll)
    nil
     (if (second coll)
       (recur (rest coll))
       (first coll))))

(defn seq= [a-seq b-seq]
  (cond
   (and (empty? a-seq) (empty? b-seq))
   true
   (or (empty? a-seq) (empty? b-seq))
   false
   (= (first a-seq) (first b-seq))
   (recur (rest a-seq) (rest b-seq))
   :else false))

(defn find-first-index [pred a-seq]
  (loop [acc 0 aseq a-seq funktion pred]
    (if (empty? aseq)
    nil
      (if (funktion (first aseq))
          acc
          (recur (inc acc) (rest aseq) funktion)))))

(defn avg [a-seq]
  -1)

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])


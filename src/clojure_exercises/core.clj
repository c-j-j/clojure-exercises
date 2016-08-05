(ns clojure-exercises.core)

(defn insert-to-left-of [list old new]
  (cond (empty? list) '()
        (= (first list) old) (cons new list)
        :else (cons (first list) (insert-to-left-of (rest list) old new))))

(defn insert-to-right-of [list old new]
  (cond (empty? list) '()
        (= (first list) old) (cons old (cons new (rest list)))
        :else (cons (first list) (insert-to-right-of (rest list) old new))))

(defn insert-multi-to-right-of [list old new]
  (cond (empty? list) '()
        (= (first list) old) (cons old (cons new (insert-multi-to-right-of (rest list) old new)))
        :else (cons (first list) (insert-multi-to-right-of (rest list) old new))))

(defn insert-multi-to-left-of [list old new]
  (cond (empty? list) '()
        (= (first list) old) (cons new (cons old (insert-multi-to-left-of (rest list) old new)))
        :else (cons (first list) (insert-multi-to-left-of (rest list) old new))))

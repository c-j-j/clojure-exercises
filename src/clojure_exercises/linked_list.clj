(ns clojure-exercises.linked-list)

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

(defn replace-first-element [list old new]
  (cond (empty? list) '()
        (= (first list) old) (cons new (rest list))
        :else (cons (first list) (replace-first-element (rest list) old new))))

(defn replace-all-elements [list old new]
  (cond (empty? list) '()
        (= (first list) old) (cons new (replace-all-elements (rest list) old new))
        :else (cons (first list) (replace-all-elements (rest list) old new))))

(defn member? [list a]
  (cond (empty? list) false
        (= a (first list)) true
        :else (member? (rest list) a)))

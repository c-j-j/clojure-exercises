(ns clojure-exercises.linked-list-test
  (:require [clojure.test :refer :all]
            [clojure-exercises.linked-list :refer :all]))

(deftest list-actions
  (testing "find a single element and insert to the left of it"
    (is (= (insert-to-left-of '() 0 1) '()))
    (is (= (insert-to-left-of '(1 2 3 5) 3 4) '(1 2 4 3 5))))
  (testing "find a single element and insert to the right of it"
    (is (= (insert-to-right-of '() 0 1) '()))
    (is (= (insert-to-right-of '(1 2 3 5) 3 4) '(1 2 3 4 5))))
  (testing "find all elements and insert to the right of it"
    (is (= (insert-multi-to-right-of '() 0 1) '()))
    (is (= (insert-multi-to-right-of '(1 2 3 2 5) 2 :b) '(1 2 :b 3 2 :b 5))))
  (testing "find all elements and insert to the left of it"
    (is (= (insert-multi-to-left-of '() 0 1) '()))
    (is (= (insert-multi-to-left-of '(1 2 3 2 5) 2 :b) '(1 :b 2 3 :b 2 5)))))




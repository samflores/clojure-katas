(ns clojure-katas.core-test
  (:require [clojure.test :refer :all]
            [clojure-katas.core :as sut]))

(deftest roman-numeral-value-tests
  (testing "Given a valid number it must give the correct roman numeral"
    (is (= "I" (sut/romanize 1)))
    (is (= "II" (sut/romanize 2)))
    (is (= "III" (sut/romanize 3)))
    (is (= "IV" (sut/romanize 4)))
    (is (= "V" (sut/romanize 5)))
    (is (= "VI" (sut/romanize 6)))
    (is (= "IX" (sut/romanize 9)))
    (is (= "X" (sut/romanize 10)))
    (is (= "XXIX" (sut/romanize 29)))
    (is (= "XLIX" (sut/romanize 49)))
    (is (= "LXXXIX" (sut/romanize 89)))
    (is (= "XCVIII" (sut/romanize 98)))
    (is (= "CCCXCIX" (sut/romanize 399)))))

;; (run-tests 'romannumeral.tests)

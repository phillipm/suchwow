(ns such.f-casts (:require [such.casts :as cast])
  (:use midje.sweet))

(fact "as-ns-symbol"
  (cast/as-ns-symbol *ns*) => 'such.f-casts
  (cast/as-ns-symbol 'some.namespace) => 'some.namespace
  (cast/as-ns-symbol 'clojure.core/food) => 'food
  (cast/as-ns-symbol (namespace 'clojure.core/food)) => 'clojure.core)

(def local)

(fact "as-var-name-symbol"
  (cast/as-var-name-symbol 'foo) => 'foo
  (cast/as-var-name-symbol 'clojure.core/foo) => 'foo
  (cast/as-var-name-symbol #'clojure.core/even?) => 'even?
  (cast/as-var-name-symbol #'local) => 'local
  (cast/as-var-name-symbol "local") => 'local)
  

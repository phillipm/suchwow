(ns such.clojure.other-namespace
  "This is used to show what happens if you try to immigrate a var whose name already has
   been used to refer to a different namespace.")


(defn namespace? [] "I will survive! I'll stay alive!")

;; vars without values are not immigrated
(def ^:private not-immigrated)

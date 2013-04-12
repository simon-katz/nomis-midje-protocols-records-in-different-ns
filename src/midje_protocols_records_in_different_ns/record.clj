(ns midje-protocols-records-in-different-ns.record
  (require [midje-protocols-records-in-different-ns.protocol
            :refer [P]]))

(defrecord R
    []
  P
  (f [self] 42))

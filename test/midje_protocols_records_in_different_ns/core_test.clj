(ns midje-protocols-records-in-different-ns.core-test
  (:use midje.sweet
        midje-protocols-records-in-different-ns.protocol
        midje-protocols-records-in-different-ns.record))

(fact (f (->R)) => 42)

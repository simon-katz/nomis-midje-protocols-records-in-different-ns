(ns midje-protocols-records-in-different-ns.protocol)

(println "Loading `defprotocol` namespace")

(defprotocol P
  (f [self]))

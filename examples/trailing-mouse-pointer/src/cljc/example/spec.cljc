(ns example.spec
  (:require
    #?(:clj  [clojure.spec :as s]
       :cljs [cljs.spec :as s])))

(s/def :ex/x integer?)
(s/def :ex/y integer?)

(s/def :mouse/pos
  (s/keys :req-un [:ex/x :ex/y]))

(s/def :cmd/show-all #{:local :server})

(s/def :mouse/hist (s/* :mouse/pos))

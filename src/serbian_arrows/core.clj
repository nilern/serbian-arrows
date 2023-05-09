(ns serbian-arrows.core
  (:refer-clojure :exclude [->>]))


(defmulti expand-sink (fn [callee _ _ _] callee))


(defmethod expand-sink 'sequence [_ _ xform seq-form]
  `(sequence ~xform ~seq-form))


(defmethod expand-sink 'into [_ args xform seq-form]
  `(into ~@args ~xform ~seq-form))


(defmethod expand-sink 'eduction [_ _ xform seq-form]
  `(eduction ~xform ~seq-form))


(defmethod expand-sink 'reduce [_ args xform seq-form]
  (case (count args)
    1 `(transduce ~xform (completing ~(first args)) ~seq-form)
    2 `(transduce ~xform (completing ~(first args)) ~(second args) ~seq-form)))


(defmacro ->> [seq-form & forms]
  (let [xforms (butlast forms)
        [callee & args] (last forms)]
    (expand-sink callee args `(comp ~@xforms) seq-form)))

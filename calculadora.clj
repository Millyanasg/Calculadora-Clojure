(defn calculator []
  (loop []
    (println "Enter a calculation or type 'quit' to exit:")
    (let [input (read-line)]
      (when-not (= input "quit")
        (let [result (eval (read-string input))]
          (println (str "Result: " result))
          (recur))))))

(calculator)
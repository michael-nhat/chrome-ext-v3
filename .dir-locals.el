(
    (clojure-mode .
        (
            (cider-preferred-build-tool . shadow)
            ;; (cider-clojure-cli-aliases . ":cider")
            (cider-default-cljs-repl . shadow)
            (cider-shadow-watched-builds . 
                ("ext"))
            (cider-shadow-default-options . "ext")
)))

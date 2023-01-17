(ns demo.sw
  (:require [shadow.cljs.modern :refer (js-await)]
            ;; [shadow.cljs.repl :refer [setup]]
            ;; [cljs.repl :as repl?]
            ;; [clojure.browser.repl :as repl]
            ;; [cljs.repl.browser :as browser]
;;  [cider.piggieback :as pback]
            ;; [cljs.repl.browser :as browser]
            ))
(defprotocol IJavaScriptEnv
  (-setup [this opts])
  (-evaluate [this filename line js])
  (-load [this ns url])
  (-tear-down [this]))
(defn on-alarm []
  (js/chrome.action.setBadgeText #js {:text ""})
  (js/chrome.notifications.create
   (clj->js
    {:type "basic"
     :iconUrl "/stay_hydrated.png"
     :title "Time to hydrate"
     :message "Everyday I'm Guzzlin'!"
     :buttons [{:title "Keep it Flowing."}]
     :priority 0}))

  (js/console.log "on-alarm done"))

(defn init []
  ;; (js/chrome.alarms.onAlarm.addListener on-alarm)
  ;; (js/chrome.notifications.onButtonClicked.addListener
  ;;  (fn []
    ;;  (js-await [^js item (js/chrome.storage.sync.get #js ["minutes"])]
    ;;            (js/chrome.action.setBadgeText #js {:text "ON"})
    ;;            (js/chrome.alarms.create #js {:delayInMinutes (.-minutes item)}))))

  (js/console.log "sw init done")
  ;; (def env (browser/repl-env)) ;; create a new environment
  ;; (repl/repl env) ;; start the REPL
  ;; (setup )
  )
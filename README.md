# Chrome Extension v3 in CLJS

Ported [this example](https://github.com/GoogleChrome/chrome-extensions-samples/tree/17956f44b6f04d28407a4b7eee428611affd4fab/examples/water_alarm_notification) to use ClojureScript with shadow-cljs.

Clone this repo and run

```
npm install
npx shadow-cljs watch ext
# or
npx shadow-cljs release ext
```

Then load the `ext` folder as an "Unpacked Extension" via [Chrome Extensions](chrome://extensions/).

Written using the "modern" [:target :esm](https://shadow-cljs.github.io/docs/UsersGuide.html#target-esm), which appears to work fine. Manifests no longer need to be modified by the build because ESM can load additional files on its own (as done with the `:shared` module).

Only relevant change over the JS version was adding `"type": "module` to the `"background"` in `manifest.json`. As well as `type="module"` in the `popup.html`.

For me the notification doesn't actually show and I'm not sure why. Might be because I blocked Chrome from showing Notifications, but I can't find any indicator about any of that. The code does load and run fine which is all I wanted to show.


target only is :browser but it is :custom??
disable?? chagnge to brwoser it trying to connect ws//9630


If you want to build a specific thing you should configure a build using one of the provided build-targets. Most of them automatically inject the necessary code for a ClojureScript REPL. It should not require any additional configuration. For the build CLJS REPL to work you need 2 things

a running watch for your build

connect the JS runtime of the :target. Meaning if you are using the :browser target you need to open a Browser that has the generated JS loaded. For node.js builds that means running the node process.

Once you have both you can connect to the CLJS REPL via the command line or from the Clojure REPL.


https://github.com/Termina/tab-searching/blob/master/shadow-cljs.edn

https://github.com/binaryage/chromex

https://github.com/thheller/shadow-cljs/issues/279

https://github.com/thheller/shadow-cljs/issues/902

https://clojurians-log.clojureverse.org/shadow-cljs/2019-11-05

cung co nhung ban build binh thuong, khong dung :esn 
va phai deal voi v3 prohibit repl

like this
https://github.com/thheller/shadow-cljs/issues/470\


https://github.com/thheller/shadow-cljs/issues/508


https://oli.me.uk/clojure-socket-prepl-cookbook/

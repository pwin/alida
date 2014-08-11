(defproject alida "pw0.1.3"
  :description "Crawling, scraping and indexing application."
  :url "https://github.com/pwin/alida"
  :license {:name "Apache License, version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2311"]
                 [org.clojure/data.json "0.2.5"]
                 [clj-http "1.0.0"]
                 [enlive "1.1.5"]
                 [org.jsoup/jsoup "1.7.3"]
                 [com.ashafa/clutch "0.4.0-RC1"]
                 [clj-time "0.8.0"]
                 [org.apache.lucene/lucene-core "4.9.0"]
                 [org.apache.lucene/lucene-queryparser "4.9.0"]
                 [org.apache.lucene/lucene-analyzers-common "4.9.0"]
                 [clj-http-fake "0.7.8"]]
  :exclusions [lein-swank swank-clojure])

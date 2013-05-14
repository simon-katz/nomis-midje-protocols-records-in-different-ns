Illustration of a problem I was having with Midje.

See [this conversation on the Midje Google group](https://groups.google.com/d/msg/midje/8PbFzHoBpWQ/n8S2u9IeVKEJ).

Brian Marick found that the problem is caused by a missing colon before the `require` in the following form:

    (ns midje-protocols-records-in-different-ns.record
      (require [midje-protocols-records-in-different-ns.protocol
                :refer [P]]))

This is not a Midje problem — it's a problem with Clojure or with [clojure.tools.namespace](https://github.com/clojure/tools.namespace).

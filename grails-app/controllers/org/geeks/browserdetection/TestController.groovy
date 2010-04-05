package org.geeks.browserdetection

class TestController {
    def userAgentIdentService
    def index = {
        println "Is it Firefox ${userAgentIdentService.isFirefox()}"
        println "Is it Chrome ${userAgentIdentService.isChrome()}"
        println userAgentIdentService.getPlatform() == "iPhone"
        render text: "Hello world"
    }
}

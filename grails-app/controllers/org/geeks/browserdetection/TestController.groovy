package org.geeks.browserdetection

class TestController {
    def userAgentIdentService
    def index = {
        println "Is it Firefox ${userAgentIdentService.isFirefox()}"
        println "Is it Chrome ${userAgentIdentService.isChrome()}"
        println "Is it Safari ${userAgentIdentService.isSafari()}"
        println "Is it OSX ${userAgentIdentService.getOperatingSystem()}"
        println "Platform: "  + userAgentIdentService.getPlatform()
        println "Browser version: " + userAgentIdentService.getBrowserVersion()
        println "Language: " + userAgentIdentService.getLanguage()
        println "Operating system: " + userAgentIdentService.getOperatingSystem()
        render text: "Hello world"
    }
}

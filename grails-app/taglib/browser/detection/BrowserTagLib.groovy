package browser.detection

class BrowserTagLib {
    static namespace = "browser"
    def userAgentIdentService

    def isMsie = { attrs, body ->
        if(userAgentIdentService.isMsie()) {
            out << body()
        }
    }

    def isFirefox = { attrs, body ->
        if(userAgentIdentService.isFirefox()) {
            out << body()
        }
    }
    def isChrome = { attrs, body ->
        if(userAgentIdentService.isChrome()) {
            out << body()
        }
    }

    def isSafari = { attrs, body ->
        if(userAgentIdentService.isSafari()) {
            out << body()
        }
    }

    def isBlackberry = { attrs, body ->
        if(userAgentIdentService.isBlackberry()) {
            out << body()
        }
    }

    def isSeamoneky = { attrs, body ->
        if(userAgentIdentService.isSeamonkey()) {
            out << body()
        }
    }
    def isiPhone = { attrs, body ->
        if(userAgentIdentService.getPlatform() == "iPhone") {
            out << body()
        }
    }
    def isiPad = { attrs, body ->
        if(userAgentIdentService.getPlatform() == "iPad") {
            out << body()
        }
    }
    def isWindows = { attrs, body ->
        if(userAgentIdentService.getPlatform() == "Windows") {
            out << body()
        }
    }

    def isOpera = { attrs, body ->
        if(userAgentIdentService.isOpera()) {
            out << body()
        }
    }
}

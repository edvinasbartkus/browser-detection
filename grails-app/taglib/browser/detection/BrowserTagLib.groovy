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
    def isOpera = { attrs, body ->
        if(userAgentIdentService.isOpera()) {
            out << body()
        }
    }

    def isIE6 = { attrs, body ->
      if(userAgentIdentService.isMsie() && userAgentIdentService.getBrowserVersion() == 6) {
          out << body()
      }
    }

    def isIE7 = { attrs, body ->
      if(userAgentIdentService.isMsie() && userAgentIdentService.getBrowserVersion() == 7) {
        out << body()
      }
    }

    def isIE8 = { attrs, body ->
      if(userAgentIdentService.isMsie() && userAgentIdentService.getBrowserVersion() =~ /^8\.0/) {
        out << body()
      }
    }

    def isIE9 = {
      if(userAgentIdentService.isMsie() && userAgentIdentService.getBrowserVersion() =~ /^9\./) {
          out << body()
      }
    }

    def isLinux = { attrs, body ->
      if(userAgentIdentService.isLinux()) {
        out << body()
      }
    }

    def isOSX = { attrs, body ->
      if(userAgentIdentService.isOSX()) {
        out << body()
      }
    }

    def isWindows = { attrs, body ->
      if(userAgentIdentService.isWindows()) {
        out << body()
      }
    }
}

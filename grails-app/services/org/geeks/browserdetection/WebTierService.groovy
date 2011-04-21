package org.geeks.browserdetection

import org.springframework.web.context.request.RequestContextHolder as RCH

class WebTierService {

    boolean transactional = false
    def getRequest() {
        return RCH.currentRequestAttributes().currentRequest
    }

    def getSession() {
        return RCH.currentRequestAttributes().session
    }
}

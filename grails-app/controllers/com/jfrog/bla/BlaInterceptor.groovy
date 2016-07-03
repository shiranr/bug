package com.jfrog.bla

class BlaInterceptor {


    BlaInterceptor() {
        matchAll()
    }

    boolean before() {
        println("URI: ${request.getRequestURI()} BUT PARAM IS: ${params.path}")
        return true
    }
}

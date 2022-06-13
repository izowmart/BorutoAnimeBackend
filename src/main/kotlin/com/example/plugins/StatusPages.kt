package com.example.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.statuspages.*


fun Application.configureStatusPages() {
    install(StatusPages) {

//        status(HttpStatusCode.NotFound){
//            call.respond(
//                message = "Page not Found",
//                status = HttpStatusCode.NotFound
//            )
//        }
    }
}


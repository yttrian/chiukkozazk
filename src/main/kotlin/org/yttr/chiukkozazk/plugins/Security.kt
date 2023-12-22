package org.yttr.chiukkozazk.plugins

import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.sessions.Sessions

fun Application.configureSecurity() {
    install(Sessions) {
    }
}

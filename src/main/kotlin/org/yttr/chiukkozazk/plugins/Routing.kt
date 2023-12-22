package org.yttr.chiukkozazk.plugins

import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.resources.Resources
import io.ktor.server.routing.routing
import io.ktor.server.webjars.Webjars

fun Application.configureRouting() {
    install(Resources)
    install(Webjars)

    routing {
    }
}

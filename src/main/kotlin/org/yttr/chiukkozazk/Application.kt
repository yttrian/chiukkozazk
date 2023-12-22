package org.yttr.chiukkozazk

import io.ktor.server.application.Application
import org.yttr.chiukkozazk.plugins.configureMonitoring
import org.yttr.chiukkozazk.plugins.configureRouting
import org.yttr.chiukkozazk.plugins.configureSecurity

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureSecurity()
    configureMonitoring()
    configureRouting()
}

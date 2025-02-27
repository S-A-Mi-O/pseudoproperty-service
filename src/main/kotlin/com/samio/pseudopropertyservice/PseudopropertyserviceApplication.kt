package com.samio.pseudopropertyservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.FilterType
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@ComponentScan(
    basePackages = ["com.samio.pseudopropertyservice", "com.samio.core"])
@EntityScan(
    "com.samio.pseudopropertyservice.model",
    "com.samio.core.model.concretion.permission",
    "com.samio.core.model.concretion.permissionuserassociation"
)
@EnableJpaRepositories(
    basePackages = ["com.samio.pseudopropertyservice.persistence", "com.samio.core.persistence"])
@EnableScheduling
class PseudopropertyserviceApplication

fun main(args: Array<String>) {
    runApplication<PseudopropertyserviceApplication>(*args)
}

plugins {
    id("fivesix.personalops.gradle.version-catalog") version "0.1.0"
}

javaPlatform {
    allowDependencies()
}

dependencies {
    constraints {
        api(libs.spring.core)
        api(libs.spring.context)
        api(libs.spring.beans)
        api(libs.spring.web)
        api(libs.spring.web.mvc)
        api(libs.spring.security.core)
        api(libs.spring.security.web)
        api(libs.spring.jdbc)
        api(libs.spring.tx)
        api(libs.spring.boot.autoconfigure)
        api(libs.spring.kafka)

        api(libs.spring.boot.jpa)
        api(libs.spring.boot.jdbc)
        api(libs.spring.boot.data.jdbc)
        api(libs.spring.boot.mongodb)
        api(libs.spring.boot.jooq)
        api(libs.spring.boot.redis)
        api(libs.spring.boot.kafka)

        api(libs.spring.boot.web)
        api(libs.spring.boot.webflux)
        api(libs.spring.boot.thymeleaf)

        api(libs.spring.boot.integration.core)
        api(libs.spring.boot.integration.kafka)
        api(libs.spring.boot.integration.jms)
        api(libs.spring.boot.integration.jdbc)
        api(libs.spring.boot.integration.webflux)
        api(libs.spring.boot.integration.http)

        api(libs.spring.boot.aop)
        api(libs.spring.boot.actuator)
        api(libs.spring.boot.validation)
        api(libs.spring.boot.configuration.processor)

        api(libs.spring.boot.security)
        api(libs.spring.boot.oauth2.server)
        api(libs.spring.boot.oauth2.resource.server)
        api(libs.spring.boot.oauth2.jose)

        api(libs.spring.cloud.commons)
        api(libs.spring.cloud.config)
        api(libs.spring.cloud.gateway)
        api(libs.spring.cloud.netflix.client)
        api(libs.spring.cloud.netflix.server)
        api(libs.spring.cloud.openfeign)

        api(libs.spring.openapi.ui)
        api(libs.spring.openapi.common)
        api(libs.spring.openapi.webflux.ui)

        api(libs.liquibase)
        api(libs.postgres)
        api(libs.mongodb)
        api(libs.elasticsearch)
        api(libs.jooq)

        api(libs.lombok)
        api(libs.mapstruct)
        api(libs.mapstruct.processor)
        api(libs.lombok.mapstruct.binding)
        api(libs.kotlin.logging)
        api(libs.jakarta.annotation.api)
        api(libs.jooq.codeGen)
        api(libs.jooq.meta.extentions)
        api(libs.jetbrains.annotations)
        api(libs.slf4j.api)

        api(libs.jackson.core)
        api(libs.jackson.annotations)
        api(libs.jackson.databind)
        api(libs.jackson.datatype)
        api(libs.jackson.module)
        api(libs.jackson.koltin)

        api(libs.jjwt.api)
        api(libs.jjwt.impl)
        api(libs.jjwt.jackson)
        api(libs.nimbus.oauth2.sdk)
        api(libs.nimbus.jwt)

        api(libs.h2)
        api(libs.spring.boot.test)
        api(libs.spring.security.test)
        api(libs.junit.launcher)
        api(libs.junit)
        api(libs.testcontainers)
        api(libs.testcontainers.postgres)
        api(libs.testcontainers.junit)
    }
}

components.named<AdhocComponentWithVariants>("javaPlatform") {
    addVariantsFromConfiguration(configurations.versionCatalogElements.get()) {
        mapToOptional()
    }
}

publishing {
    publications.named<MavenPublication>("javaPlatform") { pom { packaging = "pom" } }
}
package com.service1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 *
 * @author Eze Q.
 * @version v1.0.0
 * @since v1.0.0
 */
@RestController
@RequestMapping("/")
public class Service1CommandController {

    @GetMapping
    public Mono<String> greeting() {
        return Mono.just("Hello from service 1");
    }

}

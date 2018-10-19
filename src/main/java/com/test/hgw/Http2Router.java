package com.test.hgw;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * Http2 the router.
 *
 * @author dor
 */
@Configuration
public class Http2Router {

    @Bean
    public RouterFunction<ServerResponse> route(Http2Handler http2Handler) {

        return RouterFunctions
                .route(RequestPredicates.GET("/test").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), http2Handler::hello);
    }
}

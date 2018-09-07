package com.test.hgw;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

/**
 * Http2 the client.
 * @author dor
 */
public class Http2Client {
	private WebClient client = WebClient.create("https://localhost:8443");

	private Mono<ClientResponse> result = client.get()
			.uri("/test")
			.accept(MediaType.TEXT_PLAIN)
			.exchange();

	public String getResult() {
		return ">> result = " + result.flatMap(res -> res.bodyToMono(String.class)).block();
	}
}

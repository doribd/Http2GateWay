package com.test.hgw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Http2 application, poc.
 *
 * @author dor
 */
@SpringBootApplication
public class HgwApplication {

    public static void main(String[] args) {
        SpringApplication.run(HgwApplication.class, args);

        Http2Client gwc = new Http2Client();
    }
}

package com.example.rocknrollalbumart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableConfigServer
public class RocknRollAlbumArtApplication {

    public static void main(String[] args) {
        SpringApplication.run(RocknRollAlbumArtApplication.class, args);
    }

}

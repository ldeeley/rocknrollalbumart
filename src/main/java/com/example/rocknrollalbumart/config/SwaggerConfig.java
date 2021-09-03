package com.example.rocknrollalbumart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.function.Predicate;


@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(myApiInfo())
                .select()
                .apis(Predicate.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))  //removes Spring Boot API's
                .build();
    }

    private ApiInfo myApiInfo(){
        return new ApiInfoBuilder()
                .title("RocknRollAlbumArt API")
                .contact(new Contact("Lester Deeley","www.trymyapi.net","lester.deeley@yahoo.com"))
                .termsOfServiceUrl("Anyone can use this. Enjoy")
                .description("This API can be used to maintain/browse a gallery of Album Art")
                .version("V0.1")
                .build();
    }

}

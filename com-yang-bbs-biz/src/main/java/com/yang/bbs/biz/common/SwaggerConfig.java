package com.yang.bbs.biz.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Map;

/**
 * @author yangqf
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends WebMvcConfigurationSupport {

    @Bean
    public Docket customDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo());
    }

    @Override
    protected Map<String, MediaType> getDefaultMediaTypes() {
        return super.getDefaultMediaTypes();
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("yangqf", "https://www.fxiaoke.com", "yangqf@fxiaoke.com");
        return new ApiInfo("bbs",
                "bbs",
                "1.0.1",
                "",
                contact,
                "bbs",
                ""
        );
    }
}
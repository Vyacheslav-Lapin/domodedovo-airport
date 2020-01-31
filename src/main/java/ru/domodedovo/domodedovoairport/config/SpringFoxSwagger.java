package ru.domodedovo.domodedovoairport.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@Configuration
@EnableSwagger2WebMvc
@Import(SpringDataRestConfiguration.class)
public class SpringFoxSwagger {

  @Bean
  Docket api() {
    return new Docket(springfox.documentation.spi.DocumentationType.SWAGGER_2)
               .select()
               .apis(springfox.documentation.builders.RequestHandlerSelectors.any())
               .paths(springfox.documentation.builders.PathSelectors.any())
               .build();
  }
}

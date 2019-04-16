package com.client.restful;

import java.io.FileReader;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableDiscoveryClient
@EnableSwagger2
@SpringBootApplication
public class ClientApiApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(ClientApiApplication.class, args);
	}

	@Bean
	public Docket api() throws Exception {
		MavenXpp3Reader reader = new MavenXpp3Reader();
		Model model = reader.read(new FileReader("pom.xml"));
		ApiInfoBuilder builder = new ApiInfoBuilder().title("Client Service Api Documentation")
				.description("Documentation automatically generated").version(model.getVersion())
				.contact(new Contact("Felipe Zuniga", "www.ejercicio.com", "felipe.zus@gmail.com"));
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.client.restful.api")).paths(PathSelectors.any()).build()
				.apiInfo(builder.build());
	}

	@Bean
	UiConfiguration uiConfig() {
		return new UiConfiguration("validatorUrl", "list", "alpha", "schema",
				UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS, false, true, 60000L);
	}

}

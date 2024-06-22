package me.dio.java_api_cloud;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = {@Server(url = "/", description = "Default Server URL")}) //CORS
@SpringBootApplication
public class JavaApiCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaApiCloudApplication.class, args);
	}

}

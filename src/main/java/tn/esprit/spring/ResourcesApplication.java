package tn.esprit.spring;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import tn.esprit.spring.entity.Resources;
import tn.esprit.spring.repository.ResourcesRepository;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ResourcesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResourcesApplication.class, args);
	}
	@Bean
	ApplicationRunner init(ResourcesRepository mpRepository) {
		Resources r1=new Resources( "nomEmploye1", "25874963","specialité 1",5);
		Resources r2=new Resources( "nomEmploye1", "25874963","specialité 1",5);
		return args -> {
			Stream.of(r1,r2).forEach(r -> {
				mpRepository.save(r);
			});
		};
       }
}

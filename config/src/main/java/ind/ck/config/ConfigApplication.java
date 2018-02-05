package ind.ck.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
//@EnableDiscoveryClient
@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
//@RestController
@EnableFeignClients
@ComponentScan(basePackages = {"ind.ck.config"})
public class ConfigApplication {

//	@Value("${ck}")
//	String name = "World";
//
//	@Value("${server.port}")
//	String port;



	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
	}
}

package ind.ck.mserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MserverApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(MserverApplication.class).web(true).run(args);
	}
}

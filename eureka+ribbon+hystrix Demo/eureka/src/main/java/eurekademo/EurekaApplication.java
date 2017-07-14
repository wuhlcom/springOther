package eurekademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @author jon
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaServer
@EnableDiscoveryClient
public class EurekaApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaApplication.class, args);
	}

}

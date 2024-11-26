package kopo.poly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


//@EnableDiscoveryClient - Kubernetes 배포로 인해 제거
@EnableJpaRepositories
@EnableFeignClients
@SpringBootApplication
public class NoticeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoticeServiceApplication.class, args);
	}

}
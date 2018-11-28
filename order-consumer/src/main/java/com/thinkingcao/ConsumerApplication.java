package com.thinkingcao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * <pre>
 * &#64;author cao_wencao
 * &#64;date 2018年11月14日 上午10:16:42
 * </pre>
 */
@SpringBootApplication
@EnableEurekaClient
public class ConsumerApplication {

	/**
	 * <pre>
	 *   
	 * &#64;author cao_wencao
	 * &#64;param args
	 * </pre>
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);

	}
 
	// @LoadBalanced就能让这个RestTemplate在请求时拥有客户端负载均衡的能力
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

}

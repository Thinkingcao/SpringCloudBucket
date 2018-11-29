package com.thinkingcao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * <pre>
 * @author cao_wencao
 * @date 2018年11月27日 上午9:44:58
 * </pre>
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	/**
	 * <pre>  
	 * @author cao_wencao
	 * @param args
	 * </pre>  
	 */
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);

	}

}

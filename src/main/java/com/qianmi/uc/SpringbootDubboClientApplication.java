package com.qianmi.uc;

import com.qianmi.uc.service.HelloConsumerComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootDubboClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringbootDubboClientApplication.class, args);
		HelloConsumerComponent helloService = run.getBean(HelloConsumerComponent.class);
		helloService.findMyName();
	}
}

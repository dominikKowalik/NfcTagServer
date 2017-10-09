package com.dominik.kowalik.nfctagserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
public class NfcTagServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(NfcTagServerApplication.class, args);
	}
}

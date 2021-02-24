package ph.com.metrobank.eurekaserver.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${eureka.client.register-with-eureka}")
	private String test;
	
	@GetMapping("/test")
	public String test() {
		return "Value of test: " + test;
	}
	
}

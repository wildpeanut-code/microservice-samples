package ph.com.metrobank.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/store")
public class StoreController {

	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@GetMapping("/getMacbeth")
	public String getMacbeth() {
		String url = "http://localhost:9095/macbeth/show";
		return webClientBuilder.build()
							   .get()
							   .uri(url)
							   .retrieve()
							   .bodyToMono(String.class)
							   .block();
	}
}

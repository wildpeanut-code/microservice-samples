package ph.com.metrobank.supplier.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/macbeth")
public class MacbethController {

	@Value("${my.greeting}")
	private String msg;
	
	@GetMapping("/show")
	public String show() {
		return "Welcome to the macbeth store & "+msg;
	}
}

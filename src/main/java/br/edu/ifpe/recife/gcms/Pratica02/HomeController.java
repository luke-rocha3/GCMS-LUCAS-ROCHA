package br.edu.ifpe.recife.gcms.Pratica02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, goku!";
	}

	@RequestMapping("/lucas")
	public @ResponseBody String greetingFulano() {
		return "Hello, Lucas Gabriel!";
	}

	@RequestMapping("/pessoa")
	public @ResponseBody String greetingPessoa() {
		return "Hello, Lucas Gabriel!";
	}

}

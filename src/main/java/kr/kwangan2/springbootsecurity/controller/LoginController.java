package kr.kwangan2.springbootsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String login() {
		return "/login";
	}
	
	@GetMapping("/loginSuccess")
	public String loginSuccess(){
		return "/loginSuccess";
	}
	
	@GetMapping("/accessDenined")
	public String accessDenined() {
		return "/accessDenined";
	}
}

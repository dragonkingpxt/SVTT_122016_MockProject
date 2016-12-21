package vn.com.fpt.mockproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping(value="/login")
	public String showLogin(Model model){
		model.addAttribute("message", "sdsdsd");
		return "login";
	}
}

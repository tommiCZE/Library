package cz.tommi.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Hello {
	
	@RequestMapping(value="/user/{userName}/book/{nameOfBook}", method=RequestMethod.GET)
	public String hello(@PathVariable("nameOfBook") String bookName, 
			@PathVariable("userName") String userName, Model model,
			@MatrixVariable(pathVar="userName") Map<String, String> userMatrixVariable) {
		model.addAttribute("book", bookName);
		model.addAttribute("user", userName);
		return "hello";
	}
}

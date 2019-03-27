package com.proyectofinal.clublaemilia.contrladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControladorIndex {
	
	@RequestMapping({"","/", "index", "index.html"})
	public String index() {
		
		return "index";
	}

}

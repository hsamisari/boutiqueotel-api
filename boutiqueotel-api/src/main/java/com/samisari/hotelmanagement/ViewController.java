package com.samisari.hotelmanagement;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

	@RequestMapping({ "/login", "/registration", "/calander" })
	public String index() {
		return "forward:/index.html";
	}
}
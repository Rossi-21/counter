package com.rossi21.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/your_server")
	public String index(HttpSession session) {
		int count = 0;
		
		if (session.getAttribute("count") == null) {
			// Use setAttribute to initialize the count in session
			session.setAttribute("count", 0);
			}
			else {
			// increment the count by 1 using getAttribute and setAttribute
				count = (int) session.getAttribute("count");
				count++;
				session.setAttribute("count", count);
			}
		return "index.jsp";
	}
	@RequestMapping("/your_server/counter")
	public String counter(HttpSession session ) {
		
		return "counter.jsp";
	}
	
}

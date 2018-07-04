/**
 * 
 */
package net.bp.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Ben
 *
 */
@Controller
public class PageController {
	@RequestMapping(value = { "/","/home", "/index" })
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Welcome to my app");
		return mv;
	}
}

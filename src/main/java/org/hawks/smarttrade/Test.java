package org.hawks.smarttrade;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Test {

	@RequestMapping("/showmessage")
	public ModelAndView getView() {
		return new ModelAndView("showMessage");
	}
	
}

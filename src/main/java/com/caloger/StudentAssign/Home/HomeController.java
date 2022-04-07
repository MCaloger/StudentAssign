package com.caloger.StudentAssign.Home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {
    public ModelAndView HomePage() {
        return new ModelAndView("index");
    }
}

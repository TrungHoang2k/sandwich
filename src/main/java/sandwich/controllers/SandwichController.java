package sandwich.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SandwichController {

    @RequestMapping("/order")
    public ModelAndView order(){
        ModelAndView modelAndView = new ModelAndView("view/order.jsp");
        return modelAndView;
    }

    @PostMapping("/showList")
    public ModelAndView showList(@RequestParam Long lettuce,@RequestParam Long tomato,@RequestParam Long mustard,@RequestParam Long sprouts){
        ModelAndView modelAndView = new ModelAndView("/view/showList.jsp");
        return modelAndView;
    }
}


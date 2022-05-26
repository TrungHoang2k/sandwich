package sandwich.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sandwich.model.Sandwich;
import sandwich.service.Impl.SandwichServiceImpl;
import sandwich.service.SandwichService;

import java.util.ArrayList;

@Controller
public class SandwichController {

    @Autowired
    private SandwichService sandwichService;

    @RequestMapping("/order")
    public ModelAndView order(){
        ModelAndView modelAndView = new ModelAndView("/view/order.jsp");
        return modelAndView;
    }

    @PostMapping("/showList")
    public ModelAndView showList(@ModelAttribute Sandwich sandwich){
        ModelAndView modelAndView = new ModelAndView("/view/showList.jsp");
        ArrayList<String> condiments = sandwichService.getSelectedCondiments(sandwich);
        modelAndView.addObject("condiments",condiments);
        return modelAndView;
    }
}


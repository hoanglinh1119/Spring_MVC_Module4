package controller;

import jdk.nashorn.internal.ir.RuntimeNode;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller


public class ConvertCurrencyController {
    @GetMapping("/convert")
    public String greeting(){
        return "index";
    }

    @GetMapping("/convert1")
    public String convert(HttpServletRequest request, Model model){
        float usd=Float.parseFloat(request.getParameter("input"));
        float vnd=usd*23000;
        model.addAttribute("output",vnd);
        return "index";
    }
}

package com.example.demo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class HelloWorldController {
    // need a controller method to show initial HTML form
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    // need a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    // need a controller method to read form data
    // and add data to the model
     @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){
        // read the request parameter from HTML form
        String theName = request.getParameter("studentName");
        // convert the data to CAPITALS
        theName = theName.toUpperCase();
        // create the message
        String result = "Yo!" + theName;
        // add the message to the model
         model.addAttribute("message", result);

        return "helloworld";
    }

    // binding data
    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(
            @RequestParam("studentName") String theName,
            Model model){
        // convert the data to CAPITALS
        theName = theName.toUpperCase();
        // create the message
        String result = "Hi friend! " + theName;
        // add the message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }
}

package com.example.demo.mvc;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.validation.BindingResult;
import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    //adding initBinder to convert all of our data entries to trimmed data
    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/showForm")
    public String showForm(Model theModel){
        theModel.addAttribute("customer", new Customer());
        return "customer-form";
    }

    @RequestMapping("/processForm")
    public String processForm(
        @Valid @ModelAttribute("customer") Customer theCustomer,
                BindingResult theBindingResult){
        System.out.println("LastName: |" + theCustomer.getLastName() + "|");
        System.out.println("Binding result: " + theBindingResult);
        System.out.println("\n\n\n");
        if (theBindingResult.hasErrors()){
            return "customer-form";
        }else {
            return "customer-confirmation";
        }
    }

}

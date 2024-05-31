package com.example.LumpSumCalculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.LumpSumCalculator.parameters.Parameters;

@Controller
@RequestMapping("/LumpSumCalculator")
public class LumpSumController {

    @ModelAttribute("params")
    public Parameters params(){
        return new Parameters();
    }

    @GetMapping
    public String getParameter(){
        return "LumpsumCalculator";
    }

    @PostMapping
    public String returnResult(@ModelAttribute("params") Parameters param, Model model){
        long principal=param.getPrincipal();
        double roi=param.getRoi();
        int time=param.getTime();
        int frequency=param.getFrequency();
        double amount=principal*Math.pow((1+roi/frequency),time*frequency);
        double earnings=amount-principal;
        model.addAttribute("amount",Math.round(amount));
        model.addAttribute("params",param);
        model.addAttribute("earnings",Math.round(earnings));
        model.addAttribute("principal",principal);
        return "LumpSumCalculator";
    }
    
}

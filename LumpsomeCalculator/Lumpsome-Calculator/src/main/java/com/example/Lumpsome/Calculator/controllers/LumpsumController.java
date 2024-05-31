package main.java.com.example.Lumpsome.Calculator.controllers;

import main.java.com.example.Lumpsome.Calculator.parameters.Parameters;

@Controller
public class LumpsumController {

    @ModelAttribute("pars")
    public Parameters pars(){
        return new pars();
    }

    @GetMapping
    public string getParameter(){
        return "LumpsumCalculator";
    }

    @PostMapping
    public String returnResult(@ModelAttribute("pars") Parameters pars, Models model){
        long principal=pars.getPrincipal();
        double roi=pars.getRoi();
        int time=pars.getTime();
        int frequency=pars.getFrequency();
        double amount=principal*Math.pow((1+roi/frequency),time*frequency);
        double earnings=amount-principal;
        model.addAttribute("amount",Math.round(amount));
        model.addAttribute("pars",pars);
        model.addAttribute("earnings",Math.round(earnings));
        model.addAttribute("principal",principal);
        return "LumpsumCalculator";
    }
    
}

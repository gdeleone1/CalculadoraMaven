package com.example.CalculadoraMaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController 
public class CalculadoraMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraMavenApplication.class, args);
	}

@RequestMapping("suma/{parametro}/{parametro1}")
    public double suma(
            @PathVariable("parametro") double parametro,
              @PathVariable("parametro1") double parametro1,
            ModelMap model) {
        

     
        model.addAttribute("datos", "Estos son datos!!!");
        return  parametro+parametro1;
    }
    @RequestMapping("resta/{parametro}/{parametro1}")
    public double resta(
            @PathVariable("parametro") double parametro,
              @PathVariable("parametro1") double parametro1,
            ModelMap model) {
        

      
        model.addAttribute("datos", "Estos son datos!!!");
        return  parametro-parametro1;
    }
     @RequestMapping("multi/{parametro}/{parametro1}")
        public double multi(
            @PathVariable("parametro") double parametro,
              @PathVariable("parametro1") double parametro1,
            ModelMap model) {
        

        model.addAttribute("datos", "Estos son datos!!!");
        return  parametro*parametro1;
    }
         @RequestMapping("divi/{parametro}/{parametro1}")
              public double divi(
            @PathVariable("parametro") double parametro,
              @PathVariable("parametro1") double parametro1,
            ModelMap model) {
        

     
        model.addAttribute("datos", "Estos son datos!!!");
        return  parametro/parametro1;
    }
               @RequestMapping("raiz/{parametro}")
              
         public double raiz(
            @PathVariable("parametro") double parametro,
             
            ModelMap model) {
        

      
        model.addAttribute("datos", "Estos son datos!!!");
        return  Math.sqrt(parametro);
    }
              
}

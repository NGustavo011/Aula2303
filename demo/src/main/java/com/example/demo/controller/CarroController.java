package com.example.demo.controller;

import com.example.demo.service.CarroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * CarroController
 */
@Controller
@RequestMapping("/app")
public class CarroController {
    @Autowired
    private CarroService cs;

    @GetMapping("/carro/{id}")
    public ModelAndView getCarroById(@PathVariable("id") int id)
    {
        ModelAndView mv = new ModelAndView("CarroByIdView");
        mv.addObject("carro", cs.getCarroIdService(id));
        mv.addObject("Id", id);
        return mv;
    }

    @GetMapping("/carros")
    public ModelAndView getCarro()
    {
        ModelAndView mv = new ModelAndView("CarroView");
        mv.addObject("carro", cs.getCarro().values());
        return mv;
    }
}
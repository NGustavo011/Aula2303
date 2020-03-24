package com.example.demo.service;

import java.util.HashMap;

import com.example.demo.model.Carro;
import com.example.demo.repository.CarroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CarroService
 */
@Service
public class CarroService {

    @Autowired
    private CarroRepository cr;
    
    public Carro getCarroIdService(int id)
    {
        Carro carro = cr.getCarroId(id);
        return carro;        
    }

    public HashMap<Integer, Carro> getCarro()
    {
        HashMap<Integer, Carro> carro = cr.getCarro();
        return carro;
    }
}
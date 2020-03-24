package com.example.demo.repository;

import java.util.HashMap;

import com.example.demo.model.Carro;

import org.springframework.stereotype.Repository;

/**
 * CarroRepository
 */
@Repository
public class CarroRepository {
    public HashMap<Integer, Carro> hmCarro = new HashMap<Integer, Carro>();

    public CarroRepository() {
        hmCarro.put(1, new Carro(1, "XYZ-9009", "Corsa", "Azul", 2008));
        hmCarro.put(2, new Carro(2, "DIO-0666", "Opala", "Preto", 1998));
        hmCarro.put(3, new Carro(3, "MVC-0129", "Montana", "Branco", 2012));
        hmCarro.put(4, new Carro(4, "OIL-9991", "Cobalt", "Cinza", 2018));
        hmCarro.put(5, new Carro(5, "DED-0005", "Cronos", "Preto", 2015));
    }

    public Carro getCarroId(int id)
    {
        return hmCarro.get(id);
    }

    public HashMap<Integer, Carro> getCarro()
    {
        return hmCarro;
    }

}
package com.example.demo.model;

/**
 * Carro
 */
public class Carro {

    private int id;
    private String placa;
    private String modelo;
    private String cor;
    private int ano;

    public Carro(int id, String placa, String modelo, String cor, int ano) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public int getId()
    {
        return id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro [ano=" + ano + ", cor=" + cor + ", id=" + id + ", modelo=" + modelo + ", placa=" + placa + "]";
    }   

}
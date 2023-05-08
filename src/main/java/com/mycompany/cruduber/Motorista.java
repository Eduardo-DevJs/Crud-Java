package com.mycompany.cruduber;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eliria
 */
public class Motorista {
    private String nome;
    private String cnh;
    private String placa;
    private String cpf;
    
    public Motorista(String name, String cnhMotorista, String plate, String cpfMotorista){
        nome = name;
        cnh = cnhMotorista;
        placa = plate;
        cpf = cpfMotorista;
    }


  
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCnh() {
        return cnh;
    }


    public void setCnh(String cnh) {
        this.cnh = cnh;
    }


    public String getPlaca() {
        return placa;
    }


    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
}

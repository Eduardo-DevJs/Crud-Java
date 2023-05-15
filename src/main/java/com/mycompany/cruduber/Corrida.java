/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cruduber;
import java.util.ArrayList;


public class Corrida {
    private double preco;
    private int tempo;
    private double distancia;
    private Motorista motorista;
    private Passageiro passageiro;
    
    public Corrida(double price, int time, double distance, Motorista driver, Passageiro passenger){
        preco = price;
        tempo = time;
        distancia = distance;
        motorista = driver;
        passageiro = passenger;
    }


    public double getPreco() {
        return preco;
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }


    public int getTempo() {
        return tempo;
    }


    public void setTempo(int tempo) {
        this.tempo = tempo;
    }


    public double getDistancia() {
        return distancia;
    }


    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }


    public Motorista getMotorista() {
        return motorista;
    }


    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }


    public Passageiro getPassageiro() {
        return passageiro;
    }


    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }
    
    
}

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
    private ArrayList<Motorista> motorista;
    private ArrayList<Passageiro> passageiro;
    
    public Corrida(double price, int time, double distance, ArrayList<Motorista> driver, ArrayList<Passageiro> passenger){
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


    public ArrayList<Motorista> getMotorista() {
        return motorista;
    }


    public void setMotorista(ArrayList<Motorista> motorista) {
        this.motorista = motorista;
    }


    public ArrayList<Passageiro> getPassageiro() {
        return passageiro;
    }


    public void setPassageiro(ArrayList<Passageiro> passageiro) {
        this.passageiro = passageiro;
    }
    
    
}

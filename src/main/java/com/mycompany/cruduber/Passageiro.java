/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cruduber;

/**
 *
 * @author eliria
 */
public class Passageiro {
    private String nome;
    private String telefone;
    private String senha;
    private String cpf;
    
    public Passageiro(String name, String telephone, String password, String cpfPessoa){
        nome = name;
        telefone = telephone;
        senha = password;
        cpf = cpfPessoa;
    }

    // Mostrar nome
    public String getNome() {
        return nome;
    }

    // Alterar nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Mostrar telefone
    public String getTelefone() {
        return telefone;
    }

    // Alterar telefone
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Mostrar senha
    public String getSenha() {
        return senha;
    }

    // Alterar senha
    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Mostrar cpf
    public String getCpf() {
        return cpf;
    }

    // Alterar cpf 
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}


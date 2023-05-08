package com.mycompany.cruduber;
import java.util.ArrayList;
import java.util.Scanner;


public class CRUDUber {
    public static void main(String[] args) {
       ArrayList<Motorista> listaMotoristas = new ArrayList<Motorista>();
       ArrayList<Passageiro> listaPassageiros =  new ArrayList<Passageiro>();
       
       listaMotoristas.add(CriarMotorista());
       MostraMotoristas(listaMotoristas, 0);
    }
    
    //----------------- SCANNER PARAR LER GLOBALMENTE ------------------------
    public static Scanner ler = new Scanner(System.in);
    
    // CRIAR MOTORISTAS
    public static Motorista CriarMotorista(){
        System.out.println("Informe o nome: ");
        String nomeMotorista = ler.nextLine();
        
        System.out.println("Informe sua CNH: ");
        String cnhMotorista = ler.nextLine();
        
        System.out.println("Informe a placa: ");
        String plate = ler.nextLine();
        
        System.out.println("Informe seu CPF: ");
        String cpfMotorista = ler.nextLine();
        
        Motorista motoristaAdd = new Motorista(nomeMotorista, cnhMotorista, plate, cpfMotorista);
        
        return motoristaAdd;
    }
    
    //MOSTRAR MOTORISTAS PARTIR DE UMA LISTA
    public static void MostraMotoristas(ArrayList<Motorista> listMotorista, int select){
        if(select == 0){
            int idMotorista = 0;
              for (Motorista mot : listMotorista){
                  System.out.println("Número do motorista: " + idMotorista);
                  System.out.println("Nome do motorista: " + mot.getNome());
                  System.out.println("CNH do motorista: " + mot.getCnh());
                  System.out.println("Placa do motorista: " + mot.getPlaca());
                  System.out.println("CPF do motorista: " + mot.getCpf());
              }
        }
        if(select == 1){
          int idMotorista = 0;
            for(Motorista mot : listMotorista){
                System.out.println("\n Habilidade Numero " + idMotorista);
                System.out.println("Nome do Motorista: " + mot.getNome());                
            }
        }
    }
    
    //ATUALIZAR MOTORISTA A PARTIR DE UMA LISTA E DO NOME DO MOTORISTA
    public static void AtualizarMotoristas(ArrayList<Motorista> listMotorista, String nomeMotorista){
        for(Motorista mot : listMotorista){
            if(mot.getNome().equals(nomeMotorista)){
                System.out.println("Aperte para Atualizar Motorista");
                ler.nextLine();

                System.out.println("Digite o nome do Motorista:");
                mot.setNome(ler.nextLine());

                System.out.println("Digite a descrição da habilidade:");
                mot.setCnh(ler.nextLine());

                System.out.println("Digite o tipo da habilidade:");
                mot.setPlaca(ler.nextLine());

                System.out.println("Digite o dano da habilidade:");
                mot.setCpf(ler.nextLine());
            }
        }
    }
    
    //DELETAR UM MOTORISTA
    public static void DeletarMotorista(ArrayList<Motorista> listMotoristas, String nomeMotorista){
        for (Motorista mot : listMotoristas) {
            if (mot.getNome().equals(nomeMotorista)){
                System.out.println("Voce deletou a habilidade: " + mot.getNome());
                listMotoristas.remove(mot);
            }
        }
    }
}

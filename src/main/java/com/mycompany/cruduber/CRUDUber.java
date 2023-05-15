package com.mycompany.cruduber;
import java.util.ArrayList;
import java.util.Scanner;


public class CRUDUber {
    public static void main(String[] args) {
       ArrayList<Motorista> listaMotoristas = new ArrayList<Motorista>();
       ArrayList<Passageiro> listaPassageiros =  new ArrayList<Passageiro>();
       //array de corridas
       MostraMotoristas(listaMotoristas, 0);
       ArrayList<Corrida> listaDeCorrida = new ArrayList<Corrida>();

       listaMotoristas.add(CriarMotorista());
       MostraMotoristas(listaMotoristas, 0);
       DeletarMotorista(listaMotoristas, "dudu");
       MostraMotoristas(listaMotoristas, 0);
       MostraPassageiro(listaPassageiros, 0);
       DeletarPassageiro(listaPassageiros, "dudu");
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
                System.out.println("Voce deletou o Motorista: " + mot.getNome());
                listMotoristas.remove(mot);
                break;
            }
        }
    }
    
    public static Passageiro CriarPassageiro(){
        System.out.println("Informe o nome: ");
        String nomePassageiro = ler.nextLine();
        
        System.out.println("Informe sua CNH: ");
        String tell = ler.nextLine();
        
        System.out.println("Informe a placa: ");
        String senha = ler.nextLine();
        
        System.out.println("Informe seu CPF: ");
        String cpfPassageiro = ler.nextLine();
        
        Passageiro passageiroAdd = new Passageiro(nomePassageiro, tell, senha, cpfPassageiro);
        
        return passageiroAdd;
    }
    
     public static void MostraPassageiro(ArrayList<Passageiro> listaPassageiro, int select){
        if(select == 0){
            int idPassageiro = 0;
              for (Passageiro pas : listaPassageiro){
                  System.out.println("ID do Passageiro: " + idPassageiro);
                  System.out.println("Nome do passageiro: " + pas.getNome());
                  System.out.println("Telefone do Passageiro: " + pas.getTelefone());
                  //System.out.println("Placa do motorista: " + pas.getSenha());
                  System.out.println("CPF do Passageiro: " + pas.getCpf());
              }
        }
        if(select == 1){
          int idPassageiro = 0;
            for (Passageiro pas : listaPassageiro){
                System.out.println("\n ID: " + idPassageiro);
                System.out.println("Nome do Passageiro: " + pas.getNome());                
            }
        }
    }
     
      public static void AtualizarPassageiros(ArrayList<Passageiro> listaPassageiro, String nomePassageiro){
        for(Passageiro pas : listaPassageiro){
            if(pas.getNome().equals(nomePassageiro)){
                System.out.println("Aperte para Atualizar Motorista");
                ler.nextLine();

                System.out.println("Digite o nome do Passageiro:");
                pas.setNome(ler.nextLine());

                System.out.println("Digite o telefone do Passageiro:");
                pas.setTelefone(ler.nextLine());

                System.out.println("Digite a Senha:");
                pas.setSenha(ler.nextLine());

                System.out.println("Digite o cpf:");
                pas.setCpf(ler.nextLine());
            }
        }
    }
      
      public static void DeletarPassageiro(ArrayList<Passageiro> listaPassageiro, String nomePassageiro){
        for (Passageiro pas : listaPassageiro) {
            if (pas.getNome().equals(nomePassageiro)){
                System.out.println("Voce deletou o Motorista: " + pas.getNome());
                listaPassageiro.remove(pas);
                break;
            }
        }
    }
      //funçao criar corrida - um passageiro e um motorista 
    //criarcorrida(passa a moto a)
      
    public static Corrida CriarCorrida(ArrayList<Motorista> mot, ArrayList<Passageiro> passa){
        
        System.out.println("Digite o preço:");
        double precoUber = ler.nextInt();
        
        System.out.println("Digite o tempo:");
        int tempoUber = ler.nextInt();
        
        System.out.println("Digite a distancia:");
        double distanciaUber = ler.nextInt();
        
        MostraMotoristas(mot, 1);
        System.out.println("Digite um ID do motorista que quer adicionar corrida? ");
        int motoristaSelecionado = ler.nextInt();

        MostraPassageiro(passa, 1);
        System.out.println("Digite um ID do passageiro que quer adicionar corrida? ");
        int passageiroSelecionado = ler.nextInt();
        
        Corrida corridaAdd = new Corrida(precoUber, tempoUber, distanciaUber, mot.get(motoristaSelecionado), passa.get(passageiroSelecionado));
                

        return corridaAdd;
    }
    
    public static void MostrarCorrida( ArrayList<Corrida> listCorrida, int select){
            if(select == 0){
            int idPassageiro = 0;
              for (Corrida cor : listCorrida){
                  System.out.println("ID do Passageiro: " + idPassageiro);
                  System.out.println("Nome do passageiro: " + cor.getPreco());
                  System.out.println("Tempo da Corrida: " + cor.getTempo());
                  System.out.println("Distancia da Corrida: " + cor.getDistancia());
                  System.out.println("Nome do Passageiro: " + cor.getPassageiro().getNome());
                  System.out.println("Nome do Motorista: " + cor.getMotorista().getNome());
            }
        }
    }
}

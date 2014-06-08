/*
* Rodrigo Celebrone - 20428584
* Ronaldo dos Santos Pereira - 20432398
*/

package br.com.rodrigoviniciusronaldo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Rodrigo Celebrone
 */
public class ContatosNaNuvem {

    static ArrayList<Contato> listaContato;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menuPrograma = 0;

        listaContato = new ArrayList<>();
        
        while(menuPrograma != 6){
            Label("////////////////////Escolha uma opção////////////////////////");
            Label("1. Inserir novo contato");
            Label("2. Buscar um contato existente");
            Label("3. Exibir o nome de todos os contatos cadastrados");
            Label("4. Atualizar os dados de um contato já existente");
            Label("5. Remover contato");
            Label("6. Sair da aplicação");
            Label("////////////////////////////////////////////");
            Label("Digite o numero de uma dos opções acima: ");
            menuPrograma = input.nextInt();

            while (menuPrograma < 1 || menuPrograma > 6) {
                Label("Digite uma das opções 1,2,3,4,5,6: ");
                menuPrograma = input.nextInt();
            }
            
            if (menuPrograma == 1) {
                Scanner contato;
                Contato c = new Contato();
                
                Label("Nome do contato: ");
                contato = new Scanner(System.in);
                c.setNome(contato.nextLine());
                
                Label("Email do contato: ");
                contato = new Scanner(System.in);
                c.setEmail(contato.next());
                
                Label("Endereço do contato: ");
                contato = new Scanner(System.in);
                c.setEndereco(contato.nextLine());
                
                Label("Telefone pessoal do contato: ");
                contato = new Scanner(System.in);
                c.setTelefonePessoal(contato.nextInt());
                
                Label("Telefone comercial do contato: ");
                contato = new Scanner(System.in);
                c.setTelefoneComercial(contato.nextInt());
                
                InserirContato(c);
            } else if (menuPrograma == 2) {
                Label("Informe o nome que deseja buscar: ");
                Scanner contato = new Scanner(System.in);
                BuscarContato(contato.nextLine());
            } else if (menuPrograma == 3) {
                ExibirNomeContatos();
            } else if (menuPrograma == 4) {
                Scanner contato;
                Contato c = new Contato();
                
                Label("Nome do contato: ");
                contato = new Scanner(System.in);
                c.setNome(contato.nextLine());
                
                BuscarContato(c.getNome());
                
                Label("Email do contato: ");
                contato = new Scanner(System.in);
                c.setEmail(contato.next());
                
                Label("Endereço do contato: ");
                contato = new Scanner(System.in);
                c.setEndereco(contato.nextLine());
                
                Label("Telefone pessoal do contato: ");
                contato = new Scanner(System.in);
                c.setTelefonePessoal(contato.nextInt());
                
                Label("Telefone comercial do contato: ");
                contato = new Scanner(System.in);
                c.setTelefoneComercial(contato.nextInt());
                
                Label("Tem certeza que deseja atualizar esse contato? (S/N): ");
                Scanner pergunta = new Scanner(System.in);
                String resposta = pergunta.nextLine();
                while (resposta.equals("S") || resposta.equals("N")) {
                    Label("Responda 'S' para sim ou 'N' para não.");
                    resposta = pergunta.nextLine();
                }
                switch (resposta) {
                    case "S":
                        AtualizarContato(c);
                        Label("Contato atualizado com sucesso.");
                        break;
                    case "N":
                        Label("Atualização de contato foi cancelada pelo usuário.");
                        break;
                }
            } else if (menuPrograma == 5) {
                Scanner contato;
                Contato c = new Contato();
                
                Label("Nome do contato: ");
                contato = new Scanner(System.in);
                c.setNome(contato.nextLine());
                
                BuscarContato(c.getNome());
                
                Label("Tem certeza que deseja remover esse contato? (S/N): ");
                Scanner pergunta = new Scanner(System.in);
                String resposta = pergunta.nextLine();
                while (resposta.equals("S") || resposta.equals("N")) {
                    Label("Responda 'S' para sim ou 'N' para não.");
                    resposta = pergunta.nextLine();
                }
                switch (resposta) {
                    case "S":
                        RemoverContato(c);
                        Label("Contato removido com sucesso.");
                        break;
                    case "N":
                        Label("A remoção do contato foi cancelada pelo usuário.");
                        break;
                }
            } else if (menuPrograma == 6) {
                Label("Tem certeza que deseja sair do programa? (S/N): ");
                Scanner pergunta = new Scanner(System.in);
                String resposta = pergunta.nextLine();
                while (resposta.equals("S") || resposta.equals("N")) {
                    Label("Responda 'S' para sim ou 'N' para não.");
                    resposta = pergunta.nextLine();
                }
                switch (resposta) {
                    case "S":
                        ExibirNomeContatos();
                        Label("O programa foi encerrado com sucesso (aperte qualquer tecla para fechar).");
                        new Scanner(System.in).nextLine();
                        System.exit(0);
                        break;
                    case "N":
                        Label("Operação cancelada pelo usuário, voltando ao menu principal.");
                        break;
                }
            }
        }
    }
    
    private static void InserirContato(Contato c) {
        listaContato.add(c);
        Label("[[[Contato adicionado com sucesso]]]");
    }

    private static void BuscarContato(String nome) {
        int posicao = 0;
        for (Contato c : listaContato){
            posicao++;
            if (c.getNome().equals(nome)){
                Label("[[[Contato encontrado na posição "+posicao+" da lista de contatos]]]");
                Label("Nome: "+c.getNome());
                Label("Email: "+c.getEmail());
                Label("Endereço: "+c.getEndereco());
                Label("Telefone Pessoal: "+c.getTelefonePessoal());
                Label("Telefone Comercial: "+c.getTelefoneComercial());
            }
        }
    }

    private static void ExibirNomeContatos() {
        int posicao = 0;
        for (Contato c : listaContato){
            posicao++;
            Label(posicao+"\t"+c.getNome());
        }
    }

    private static void AtualizarContato(Contato novo) {
        for (Contato c : listaContato){
            if (c.getNome().equals(novo.getNome())){
                c.setEmail(novo.getEmail());
                c.setEndereco(novo.getEndereco());
                c.setTelefonePessoal(novo.getTelefonePessoal());
                c.setTelefoneComercial(novo.getTelefoneComercial());
            }
        }
    }

    private static void RemoverContato(Contato remover) {
        for (Contato c : listaContato){
            if (c.getNome().equals(remover.getNome())){
                listaContato.remove(c);
            }
        }
    }
    
    // para simplificar o uso do system.out.print em Strings
    private static void Label(String txt){
        System.out.println(txt);
    }
}

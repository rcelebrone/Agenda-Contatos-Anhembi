/*
* Rodrigo Celebrone - 20428584
* Ronaldo dos Santos Pereira - 20432398
* Vinicius Andrade - 20470284
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
                BuscarContato(new Contato());
            } else if (menuPrograma == 3) {
                ExibirNomeContatos();
            } else if (menuPrograma == 4) {
                AtualizarContato(new Contato());
            } else if (menuPrograma == 5) {
                RemoverContato(new Contato());
            } else if (menuPrograma == 6) {
                System.exit(0);
            }
        }
    }
    
    private static void InserirContato(Contato c) {
        listaContato.add(c);
        Label("[[[Contato adicionado com sucesso]]]");
    }

    private static void BuscarContato(Contato c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void ExibirNomeContatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void AtualizarContato(Contato c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void RemoverContato(Contato c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    // para simplificar o uso do system.out.print em Strings
    private static void Label(String txt){
        System.out.println(txt);
    }
    // para simplificar o uso do system.out.print em ints
    private static void Label(int txt){
        System.out.println(txt);
    }
}

/*
* Rodrigo Celebrone - 20428584
* Ronaldo dos Santos Pereira - 20432398
* Vinicius Andrade - 20470284
*/

package br.com.rodrigoviniciusronaldo;

import java.util.Scanner;

/**
 * @author Rodrigo Celebrone
 */
public class ContatosNaNuvem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menuPrograma = 0;

        while(menuPrograma != 6){
            System.out.println("////////////////////Escolha uma opção////////////////////////");
            System.out.println("1. Inserir novo contato");
            System.out.println("2. Buscar um contato existente");
            System.out.println("3. Exibir o nome de todos os contatos cadastrados");
            System.out.println("4. Atualizar os dados de um contato já existente");
            System.out.println("5. Remover contato");
            System.out.println("6. Sair da aplicação");
            System.out.println("////////////////////////////////////////////");
            System.out.println("Digite o numero de uma dos opções acima: ");
            menuPrograma = input.nextInt();

            while (menuPrograma < 1 || menuPrograma > 6) {
                System.out.print("Digite uma das opções 1,2,3,4,5,6: ");
                menuPrograma = input.nextInt();
            }
            
            if (menuPrograma == 1) {
                InserirContato(new Contato());
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
}

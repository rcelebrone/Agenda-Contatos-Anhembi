/*
* Rodrigo Celebrone - 20428584
* Ronaldo dos Santos Pereira - 20432398
* Vinicius Andrade - 20470284
*/

package br.com.rodrigoviniciusronaldo;

public class Contato {
    private String nome;
    private String email;
    private String endereco;
    private int telefonePessoal;
    private int telefoneComercial;
    
    // esse é o metodo set de nome, responsavel por receber um valor 
    // como parametro e colocar esse valor na propriedade nome (this.nome) da class
    public void SetNome(String nome){
        this.nome = nome;
    }
    
    // esse metodo é o get de nome, responsavel por retornar
    // o valor da propriedade nome (this.nome)
    public String GetNome(){
        return this.nome;
    }
}

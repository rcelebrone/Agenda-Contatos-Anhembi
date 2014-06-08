/*
* Rodrigo Celebrone - 20428584
* Ronaldo dos Santos Pereira - 20432398
*/

package br.com.rodrigoviniciusronaldo;

public class Contato {
    private String nome;
    private String email;
    private String endereco;
    private int telefonePessoal;
    private int telefoneComercial;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefonePessoal() {
        return telefonePessoal;
    }

    public void setTelefonePessoal(int telefonePessoal) {
        this.telefonePessoal = telefonePessoal;
    }

    public int getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(int telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author 18009340
 */
public class Motorista {
    public int cnh;
    public int quantidade_de_multas;
    public String nome;
    public Automovel carro;

    public int getCnh() {
        return cnh;
    }

    public int getQuantidade_de_multas() {
        return quantidade_de_multas;
    }

    public String getNome() {
        return nome;
    }

    public Automovel getCarro() {
        return carro;
    }

    public void setCnh(int cnh) {
        this.cnh = cnh;
    }

    public void setQuantidade_de_multas(int quantidade_de_multas) {
        this.quantidade_de_multas = quantidade_de_multas;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public void setCarro(Automovel Carro) {
        this.carro = Carro;
    }
    public void comprar_carro(){
        this.carro = new Uno_Mille();

    }
}

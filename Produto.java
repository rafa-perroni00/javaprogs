/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 18009340
 */
public class Produto {
    public String nomeP;
    public float preco;

    public String getNomeP() {
        return nomeP;
    }

    public void setNomeP(String nomeP) {
        this.nomeP = nomeP;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public Produto(String nomeP, int preco) {
        this.nomeP = nomeP;
        this.preco = preco;
    }
    public void printInfos(String nomeP,int preco){
        System.out.println("Nome:"+nomeP);
        System.out.println("Preco:"+preco);
        
    }
    public Produto() {
    }
    
}

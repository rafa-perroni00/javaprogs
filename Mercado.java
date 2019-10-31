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
public class Mercado extends Dono{
    public float Mcomprado;
    public String McompradoN;
    public int ContXastre;

    public float getMcomprado() {
        return Mcomprado;
    }

    public void setMcomprado(int Mcomprado) {
        this.Mcomprado = Mcomprado;
    }

    public String getMcompradoN() {
        return McompradoN;
    }

    public void setMcompradoN(String McompradoN) {
        this.McompradoN = McompradoN;
    }

    public int getContXastre() {
        return ContXastre;
    }

    public void setContXastre(int ContXastre) {
        this.ContXastre = ContXastre;
    }
    
    @Override
    public float getValor_compra() {
        return valor_compra;
    }

    @Override
    public void setValor_compra(float valor_compra) {
        this.valor_compra = valor_compra;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public float getTotal() {
        return total;
    }

    @Override
    public void setTotal(float total) {
        this.total = total;
    }
    
}

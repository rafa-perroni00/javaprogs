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
public abstract class Dono{
    public float valor_compra;
    public String nome;
    public float total;

    public abstract float getValor_compra();

    public abstract void setValor_compra(float valor_compra);

    public abstract String getNome();

    public abstract void setNome(String nome);

    public abstract float getTotal();
   

    public abstract void setTotal(float total);
  
    
    
     
}


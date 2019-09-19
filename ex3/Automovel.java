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
public abstract class Automovel {
    public int quantdade_de_portas;
    public int quantos_cilindros;
    public boolean turbo;
    public String cor_da_carroeria;
    public int placa;

    public void setCor_da_carroeria(String cor_da_carroeria) {
        this.cor_da_carroeria = cor_da_carroeria;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getCor_da_carroeria() {
        return cor_da_carroeria;
    }

    public int getPlaca() {
        return placa;
    }
    
    public abstract int getQuantos_cilindros();
    
    public abstract void setQuantos_cilindros(int quantos_cilindros);

    public abstract int getQuantidade_de_portas();
    
    public abstract void setQuantidade_de_portas(int quantidade_de_portas);
    
    public abstract boolean getTurbo();
    
    public abstract void setTurbo(boolean turbo);
    
    public abstract float calcularAceleracao(float acc);
}

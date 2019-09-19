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
public class Uno_Mille extends Automovel{
    public int quantas_escadas;
    public float portamala;

    public int getQuantas_escadas() {
        return quantas_escadas;
    }

    public float getPortamala() {
        return portamala;
    }

    public int getQuantdade_de_portas() {
        return quantdade_de_portas;
    }

   
    @Override
    public int getQuantos_cilindros() {
        return quantos_cilindros;
    }

    public boolean isTurbo() {
        return turbo;
    }

   
    @Override
    public String getCor_da_carroeria() {
        return cor_da_carroeria;
    }


    @Override
    public int getPlaca() {
        return placa;
    }

    public void setQuantas_escadas(int quantas_escadas) {
        this.quantas_escadas = quantas_escadas;
    }

    public void setPortamala(float portamala) {
        this.portamala = portamala;
    }

    public void setQuantdade_de_portas(int quantdade_de_portas) {
        this.quantdade_de_portas = quantdade_de_portas;
    }

   
    @Override
    public void setQuantos_cilindros(int quantos_cilindros) {
        this.quantos_cilindros = quantos_cilindros;
    }

    @Override
    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

  
    @Override
    public void setCor_da_carroeria(String cor_da_carroeria) {
        this.cor_da_carroeria = cor_da_carroeria;
    }

    
    @Override
    public void setPlaca(int placa) {
        this.placa = placa;
    }
   
    @Override
    public float calcularAceleracao(float acc){
        return (float)(100/acc);
    }

    @Override
    public int getQuantidade_de_portas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setQuantidade_de_portas(int quantidade_de_portas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getTurbo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

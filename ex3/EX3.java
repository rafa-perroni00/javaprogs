/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.util.Scanner;

/**
 *
 * @author 18009340
 */
public class EX3 {

    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        Motorista M = new Motorista();
        M.nome = "Jorginho";
        M.cnh = 6;
        M.quantidade_de_multas = 3;
        M.comprar_carro();
        
        try{
            System.out.println(M.carro.calcularAceleracao(A.nextFloat())+"Segundos.");
        }catch(java.util.InputMismatchException e){
            System.out.println("Digite um numero");
        }
        
    }
    
}

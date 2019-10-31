/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author 18009340
 */
public class JavaApplication1 {
    
    
    public static void main(String[] args) {
        String nomeP;
        int preco,comp,cont1 = 0,cont2 = 0,cont3 = 0;
        Produto banana = new Produto();
        banana.setNomeP("Banana");
        banana.setPreco(5);
        Produto manga = new Produto();
        manga.setNomeP("Manga");
        manga.setPreco(10);
        Produto uva = new Produto();
        uva.setNomeP("Uva");
        uva.setPreco(8);
        Mercado Xastre = new Mercado();
        Xastre.setNome("Jorge");
        
        Scanner entrada = new Scanner(System.in);
        int opcao=0,opcao1=0,flag=0;
        System.out.println("Caixa do Mercado:");
        System.out.println("Nome do dono:"+Xastre.nome);
        do{
        do{ 
        Xastre.valor_compra = 0;
        System.out.println("MENU\n");
        System.out.println("1-Adicionar itens a conta.");
        System.out.println("2-Finalizar");
        try{
        
        opcao= entrada.nextInt();
        entrada.nextLine();
        flag=0;
        }catch(Exception e)
           {
            System.out.println("Erro! por favor digite apennas numeros inteiros\n");
          flag=1;  
          entrada.nextLine(); //zerando buffer
           }
        }while(flag ==1);
       
        switch(opcao){
            case 1:
                banana.printInfos(banana.nomeP, (int) banana.preco);
                 manga.printInfos(manga.nomeP, (int) manga.preco);
                  uva.printInfos(uva.nomeP, (int) uva.preco);
                do{    
                System.out.println("Digite o produto a adicionar");
                System.out.println("1-Banana/2-Manga/3-Uva/4-Finalizar");
               
                  comp = entrada.nextInt();
                  if(comp == 1){
                  Xastre.valor_compra = Xastre.valor_compra + banana.preco;
                  cont1++;
                  }
                  else if(comp == 2){
                  Xastre.valor_compra = Xastre.valor_compra + manga.preco;
                  cont2++;
                  }
                  else if(comp == 3){
                  Xastre.valor_compra = Xastre.valor_compra + uva.preco;
                  cont3++;
                  }
       
                }while(comp!=4);
                if(Xastre.valor_compra%2 == 0)
                    if(Xastre.valor_compra%Xastre.valor_compra == 0){
                       Xastre.ContXastre = Xastre.ContXastre + 1 ;
                    }
                Xastre.total = Xastre.total + Xastre.valor_compra;
                System.out.println("Valor da compra atual:"+Xastre.valor_compra);
                break;
            case 2:
                System.out.println("Numero de xastroildo:"+Xastre.ContXastre);
                System.out.println("Valor total no dia:"+Xastre.total);
                if(cont1 > cont2 && cont1 > cont3){
                    Xastre.McompradoN = banana.nomeP;
                    Xastre.Mcomprado = banana.preco;
                    System.out.println("Produto mais vendido:"+Xastre.McompradoN + Xastre.Mcomprado);
                    System.out.println("Produto foi vendido:"+cont1);
                }
                else if(cont2 > cont1 && cont2 > cont3){
                    Xastre.McompradoN = manga.nomeP;
                    Xastre.Mcomprado = manga.preco;
                    System.out.println("Produto mais vendido:"+Xastre.McompradoN + Xastre.Mcomprado);
                    System.out.println("Produto foi vendido:"+cont2);
                } 
                else if(cont3 > cont2 && cont3 > cont1){
                    Xastre.McompradoN = uva.nomeP;
                    Xastre.Mcomprado = uva.preco;
                    System.out.println("Produto mais vendido:"+Xastre.McompradoN + Xastre.Mcomprado);
                    System.out.println("Produto foi vendido:"+cont3);
                }
                break;
        }
        }while(opcao!=2); 
    }
    
}


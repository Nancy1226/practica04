package com.upchiapas.ahorcado;
import java.util.Scanner;
import com.upchiapas.ahorcado.models.Juego;

public class Main {
    public static void main(String[] args){
        Juego ahorcado =new Juego((byte)3,  "manzana"){
        Scanner teclado=new Scanner(System.in);
        while (ahorcado.isLive()){
                System.out.print("letra: ");
                if (ahorcado.bucarLetra(teclado.nextLine().charAt(0)));{
                    for (char letra: ahorcado.getAux())
                        if (letra = null)
                            System.out.print(" ");
                        else
                            System.out.println(letra);
                }
            }
        }
    }
}
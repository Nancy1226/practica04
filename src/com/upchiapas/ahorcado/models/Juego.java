package com.upchiapas.ahorcado.models;
//Toda la logica estara en los objetos
public class Juego {
    private byte numeroVidas; //Atributos(variables)
    private String palabra;
    private char[] aux;



    public Juego(byte numeroVidas, String palabra){   //Constructor
        this.numeroVidas=numeroVidas;
        this.palabra=palabra;
        aux=new char[palabra.length()]; //Crear y definir arreglo
    }

    public boolean bucarLetra(char letra){
        boolean estado=false; //La letra no existe
        for (int i=0;i<palabra.length(); i++){
            if (palabra.charAt(i)== letra){ //CharAt busca la letra por casa espacio es decir pocision
                estado=true;
                aux[i]=letra;
            }
        }
        if (!estado)
            quitarVida();
        return estado;
    }
    private void quitarVida(){ //Se va a utilizar dentro de la misma clase por eso es privado
        numeroVidas--;
    }

    public String getPalabra(){return palabra;}
    public byte getNumeroVidas(){return numeroVidas;}

    public boolean isLive(){
        boolean estado;
        if(numeroVidas>0)
            estado=true;
        else
            estado=false;
        return false;
    }

}

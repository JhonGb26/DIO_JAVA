package edu.jhon.interMedio;

import java.io.IOException;

public class BoletimEstudantil {
    public static void main(String[] args) throws IOException {
        int mediaFinal = System.in.read();
            if(mediaFinal<6)	
                System.out.println("REPROVADO"); 
            else if(mediaFinal==6)
                System.out.println("PROVA MINERVA"); 
            else
                System.out.println("APROVADO"); 		
        }
}

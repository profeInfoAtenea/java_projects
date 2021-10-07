package com.bach2.demo;



public class Juegoadivinar {

	public static void main(String[] args) {
		 //Declaro las variables
	    int intentos, num_secreto, num;
	    //Intentos
	    intentos = 3;
	    // Numero secreto 
	    num_secreto =  (int) (Math.random()*100); 
	    System.out.println("num_secreto:"+num_secreto);

	    // Función de salida. M--> H 
	    System.out.println("Adivina un número entre 1 y 100:");
	    // Función de Entrada. M <-- H
	    num = Integer.parseInt(System.console().readLine()); 

	    //printf("El num num=%d , num_secreto=%d \n",num, num_secreto);

	    while((num_secreto != num ) && (intentos>1)){
	        //Pistas para el usuario
	        if(num_secreto > num){
	        	System.out.println("Es muy alto\n");
	        }else{
	        	System.out.println("Es muy bajo\n");
	        }

	        intentos--;

	        System.out.println("Intentalo de nuevo, te quedan "+intentos+" intentos \n");
	        num = Integer.parseInt(System.console().readLine()); 
	    }

	    //Finaliza los intentos o acierta
	    if(num_secreto == num){
	    	System.out.println("¡Bien!, adivinaste en "+(4 - intentos)+" intentos \n");
	    }else{
	    	System.out.println("Lo siento. Has perdido, el número era "+ num_secreto);
	    }

	}

}
/**
 *  $>java Juevoadivinar.java
 */

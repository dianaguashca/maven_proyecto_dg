package ejercicios.clase.string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//1.- contains.....que contiene
		String frase="Programacion de algoritmo modulo 2";
		Scanner teclado=new Scanner(System.in);
		System.out.println("ingrese nombre del libro");
		String palabra=teclado.nextLine();
		
		boolean resultado=frase.contains(palabra);
		System.out.println("contiene la palabra:"+resultado);
		
		
		//2.- equals 
		
		
		System.out.println(".........................");
		String cadena1="diana";
		System.out.println("ingrese la segunda cadena a comparar");
		String cadena2=teclado.nextLine();
		boolean resultado2=cadena1.equals(cadena2);
		System.out.println("las cadenas son iguales:" +resultado2);
	
		
		//3.- y 4  Upper mayusculas Lower minuscula
		System.out.println("....................");
		String nombre="juanito";
		String nombreEnMayuscula=nombre.toUpperCase();	
		System.out.println("nombre en mayuscula:"+nombreEnMayuscula);
		
		
		System.out.println("....................");
		String nombre2="JOSE";
		String nombreEnMinuscula=nombre2.toLowerCase();	
		System.out.println("nombre en minuscula:"+nombreEnMinuscula);
		
	}

}

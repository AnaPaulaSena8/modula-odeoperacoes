package br.edu.funcoesBasicas;
import java.util.Scanner;
public class operacoes {
     
	public static int RecebaX(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro numero");
		int x = sc.nextInt();
		return x;
	}
	public static int RecebaY(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o segundo numero");
		int y = sc.nextInt();
		return y;
	}
	
	public static void soma(int x,int y){
		int a =x;
		int b =y;		
		int result =  (a+b);
		System.out.println("Result de somar: "+result);
	}public static void sub (int x,int y){
		int resultsub = (x-y);
	    System.out.println("result de sub: "+resultsub);
}
	public static void mult (int x,int y){
		int resultmult = (x*y);
	    System.out.println("result de mult: "+resultmult);
}
	public static void div (float x,float y){
	float resultdiv = (x/y);
    System.out.println("result de div: "+resultdiv);
}
	}

package estudos;

import java.util.Scanner;

public class exemplos2 {
	//Um ano é bissexto quando é
	//(divisível por 400) ou é (divisível por 4 e não por 100);
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um ano");
		int ano = sc.nextInt();
		if(ano % 400 == 0 || ano % 4 == 0){
			System.out.println("Ano bissexto");
		  System.out.println("não é ano bissexto");
		}
		sc.close();
	}
}
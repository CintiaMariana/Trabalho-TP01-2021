package br.edu.univas.main;
import java.util.Scanner; 

public class StartApp {
	public static void main (String [] args) {	
		Scanner teclado = new Scanner (System.in);
		double poligono;
		
		do {
		System.out.println("Ol�, Seja Bem Vindo! \nDigite a op��o desejada:");
		System.out.println("1 - Ret�ngulo");
		System.out.println("2 - Quadrado");
		System.out.println("3 - Tri�ngulo");
		System.out.println("4 - Pentagono");
		System.out.println("9 - Sair");
		poligono = teclado.nextDouble();
					
		if (poligono == 1) {
			System.out.println("Digite o valor da base do ret�ngulo:");
			double baseRetangulo = teclado.nextDouble();
			System.out.println ("Digite o valor da altura do ret�ngulo:");
			double alturaRetangulo = teclado.nextDouble();
			double areaRetangulo = baseRetangulo * alturaRetangulo;
			System.out.println("O valor da �rea do ret�ngulo � igual a: " + areaRetangulo + "\n");
		
		} else if (poligono == 2) {
			System.out.println("Digite o valor dos lados do quadrado: ");
			double ladoQuadrado = teclado.nextDouble();
			double areaQuadrado = ladoQuadrado * ladoQuadrado;
			System.out.println("O valor da �rea do quadrado � igual a: " + areaQuadrado + "\n");
		
		} else if (poligono == 3) {
			System.out.println("Digite o valor da base do tri�ngulo: ");
			double baseTriangulo = teclado.nextDouble();
			System.out.println("Digite o valor da altura do tri�ngulo: ");
			double alturaTriangulo = teclado.nextDouble();
			double areaTriangulo = baseTriangulo * alturaTriangulo / 2;
			System.out.println("O valor da �rea do tri�ngulo � igual a: " + areaTriangulo + "\n");	
		
		} else if (poligono == 4) {
			System.out.println("Digite o valor dos lados do pentagono: ");
			double ladosPentagono = teclado.nextDouble();
			System.out.println("Digite o valor da ap�tema do pentagono: ");
			double apotemaPentagono = teclado.nextDouble();
			double areaPentagono = 5 * ladosPentagono * apotemaPentagono / 2;
			System.out.println("O valor da �rea do pentagono � igual a: " + areaPentagono + "\n");
		
		} else if (poligono == 9) {
			System.out.println("Programa Finalizado. At� breve!!");
		
		} else {
			System.out.println("Op��o inv�lida! Por favor, digite uma op��o correta!\n");
		}
		} while (poligono > 0 && poligono < 9);
		  teclado.close();
		}
		}
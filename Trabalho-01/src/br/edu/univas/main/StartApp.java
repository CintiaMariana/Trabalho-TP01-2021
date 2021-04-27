package br.edu.univas.main;
import java.util.Scanner; 

public class StartApp {
	public static void main (String [] args) {	
		Scanner teclado = new Scanner (System.in);
		double poligono;
		
		do {
		System.out.println("Olá, Seja Bem Vindo! \nDigite a opção desejada:");
		System.out.println("1 - Retângulo");
		System.out.println("2 - Quadrado");
		System.out.println("3 - Triângulo");
		System.out.println("4 - Pentagono");
		System.out.println("9 - Sair");
		poligono = teclado.nextDouble();
					
		if (poligono == 1) {
			System.out.println("Digite o valor da base do retângulo:");
			double baseRetangulo = teclado.nextDouble();
			System.out.println ("Digite o valor da altura do retângulo:");
			double alturaRetangulo = teclado.nextDouble();
			double areaRetangulo = baseRetangulo * alturaRetangulo;
			System.out.println("O valor da área do retângulo é igual a: " + areaRetangulo + "\n");
		
		} else if (poligono == 2) {
			System.out.println("Digite o valor dos lados do quadrado: ");
			double ladoQuadrado = teclado.nextDouble();
			double areaQuadrado = ladoQuadrado * ladoQuadrado;
			System.out.println("O valor da área do quadrado é igual a: " + areaQuadrado + "\n");
		
		} else if (poligono == 3) {
			System.out.println("Digite o valor da base do triângulo: ");
			double baseTriangulo = teclado.nextDouble();
			System.out.println("Digite o valor da altura do triângulo: ");
			double alturaTriangulo = teclado.nextDouble();
			double areaTriangulo = baseTriangulo * alturaTriangulo / 2;
			System.out.println("O valor da área do triângulo é igual a: " + areaTriangulo + "\n");	
		
		} else if (poligono == 4) {
			System.out.println("Digite o valor dos lados do pentagono: ");
			double ladosPentagono = teclado.nextDouble();
			System.out.println("Digite o valor da apótema do pentagono: ");
			double apotemaPentagono = teclado.nextDouble();
			double areaPentagono = 5 * ladosPentagono * apotemaPentagono / 2;
			System.out.println("O valor da área do pentagono é igual a: " + areaPentagono + "\n");
		
		} else if (poligono == 9) {
			System.out.println("Programa Finalizado. Até breve!!");
		
		} else {
			System.out.println("Opção inválida! Por favor, digite uma opção correta!\n");
		}
		} while (poligono > 0 && poligono < 9);
		  teclado.close();
		}
		}
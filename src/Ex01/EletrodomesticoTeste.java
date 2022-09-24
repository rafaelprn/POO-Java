package Ex01;

import java.util.Scanner;

public class EletrodomesticoTeste {
	public static void main(String[] args) {
		
		Scanner entradateclado = new Scanner(System.in);
		int menu = 0;
		
		Eletrodomestico e1 = new Eletrodomestico();
		e1.criarObjeto();
		
		while(menu != 4) {
			System.out.println("MENU: \n1 - Adquirir Unidades \n2 - Repor Estoque \n3 - Imprimir Ficha");
			System.out.println("4 - Sair");
			menu = entradateclado.nextInt();
			
			if(menu == 1) {
				System.out.println("Quantas unidades voce deseja adquirir? ");
				int unidades = entradateclado.nextInt();
				e1.realizarVenda(unidades);
			}
			if(menu == 2) {
				System.out.println("Quantas unidades deseja repor no estoque? ");
				int comprador = entradateclado.nextInt();
				entradateclado.nextLine();
				System.out.println("Qual o nome do seu fornecedor? ");
				String nome = entradateclado.nextLine();
				e1.comprarFornecedor(comprador, nome);
			}
			if(menu == 3) {
				System.out.println(e1);
			}
			if(menu < 1 || menu > 4) {
				System.out.println("Por favor, insira um valor valido!");
			}
			
		}
		System.out.println("Fim do Programa.");
		entradateclado.close();
	}
}


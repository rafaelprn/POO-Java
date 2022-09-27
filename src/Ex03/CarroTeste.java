package Ex03;

import java.util.Scanner;

public class CarroTeste {
	public static void main(String[] args) {
		Scanner entradateclado = new Scanner(System.in);
		int op = 0;
		int dia = 1;
		String nome;
		Carro c1 = new Carro();
		while(op != 6) {
			System.out.println("\nMenu: \n1 - Alocar carro \n2 - Devolver carro");
			System.out.println("3 - Imprimir ficha do veiculo \n4 - Alterar Placa");
			System.out.println("5 - Alterar valor da Diaria: \n6 - Sair");
			op = entradateclado.nextInt();
			if(op == 1) {
				System.out.println("Que dia eh hoje? ");
				dia = entradateclado.nextInt();
				entradateclado.nextLine(); //limpar buffer
				System.out.println("Qual o seu nome? ");
				nome = entradateclado.nextLine();
				c1.locarCarro(dia, nome);
			}
			if(op == 2) {
				System.out.println("Que dia eh hoje? ");
				dia = entradateclado.nextInt();
				c1.devolverCarro(dia);
			}
			if(op == 3) {
				System.out.println(c1);
			}
			if(op == 4) {
				System.out.println("Informe a nova placa do veiculo: ");
				entradateclado.nextLine();
				String placa = entradateclado.nextLine();
				c1.setPlaca(placa);
			}
			if(op == 5) {
				System.out.println("Informe o novo valor da diaria: ");
				//entradateclado.nextLine();
				double novo = entradateclado.nextDouble();
				c1.setValDiaria(novo);
			}
			if(op == 6) {
				System.out.println("Obrigado por ser nosso cliente!");
			}
		}
		entradateclado.close();
	}
}

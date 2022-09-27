package Ex03;

public class Carro {
	//atributos
	private String modelo, marca, nomeCliente;
	private boolean disponivel; //true = disponivel, false = ja emprestado
	String placa;
	double valDiaria;
	int dia; // 1 ~ 31
	
	//metodo construtor
	public Carro() {
		this.modelo = "Civic";
		this.marca = "Honda";
		this.placa = "ABCDEF";
		this.valDiaria = 200;
		this.disponivel = true;
		this.dia = 1;
	}
	
	//metodos
	public void locarCarro(int dia, String nome) {
		if(dia >= 1 && dia < 31) {
			if(this.disponivel == true) { //se o carro esta disponivel para ser alugado			
				this.dia = dia;
				this.disponivel = false;
				this.nomeCliente = nome;
				System.out.println("Parabens " + this.nomeCliente +"! Voce alugou seu carro no dia " + this.dia);
				System.out.println(this.toString());
			}
			else {
				System.out.println("\nDesculpe! Esse carro nao esta disponivel agora");
				System.out.println("Este carro ja foi alugado por " + this.nomeCliente + " no dia " + this.dia);
			}
		}
		else {
			System.out.println("Por favor, insira um dia do mes valido!");
		}
	}
	public void devolverCarro(int diaF) {
		if((diaF > 1 && diaF <= 31) && diaF >= this.dia) {
			if(this.disponivel == false) { //se o carro esta disponivel para ser devolvido
				int diaInicial = this.dia;
				int diaFinal = diaF;
				int totalDias = diaF - this.dia;
				double valTotal = this.calcularValTotal(diaInicial, diaFinal);
				System.out.println("Obrigado " + this.nomeCliente + "! Voce devolveu seu carro no dia " + diaF);
				this.disponivel = true;
				System.out.println(this.toString());
				System.out.println("\nDias alugados: " + totalDias);
				System.out.println("O aluguel ficou em R$" + valTotal);
			}
			else {
				System.out.println("\nEste carro nao esta alugado! Empreste-o primeiro.");
			}
		}
		else {
			System.out.println("Por favor, insira um dia do mes valido!");
		}
	}
	private double calcularValTotal(int diaI, int diaF) { //vai ser chamado pelo devolverCarro()
		int totalDias = diaF - diaI;
		double valTotal = this.valDiaria * totalDias;
		return valTotal;
	}
	
	//getters
		public String getModelo() {
			return this.modelo;
		}
		public String getMarca() {
			return this.marca;
		}
		public String getPlaca() {
			return this.placa;
		}
		public double getValDiaria() {
			return this.valDiaria;
		}
		public boolean getDisponivel() {
			return this.disponivel;
		}
		//setters
		public void setPlaca(String placa) {
			this.placa = placa;
		}
		public void setValDiaria(double valDiaria) {
			this.valDiaria = valDiaria;
		}
	//metodo toString
	public String toString() {
		if(disponivel == true) {
			return "\nFicha do Carro:\nModelo: " + this.modelo + "\nMarca: " 
					+ this.marca + "\nPlaca: " + this.placa + "\nValor da Di�ria: " 
					+ this.valDiaria + "\nSituacao: Disponivel"; 
		}
		else {
			return "\nFicha do Carro:\nModelo: " + this.modelo + "\nMarca: " 
					+ this.marca + "\nPlaca: " + this.placa + "\nValor da Di�ria: " 
					+ this.valDiaria + "\nSituacao: Alugado" ; 
		}
	}
}


package Ex01;

public class Eletrodomestico {

	//ATRIBUTOS
	int codigo, voltagem, potencia, garantia, estoque;
	float valor;
	String marca, modelo, nome;
	
	//METODOS
	public void criarObjeto() {
		this.estoque = 10;
		this.valor = 200;
		this.codigo = 123;
		this.voltagem = 220;
		this.potencia = 5;
		this.garantia = 2022;
		this.marca = "Smart";
		this.modelo = "HP";	
	}
	
	public void realizarVenda(int qtd) {//vai subtrair do estoque
		if(qtd <= 0) {
			System.out.println("Por favor, insira um valor valido!");
			return;
		}
		if(qtd <= this.estoque) {
			this.estoque = this.estoque - qtd;
			float total = this.valor * qtd;
			System.out.println("Parabens, a venda foi bem sucedida!");
			System.out.println("Voce adquiriu " + qtd + " Eletrodomesticos!");
			System.out.println("Cada eletrodomestico custou R$" + valor);
			System.out.println("No total, sua compra somou R$" + total);
		}
		else {
			System.out.println("Desculpe, nosso estoque nao e tao grande assim!");
		}
	}
	
	public void comprarFornecedor(int compra, String nome) {
		this.estoque = this.estoque + compra;
		System.out.println("Voce foi atendido pelo fornecedor " + nome);
		System.out.println("Parabens pela aquisicao de " + compra + " unidades para o estoque");
	}
	
	public String toString(){
		return "FICHA:\nCodigo: " + this.codigo +
		"\nVoltagem: " + this.voltagem + 
		"\nPotencia: " + this.potencia + 
		"\nGarantia: " + this.garantia + 
		"\nValor: " + this.valor +
		"\nMarca: " + this.marca + 
		"\nModelo: " + this.modelo + 
		"\nEstoque: " + this.estoque ;
	}
	
}

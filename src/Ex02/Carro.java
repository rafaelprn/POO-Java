package lista03.ex05;

public class Carro {
	//atributos
	private int vel;
	private String marcha;
	
	//metodo construtor
	public Carro(){
		this.vel = 0;
		this.marcha = "Marcha Neutra";
	}
	
	//getters
	public int getVel(){
		return this.vel;
	}
	public String getMarcha() {
		return this.marcha;
	}
	
	//metodos
	void acelerar() {
		if(vel >= 126) {
			vel = 130;
		}
		else {			
			vel += 5;
		}
		this.verificarMarcha();
	}
	void frear() {
		if(vel <= 4) {
			vel = 0;
		}
		else {			
			vel -= 5;
		}
		this.verificarMarcha();
	}
	private void verificarMarcha() {
		if(vel == 0) {
			this.marcha = "Marcha Neutra";
		}
		else if(vel >= 1 && vel <= 19) {
			this.marcha = "Primeira Marcha";
		}
		else if(vel >= 20 && vel <= 39) {
			this.marcha = "Segunda Marcha";
		}
		else if(vel >= 40 && vel <= 59) {
			this.marcha = "Terceira Marcha";
		}
		else if(vel >= 60 && vel <= 89) {
			this.marcha = "Quarta Marcha";
		}
		else { // vel >= 90 && vel <= 130
			this.marcha = "Quinta Marcha";
		}
	}
	
	//metodo toString
	public String toString() {
		return "\nO carro esta com velocidade de: " + this.vel + " Km/h.\nPortanto, esta na " + this.marcha;
	}
}

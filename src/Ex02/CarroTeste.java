package lista03.ex05;

public class CarroTeste {
	public static void main(String[] args) {
		Carro c1 = new Carro();
		System.out.println(c1);
		for(int i = 0; i < 50; i++){
			c1.acelerar();
		}
		System.out.println(c1);
		System.out.println(c1.getVel());
	}
}

package br.edu.fatecpg.veiculo.view;

import br.edu.fatecpg.veiculo.model.Carro;

public class Main {

	public static void main(String[] args) {
		Carro carroAle = new Carro("ASD123","RENAULT","LOGAN",1.6);
		//carroAle.placa = "ABC-3D21";
		carroAle.andar();
		carroAle.ligar();
		carroAle.andar();
		carroAle.desligar();
		carroAle.andar();
		carroAle.setChassi("ALE123");
		String chassi = carroAle.getChassi();
		System.out.println(chassi);
		System.out.println(carroAle.getChassi());
		//System.out.println(carroAle.placa);
		System.out.println("Meu Carro!");
	}

}

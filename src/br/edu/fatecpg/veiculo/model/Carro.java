package br.edu.fatecpg.veiculo.model;

public class Carro {
	private String chassi;
	private String marca;
	private String modelo;
	private String placa;
	private double motor;
	private boolean ligado=false;
	
	public Carro(String ch, String mrc, String mod, double motor) {
		this.chassi = ch;
		this.marca = mrc;
		this.modelo = mod;
		this.motor = motor;
	}
	public String getChassi() {
		return this.chassi;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public double getMotor() {
		return motor;
	}
	public void setMotor(double motor) {
		this.motor = motor;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public void setChassi(String ch) {
		this.chassi = ch;
	}
	
	public void ligar() {
		System.out.println("Ligou");
		this.ligado = true;
	}
	public void desligar() {
		System.out.println("Desligou");
		this.ligado = false;
	}
	public void andar() {
		if(this.ligado==true) {
			System.out.println("Andando");
		}else {
			System.out.println("Ligue o carro!");
		}
	}
	
	
}

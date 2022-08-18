package br.edu.br;

public class Conta {
	//Padrão CamelCase
	//encapsulamento
	//acessível via getter and setter
	private String numeroConta;
	private Double saldo;
	
	//Métodos sem retorno
	public void deposito(Double valor) {
       //this-atributo saldo += valor;
        
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	//Método com retorno
	public String saque(Double valor) {
	if (saldo< valor) {
		return "saldo insuficiente !";
		
	}else{
		saldo -=valor;
	
	return "saque efetuado com sucesso !"; 
    	
	}
    }
}
package br.com.poo.contas;

public class Conta {
	
	private String agencia;
	private String numConta;
	private String titular;
	private Double saldo  ;
	
	
	
	
	
	public Conta(){
		
			
	}
	
	public boolean sacar (Double valor){
		if(this.saldo < valor || valor <= 0) {
			return false;
		}else {
			this.saldo -= valor;
			return true;
		}
	}
	
	public void depositar(Double valor) {
		if(this.saldo == null) {
			this.saldo = 0.0;
		}
		this.saldo += valor;
	}
	
	public void transferir(Double valor, Conta destino) {
		sacar(valor);
		destino.depositar(valor);
	}
	
	public void salario() {
		double salario = 1000.0;
		double bonus = salario > 1000 ? 0.10 : 0.15;
		System.out.println(bonus);
	}

	
	
	public Conta(String agencia, String numConta, String titular, Double saldo) {
		super();
		this.agencia = agencia;
		this.numConta = numConta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	
	public Conta(String titular) {
		super();
		this.titular = titular;
	}



	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Agencia=" + agencia + ", numConta=" + numConta + ", titular=" + titular + ", saldo=" + saldo
				;
	}

	

	
	
}

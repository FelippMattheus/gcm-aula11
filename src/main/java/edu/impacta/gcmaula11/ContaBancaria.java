package edu.impacta.gcmaula11;

public class ContaBancaria {
	private long saldo;
	public ContaBancaria() { saldo = 0; }
	public ContaBancaria(long s) { saldo = s; }
	
	public void depositar(long valor) {
		saldo += valor;
		
	}
	
	public boolean sacar(long valor) {
		if(getSaldo() >= valor){this.saldo = valor; return true;}
		if(getSaldo() <= valor){return false;}
	}
	
	public long getSaldo() {
		
		return this.saldo;
	}
	
}
 

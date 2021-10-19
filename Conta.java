package br.com.caelum.contas;

public class Conta {
protected double saldo;
String agencia;
int numero;
String titular;

public double getSaldo() {
	return saldo;
}

public String getTitular() {
	return titular;
}

public void setTitular(String titular) {
	this.titular = titular;
}

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}

public String getAgencia() {
	return agencia;
}

public void setAgencia(String agencia) {
	this.agencia = agencia;
}


}

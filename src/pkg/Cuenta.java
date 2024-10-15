package pkg;

public class Cuenta {

	double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}	
	public Cuenta(double i) {
		// TODO Auto-generated constructor stub
		this.saldo = i;
	}

	public void ingresar(double i) {
		// TODO Auto-generated method stub
		saldo += i;
		
	}

	public void retirar(double d) {
		// TODO Auto-generated method stub
		this.saldo -= d;  
		
	}

	

}

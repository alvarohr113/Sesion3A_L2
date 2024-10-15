package pkg;

public class Cuenta {

	private double saldo;
	private String numero,Nombre;

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

	public Cuenta(double d, String numeroC, String NombreC) {
		// TODO Auto-generated constructor stub
		this.saldo = d;
		this.numero = numeroC;
		this.Nombre = NombreC;
	}

	public void ingresar(double i) {
		// TODO Auto-generated method stub
		saldo += i;
		
	}

	public void retirar(double d) {
		// TODO Auto-generated method stub
		if(this.saldo>-500d)
		{
			this.saldo -= d;
		}
		
	}

	

}
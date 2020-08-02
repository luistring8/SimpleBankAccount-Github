package entidades;

public class conta {
	private int nconta;
	private String titular;
	private double vinicial;
	public conta(int nconta, String titular) {
		
		this.nconta = nconta;
		this.titular = titular;
	}
	public conta(int nconta, String titular, double depositoI) {
		
		this.nconta = nconta;
		this.titular = titular;
		deposito(depositoI);
	}
	public int getNconta() {
		return nconta;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getVinicial() {
		return vinicial;
	}
	
	public void deposito(double montante) {
		vinicial += montante;
	}
	
	public void saque (double montante) {
		vinicial -= montante + 5.00;
	}
		
	public String toString() {
		return "conta "
				+ nconta
				+", Titular: "
				+titular
				+", Saldo: "
				+ String.format("%.2f%n", vinicial);
				
	}

		
		
		
	
	
	
	
	
	
	
	

}

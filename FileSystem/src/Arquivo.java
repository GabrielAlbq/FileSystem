import java.util.Date;

public class Arquivo {
	private String nome;
	private Date datacriacao;
	private double tamanhoatual;
	private double tamanhomax;
	
	public Arquivo(String nome, Date datacriacao, double tamanhoatual) {
		this.nome = nome;
		this.datacriacao = datacriacao;
		this.tamanhoatual = tamanhoatual;
		this.tamanhomax = tamanhoatual * 1.5;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDatacriacao() {
		return datacriacao;
	}

	public void setDatacriacao(Date datacriacao) {
		this.datacriacao = datacriacao;
	}

	public double getTamanhoatual() {
		return tamanhoatual;
	}

	public void setTamanhoatual(double tamanhoatual) {
		this.tamanhoatual = tamanhoatual;
	}

	public double getTamanhomax() {
		return tamanhomax;
	}

	public void setTamanhomax(double tamanhomax) {
		this.tamanhomax = tamanhomax;
	}
	
	
}

package Turma;

public class Professor extends Pessoa{
	protected String formacao;
	protected double salario;
	
	protected void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	protected String getFormacao() {
		return this.formacao;
	}
	protected void setSalario(double salario) {
		this.salario = salario;
	}
	protected double getSalario() {
		return this.salario;
	}
}

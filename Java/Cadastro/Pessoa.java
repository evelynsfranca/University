package Turma;

public class Pessoa {
	protected String nome;
	protected long CPF;
	
	protected void setName(String nome) {
		this.nome = nome;
	}
	protected String getName() {
		return this.nome;
	}
	protected void setCPF(long cpf) {
		this.CPF = cpf;
	}
	protected long getCPF() {
		return this.CPF;
	}
}

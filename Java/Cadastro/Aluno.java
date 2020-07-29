package Turma;

public class Aluno extends Pessoa{
	protected int RA;
	protected int periodo;
	
	protected void setRA(int ra) {
		this.RA = ra;
	}
	protected int getRA() {
		return this.RA;
	}
	protected void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	protected int getPeriodo() {
		return this.periodo;
	}
}

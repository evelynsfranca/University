package Turma;

import java.util.Scanner;

public class Cadastro {

	private static Scanner opt;

	public static void main(String[] args) {
		
		int o;
		do {
			System.out.println("----- Menu de cadastro -----");
			System.out.println("	1 - Cadastrar Aluno");
			System.out.println("	2 - Cadastrar Professor");
			System.out.println("	3 - Sair");
			System.out.printf("Selecione uma opção: ", opt);
			
			opt = new Scanner(System.in);
			int option = opt.nextInt();
			
			o = option;
			
			switch(option) {
				case 1:
					Aluno a = new Aluno();				
					System.out.println("\nCadastro de Aluno");
					
					System.out.print("Digite o nome do Aluno: ");
					Scanner nA = new Scanner(System.in);
					String nomeAluno = nA.nextLine();
					a.setName(nomeAluno);
					
					System.out.print("Digite o CPF do Aluno: ");
					Scanner cpfA = new Scanner(System.in);
					String c = cpfA.nextLine();
					long cpfAluno = Long.parseLong(c);					
					a.setCPF(cpfAluno);
	
					System.out.print("Digite o RA do Aluno: ");
					Scanner RAA = new Scanner(System.in);
					int raAluno = RAA.nextInt();
					a.setRA(raAluno);
	
					System.out.print("Digite o período do Aluno: ");
					Scanner peA = new Scanner(System.in);
					int periodoAluno = peA.nextInt();
					a.setPeriodo(periodoAluno);
			
					System.out.println("Aluno cadastrado com sucesso. \n");
					System.out.println("Aluno:");
					System.out.printf("Nome: %s \n", a.getName());
					System.out.printf("CPF: %d \n", a.getCPF());
					System.out.printf("RA: %d \n", a.getRA());
					System.out.printf("Período: %d \n\n", a.getPeriodo());
					
					break;
				case 2:
					Professor p = new Professor();				
					System.out.println("\nCadastro de Professor");
					
					System.out.print("Digite o nome do Professor: ");
					Scanner nP = new Scanner(System.in);
					String nomeProfessor = nP.nextLine();
					p.setName(nomeProfessor);
					
					System.out.print("Digite o CPF do Professor: ");
					Scanner cpfP = new Scanner(System.in);
					String cp = cpfP.nextLine();
					long cpfProfessor = Long.parseLong(cp);
					p.setCPF(cpfProfessor);
	
					System.out.print("Digite a formação do Professor: ");
					Scanner fP = new Scanner(System.in);
					String formacaoProfessor = fP.nextLine();
					p.setFormacao(formacaoProfessor);
	
					System.out.print("Digite o salário do Professor: ");
					Scanner sP = new Scanner(System.in);
					double salarioProfessor = sP.nextDouble();
					p.setSalario(salarioProfessor);
	
					System.out.println("Professor cadastrado com sucesso. \n");
					System.out.println("Professor:");
					System.out.printf("Nome: %s \n", p.getName());
					System.out.printf("CPF: %d \n", p.getCPF());
					System.out.printf("Formação: %s \n", p.getFormacao());
					System.out.printf("Salário: R$%.2f \n\n", p.getSalario());
					break;
				
					default:
						
						break;
			}
		}while(o < 3);

	}


}

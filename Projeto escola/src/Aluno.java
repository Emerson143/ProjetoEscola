import java.util.Scanner;

public class Aluno {

	private String name;
	private int id;

	 int presenca;
	private Turma turma;

	public Aluno(String name, int id, int presenca, Turma turma) {

		this.name = name;
		this.id = id;

		this.presenca = presenca;
		this.turma = turma;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPresenca() {
		if (presenca != 0) {
			return presenca;
		} else {
			return presenca;
		}
	}

	public void setPresenca(int presenca) {
		this.presenca = presenca;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	@Override
	public String toString() {
		return "Aluno: " + name + ", id: " + id + "Nota: " + presenca + ", Turma: " + turma.toString();
	}

	public static void acessoALuno() {

		Scanner sc = new Scanner(System.in);

		Boolean laco = true;

		System.out.println("===========================================");
		System.out.println("=         BEM VINDO ALUNO                 =");
		System.out.println("===========================================");

		String resposta;
		while (laco) {
			
			
			
			System.out.println();
			System.out.println("******************************************");
			System.out.println("* 1 - Boletin                            *");	
			System.out.println("* 2 - Voltar ao menu                     *");
		   	System.out.println("******************************************");;
			resposta = sc.nextLine();
			
			if(resposta.equals("2") ) {
				return;
				
			}
			else {
				System.out.println();
				System.out.print("Digite o ID do aluno: ");
				resposta = sc.nextLine();
				
			}				
			
			System.out.println();

			switch (resposta) {

			case "261":
				System.out.println("Aluno: " + Dados._ListaAluno().get(0).getName());
				System.out.println("Dados do aluno: " + Dados._ListaAluno().get(0).getTurma().toString());
				System.out.print("Nota ");
				Professor.Boletim(0);
				
				break;
			case "268":
				System.out.println("Aluno: " + Dados._ListaAluno().get(1).getName());
				System.out.print("Dados do aluno: " + Dados._ListaAluno().get(1).getTurma().toString());
				Professor.Boletim(1);
				break;
			case "278":
				System.out.println("Aluno: " + Dados._ListaAluno().get(2).getName());
				System.out.print("Dados do aluno: " + Dados._ListaAluno().get(2).getTurma().toString());
				Professor.Boletim(2);
				break;

			default:
				System.out.println("");
				System.out.println("Opção invalida por favor digite novamente...");
				System.out.println("");
				System.out.print("Digite seu ID: ");
				resposta = sc.nextLine();

				sc.close();
			}
		}

	}

	
}
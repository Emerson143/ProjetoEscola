import java.util.Scanner;

public class Aluno {

	
	private String name;
	private int	id;

	private int presenca;
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
		return presenca;
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
		return "Aluno [nome = " + name + ", id= " + id + ", materia =  presenca =" + presenca + ", turma = "
				+ turma.toString() + "]";
	}



	public static void acessoALuno() {

		Scanner sc = new Scanner(System.in);
		
		
			
		Boolean laco = true;
		
		System.out.println("===========================================");
		System.out.println("=         BEM VINDO ALUNO            =");
		System.out.println("===========================================");
		
		
		while (laco) {
			
			System.out.println();
			System.out.println("******************************************");
			System.out.println("* 1   Digite o seu ID       		      *");	
			System.out.println("******************************************");
			
			System.out.print("Digite sua opção: ");
			String resposta = sc.nextLine();
			System.out.println();
			
			switch ( resposta) {
			
			case "261" :
			System.out.println(Dados._ListaAluno().get(0).toString());	
				break;
			case "268" :
				System.out.println(Dados._ListaAluno().get(1).toString());	
			break;	
			case "278" :
				System.out.println(Dados._ListaAluno().get(2).toString());

				break;	
				
				default:
				System.out.println("");
				System.out.println("Opção invalida por favor digite novamente...");
				System.out.println("");
				System.out.print("Digite seu ID: ");
				resposta = sc.nextLine();
				
			}
		}
	
	}
}
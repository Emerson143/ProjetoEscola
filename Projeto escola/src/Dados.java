import java.util.ArrayList;

public class Dados {

	
	public static ArrayList < Aluno > _ListaAluno() {
		
		ArrayList < Aluno > listaAluno = new ArrayList < Aluno >(); 
			
		listaAluno.add(new Aluno("Franccesco Felipe ", 261, 0, new Turma(Periodo.MANHA,Curso.ARTES)));
		listaAluno.add(new Aluno("Lucas dos Santos ", 268, 0, new Turma(Periodo.TARDE,Curso.PROGRAMAÇÃO)));
		listaAluno.add(new Aluno("Eduardo Miranda ", 278, 0, new Turma(Periodo.NOITE,Curso.PROGRAMAÇÃO)));
		
		return listaAluno;
	}
	
	
}
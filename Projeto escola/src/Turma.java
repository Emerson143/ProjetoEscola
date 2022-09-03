
public class Turma {
	private	Periodo periodo;
	private Curso curso;
	
	
	
	public Turma(Periodo periodo, Curso curso) {
		
		this.periodo = periodo;
		this.curso = curso;
	}
	public Periodo getPeriodo() {
		return periodo;
	}
	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}
	public Curso getNomeDaTurma() {
		return curso;
	}
	public void setNomeDaTurma(Curso curso) {
		this.curso = curso;
	}
	@Override
	public String toString() {
		return "periodo: " + periodo + ", Curso: " + curso ;
	}
	
}
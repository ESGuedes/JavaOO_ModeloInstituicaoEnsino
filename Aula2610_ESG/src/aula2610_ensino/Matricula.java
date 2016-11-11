
package aula2610_ensino;


public class Matricula {
    private int id;
    private Aluno aluno;
    private Curso curso;

    public int getId() {
        return id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    public Matricula(){
        
    }
    
    public static void ImprimirDados(Matricula matricula){
        System.out.println("--- Dados Matricula ---");
        System.out.println("Código Aluno: " + matricula.getAluno().getCodigo());
        System.out.println("Nome Aluno: " + matricula.getAluno().getNome());
        System.out.println("Código Curso: " + matricula.getCurso().getCodigo());
        System.out.println("Nome Curso: " + matricula.getCurso().getNome());
        System.out.println("---   ----   ----");
    }
    
    public static void ImprimirCursos(Matricula matricula){
        System.out.println("--- --- ---");
        System.out.println("Código Curso: " + matricula.getCurso().getCodigo());
        System.out.println("Nome Curso: " + matricula.getCurso().getNome());
        System.out.println("---   ----   ----");
    }
    
        public static void ImprimirAlunos(Matricula matricula){
        System.out.println("--- --- ---");
        System.out.println("Código Aluno: " + matricula.getAluno().getCodigo());
        System.out.println("Nome Aluno: " + matricula.getAluno().getNome());
        System.out.println("---   ----   ----");
    }
}
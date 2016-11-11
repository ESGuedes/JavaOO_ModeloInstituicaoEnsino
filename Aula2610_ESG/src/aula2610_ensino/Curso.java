
package aula2610_ensino;


public class Curso {
    private int id;
    private int codigo;
    private String nome;
    private String turno;


    public int getId() {
        return id;
    }


    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getTurno() {
        return turno;
    }


    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Curso(int codigo, String nome, String turno) {
        this.codigo = codigo;
        this.nome = nome;
        this.turno = turno;
        
         this.id = Aula2610_ESG.getCursos().size()+1;
    }
    
    public static void ImprimirCurso (Curso curso){
        System.out.println("----");
        System.out.println("id: " + curso.getId());
        System.out.println("Código: " + curso.getCodigo());
        System.out.println("Nome: " + curso.getNome());
        System.out.println("Turno: " + curso.getTurno());
        System.out.println("----");
    }
    
}

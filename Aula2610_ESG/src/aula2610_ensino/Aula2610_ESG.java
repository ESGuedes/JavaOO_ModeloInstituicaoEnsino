
package aula2610_ensino;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Aula2610_ESG {
    private static Scanner leitor = new Scanner(System.in);
    
    private static List<Aluno> alunos;
    
    public static List<Aluno> getAlunos() {
        return alunos;
    }
        
    private static List<Curso> cursos;
    
    public static List<Curso> getCursos() {
        return cursos;
    }
    
    private static List<Matricula> matriculas;
    
    public static List<Matricula> getMatriculas(){
        return matriculas;
    }
    
    
    
    
    
    public static void main(String[] args) {
        
        // TODO code application logic here
        int opcao = 0;
        
        alunos = new ArrayList<Aluno> ();
        
        cursos = new ArrayList<Curso> ();
        
        matriculas = new ArrayList<Matricula>();
        
        GerarMassaTeste();
            
        do {
            opcao = Menu();
            
            switch(opcao){
                case 1:
                    CadastrarAluno();
                    break;
                case 2:
                    ExibirAlunosCadastrados();
                    break;
                case 3:
                    PesquisarAlunoPorCodigo();
                    break;
                case 4:
                    AlterarAluno();
                    break;
                case 5:
                    ExcluirAluno();
                    break;
                case 6:
                    CadastrarCurso();
                    break;
                case 7:
                    ExibirCursosCadastrados();
                    break;
                case 8:
                    PesquisarCursoPorCodigo();
                    break;    
                case 9:
                    AlterarCurso();
                    break;
                case 10:
                    ExcluirCurso();
                    break;
                case 11:
                    MatricularAluno();
                    break;
                case 12:
                    ExibirMatriculas();
                    break;
                case 13:
                    CursosPorAluno();
                    break;
                case 14:
                    AlunosPorCurso();
                    break;
                case 15:
                    break;
            }
            
        } while (opcao != 15);
        
    }
    private static int Menu(){
        System.out.println("----------------------");
        System.out.println("1 - Cadastrar aluno");
        System.out.println("2 - Exibir alunos cadastrados");
        System.out.println("3 - Pesquisar aluno por código");
        System.out.println("4 - Alterar aluno");
        System.out.println("5 - Excluir aluno");
        System.out.println("6 - Cadastrar curso");
        System.out.println("7 - Exibir cursos cadastrados");
        System.out.println("8 - Pesquisar curso por código");
        System.out.println("9 - Alterar curso");
        System.out.println("10 - Excluir curso");
              
        System.out.println("11 - Matricular aluno");
        System.out.println("12 - Exibir matriculas");
        System.out.println("13 - Listar Cursos Matriculados por Aluno");
        System.out.println("14 - Listar Alunos Matriculados por Curso");
        System.out.println("");
        System.out.println("15 - SAIR");
               
        System.out.println("");
        System.out.println("Digite a opção desejada: ");
        int op = leitor.nextInt();
        leitor.nextLine();
        
        return op;
    }

    private static void CadastrarAluno() {
        
        
        System.out.print("Informe o codigo do aluno: ");
        int codigo = leitor.nextInt();
        leitor.nextLine ();
        
        System.out.print("Informe o Nome do aluno: ");
        String nome = leitor.nextLine();
                
        Aluno a = new Aluno(codigo, nome);
        
        Aula2610_ESG.alunos.add(a);
    }

    private static void CadastrarCurso() {
         System.out.print("Informe o codigo do curso: ");
        int codigo = leitor.nextInt();
        leitor.nextLine();
        
        System.out.print("Informe o Nome do Curso: ");
        String nome = leitor.nextLine();
        
        System.out.print("Informe o Turno do Curso: ");
        String turno = leitor.nextLine();
                
        Curso c = new Curso(codigo, nome,turno);
        
        Aula2610_ESG.cursos.add(c);
       
    }

    private static void ExibirAlunosCadastrados() {
        for (Aluno a :  alunos)
        {
            System.out.println("----");
            System.out.println("id: " + a.getId());
            System.out.println("Código: " + a.getCodigo());
            System.out.println("Nome: " + a.getNome());
            System.out.println("----");
        }
    }

    private static void ExibirCursosCadastrados() {
            for (Curso c :  cursos)
        {
            System.out.println("----");
            System.out.println("id: " + c.getId());
            System.out.println("Código: " + c.getCodigo());
            System.out.println("Nome: " + c.getNome());
            System.out.println("Turno: " + c.getTurno());
            System.out.println("----");
        }
    }

    private static void PesquisarAlunoPorCodigo() {
        System.out.println("Digite o Código do Aluno: ");
        int codAluno = leitor.nextInt();
        leitor.nextLine();
        
        Aluno a  = AlunoPorCodigo(codAluno);
        
        if (a != null){
            Aluno.ImprimirDados(a);
        }
        else{
            System.out.println("Aluno não encontrado!!!");
        }
    }
    
    private static Aluno AlunoPorCodigo (int codAluno){
         for (Aluno a : alunos){
            if(codAluno == a.getCodigo()){
                return a;
            }  
        }
        return null;
    }

    private static void PesquisarCursoPorCodigo() {
        System.out.println("Digite o código do curso: ");
        int codCurso = leitor.nextInt();
        leitor.nextLine();
        
        Curso c = CursoPorCodigo(codCurso);
        
        if (c != null){
            Curso.ImprimirCurso(c);
        }else{
            System.out.println("Curso não encontrado!!!");
        }
    }
    
    private static Curso CursoPorCodigo(int codCurso){
        for (Curso c : cursos){
            if (codCurso == c.getCodigo()){
                return c;
            }
        }
        
        return null;
    }

    private static void AlterarAluno() {
        System.out.println("Digite o Código do Aluno: ");
        int codAluno = leitor.nextInt();
        leitor.nextLine();
        
        Aluno a  = AlunoPorCodigo(codAluno);
        
        if(a != null){
            System.out.println("Digite o novo codigo (anterior "+a.getCodigo()+"): ");
            int nCodAluno = leitor.nextInt();
            leitor.nextLine();
            a.setCodigo(nCodAluno);
            
            System.out.println("Digite o novo nome (anterior "+a.getNome()+"): ");
            String nNomeAluno = leitor.nextLine();
            a.setNome(nNomeAluno);
            
            System.out.println("Aluno alterado com sucesso!!!");
        }
        else{
            System.out.println("Aluno não encontrado!!!");
        }
            
    }

    private static void AlterarCurso() {
        System.out.println("Digite o código do curso: ");
        int codCurso = leitor.nextInt();
        leitor.nextLine();
        
        Curso c = CursoPorCodigo(codCurso);
        
        if (c != null){
            System.out.println("Digite o novo código do curso (anterior "+c.getCodigo()+"): ");
            int nCodCurso = leitor.nextInt();
            leitor.nextLine();
            c.setCodigo(nCodCurso);
            
            System.out.println("Digite o novo nome do curso (anterior "+c.getNome()+"): ");
            String nNomeCurso = leitor.nextLine();
            c.setNome(nNomeCurso);
            
            System.out.println("Digite o novo turno do curso (anterior "+c.getTurno()+"): ");
            String nTurnoCurso = leitor.nextLine();
            c.setTurno(nTurnoCurso);
            
            System.out.println("Curso alterado com sucesso!!!");
        }
        else{
            System.out.println("Curso não localizado!!!");
        }
            
    }

    private static void ExcluirAluno() {
        System.out.println("Digite o código do aluno que deseja excluir: ");
        int codAluno = leitor.nextInt();
        leitor.nextLine();
        
        Aluno a  = AlunoPorCodigo(codAluno);
        
        if (a != null){
           Aula2610_ESG.alunos.remove(a);
            System.out.println("Aluno removido com sucesso!!!");
        }
        else{
            System.out.println("Aluno não localizado!!!");
        }
    }

    private static void ExcluirCurso() {
        System.out.println("Digite o código do curso que deseja excluir: ");
        int codCurso = leitor.nextInt();
        leitor.nextLine();
        
        Curso c = CursoPorCodigo(codCurso);
        
        if (c != null){
            Aula2610_ESG.cursos.remove(c);
            System.out.println("Curso removido com sucesso!!!");
        }
        else{
            System.out.println("Curso não localizado!!!");
        }
    }
    
    private static void MatricularAluno() {
        System.out.print("Digite o codigo do aluno: ");
        int codAluno = leitor.nextInt();
        leitor.nextLine();

        Aluno a = AlunoPorCodigo(codAluno);

        if (a != null) {
            System.out.println("Aluno encontrado:");
            Aluno.ImprimirDados(a);
            
            System.out.print("Digite o codigo do curso: ");
            int codCurso = leitor.nextInt();
            leitor.nextLine();

            Curso c = CursoPorCodigo(codCurso);
            
            

            if (c != null) {
                
                System.out.println("Curso encontrado:");
                Curso.ImprimirCurso(c);
                
                // efetuar a matricula
                Matricula m = new Matricula();
                
                m.setAluno(a);
                m.setCurso(c);
                
                Aula2610_ESG.matriculas.add(m);
                
                System.out.println("Aluno matriculado com sucesso");
                
            } else {
                System.out.println("Curso não cadastrado");
            }

        } else {
            System.out.println("Aluno não cadastrado");
        }

    }

    private static void ExibirMatriculas() {
        for(Matricula m : matriculas){
            Matricula.ImprimirDados(m);
        }
    }
    
    private static void CursosPorAluno(){
        
        System.out.println("Informe o código do aluno: ");
        int codAluno = leitor.nextInt();
        leitor.nextLine();
        
        List<Matricula> cursosMatriculadosPorAluno;
    
        cursosMatriculadosPorAluno = new ArrayList<Matricula>();
        
        for (Matricula m : matriculas){
            if (codAluno == m.getAluno().getCodigo()){
               cursosMatriculadosPorAluno.add(m);
            }
        }
        
         if (cursosMatriculadosPorAluno.size() == 0){
             System.out.println("Aluno não matriculado em nenhum curso.");
         }else{
             for(Aluno a : alunos){
                if(codAluno == a.getCodigo()){
                    System.out.println("--- Dados do Aluno ---");
                    System.out.println("Código Aluno: " + a.getCodigo() );
                    System.out.println("Nome Aluno: " + a.getNome());
                    System.out.println("");
                    System.out.println("--- Cusrsos Matriculados ---");
                
                }
            }
            for(Matricula m : cursosMatriculadosPorAluno){
                Matricula.ImprimirCursos(m);
            }
         }
    }
    
    private static void AlunosPorCurso(){

        System.out.println("Informe o código do curso: ");
        int codCurso = leitor.nextInt();
        leitor.nextLine();

        List<Matricula> alunosMatriculadosPorCurso;

        alunosMatriculadosPorCurso = new ArrayList<Matricula>();

         for (Matricula m : matriculas){
            if (codCurso == m.getCurso().getCodigo()){
               alunosMatriculadosPorCurso.add(m);
            }
        }

         if (alunosMatriculadosPorCurso.size() == 0){
             System.out.println("Curso não possui alunos matriculados.");
         }else{
             for(Curso c : cursos){
                if(codCurso == c.getCodigo()){
                    System.out.println("--- Dados do Curso ---");
                    System.out.println("Código Curso: " + c.getCodigo() );
                    System.out.println("Nome Curso: " + c.getNome());
                    System.out.println("Turno do Curso: " + c.getTurno());
                    System.out.println("");
                    System.out.println("--- Lista dos Alunos metriculados neste Curso ---");

                }
            }
            for(Matricula m : alunosMatriculadosPorCurso){
                Matricula.ImprimirAlunos(m);
            }
        }
    }
    
     private static void GerarMassaTeste(){

            for (int i = 0; i < 5; i++) {
                Aluno a = new Aluno(i+100,"Aluno"+(i+100));
                Aula2610_ESG.alunos.add(a);
            }

            for (int i = 0; i < 3; i++) {
                Curso c = new Curso(i+500, "Curso" + (i+500), "Noite");
                Aula2610_ESG.cursos.add(c);
            }

            // Mstricula 1 aluno 100 no curso 500
            Matricula m0 = new Matricula();
            m0.setAluno(Aula2610_ESG.alunos.get(0));
            m0.setCurso(Aula2610_ESG.cursos.get(0));
            Aula2610_ESG.matriculas.add(m0);
            
            // Mstricula 1 aluno 100 no curso 501
            Matricula m1 = new Matricula();
            m1.setAluno(Aula2610_ESG.alunos.get(0));
            m1.setCurso(Aula2610_ESG.cursos.get(1));
            Aula2610_ESG.matriculas.add(m1);
            
            // Mstricula 2 aluno 101 no curso 500
            Matricula m2 = new Matricula();
            m2.setAluno(Aula2610_ESG.alunos.get(1));
            m2.setCurso(Aula2610_ESG.cursos.get(0));
            Aula2610_ESG.matriculas.add(m2);
            
            // Mstricula 2 aluno 101 no curso 501
            Matricula m3 = new Matricula();
            m3.setAluno(Aula2610_ESG.alunos.get(1));
            m3.setCurso(Aula2610_ESG.cursos.get(1));
            Aula2610_ESG.matriculas.add(m3);
            
             // Mstricula 3 aluno 101 no curso 500
            Matricula m4 = new Matricula();
            m4.setAluno(Aula2610_ESG.alunos.get(2));
            m4.setCurso(Aula2610_ESG.cursos.get(0));
            Aula2610_ESG.matriculas.add(m4);
            
            // Mstricula 4 aluno 101 no curso 501
            Matricula m5 = new Matricula();
            m5.setAluno(Aula2610_ESG.alunos.get(3));
            m5.setCurso(Aula2610_ESG.cursos.get(1));
            Aula2610_ESG.matriculas.add(m5);
            
         }
    
}
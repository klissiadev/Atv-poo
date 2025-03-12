import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Universidade universidade = new Universidade();
    private static Scanner scan = new Scanner(System.in);


    public static void criaraluno() {
        System.out.println("\nDigite o nome do aluno: ");
        String nome = scan.nextLine();
        System.out.println("\nDigite a matrícula do aluno: ");
        String mat = scan.nextLine();

        System.out.println("Digite o código do Curso do aluno: ");
        String codigocurso = scan.nextLine();

        System.out.println("Digite o email do aluno: ");
        String email = scan.nextLine();

        Aluno aluno = new Aluno(nome, mat, codigocurso, email);
        universidade.cadastrar_aluno(aluno);

        System.out.println("Aluno matriculado com sucesso!");
    }

    public static void consultaraluno() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a matrícula do aluno: ");
        String matricula = scan.nextLine();
        for (Aluno aluno : universidade.getAlunos()) {
            if (aluno.getMatricula().equals(matricula)) {
                System.out.println("\n----------------------------------\n" + aluno.toString());
            }
        }
    }
    public static void jubilaraluno() {
        System.out.println("Digite a matrícula do aluno: ");
        String matricula = scan.nextLine();
        for (Aluno aluno : universidade.getAlunos()) {
            if (aluno.getMatricula().equals(matricula)) {
                universidade.jubilar_aluno(aluno);
            }
        }
    }

    public static void main(String[] args) {
        Curso curso1 = new Curso("Sistemas de informação", "ESTSI ");
        Curso curso2 = new Curso("Licenciatura em Computação", "ESTLCOM ");
        curso1.cadastrar_materia("Projeto de programas");
        curso2.cadastrar_materia("Sociologia");

        universidade.cadastrar_curso(curso1);
        universidade.cadastrar_curso(curso2);

        boolean running = true;
        int op;

        while (running) {
            System.out.println("\n ------- Menu ------");
            System.out.println(" 1 - Listar alunos");
            System.out.println(" 2 - Listar Cursos");
            System.out.println(" 3 - Sair");
            System.out.println("\nSelecione uma opção:");
            op = scan.nextInt();
            switch (op) {
                case 1:
                    universidade.listaralunos();
                    System.out.println("\n----------------------------------\n");
                    System.out.println(" 1 - Cadastrar aluno");
                    System.out.println(" 2 - Consultar aluno");
                    System.out.println(" 3 - Jubilar aluno");
                    System.out.println(" 4 - Voltar");
                    System.out.println("\nSelecione uma opção:");
                    op = scan.nextInt();
                    switch (op) {
                        case 1:
                            criaraluno();
                            break;
                            case 2:
                                consultaraluno();
                                break;
                                case 3:
                                    jubilaraluno();
                                    break;
                    }
                    break;
                    case 2:
                        universidade.listarcursos();
                        break;
                        case 3:
                            running = false;
                            break;
            }
        }
    }
}
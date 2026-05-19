package service;

import database.Conexao;
import model.AlunoModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;

public class AlunoService {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<AlunoModel> listaAlunos = new ArrayList<>();

    public void cadastrarAluno(){
        System.out.println("|--- Cadastrar Aluno ---|");
        System.out.println("CPF:");
        String cpf = sc.nextLine();

        System.out.println("Primeiro Nome:");
        String primeiroNome = sc.nextLine();

        System.out.println("Nome do meio:");
        String nomeMeio = sc.nextLine();

        System.out.println("Sobrenome:");
        String ultimoNome = sc.nextLine();

        System.out.println("Data de nascimento:");
        String dataNascimento = sc.nextLine();

        System.out.println("Telefone:");
        String telefone = sc.nextLine();

        System.out.println("Email:");
        String email = sc.nextLine();

        System.out.println("Data de matrícula:");
        String dataMatricula = sc.nextLine();

        System.out.println("Plano:");
        String plano = sc.nextLine();

        AlunoModel aluno = new AlunoModel(
                cpf,
                primeiroNome,
                nomeMeio,
                ultimoNome,
                telefone,
                email,
                dataNascimento,
                dataMatricula,
                plano
        );

        salvarNoBanco(aluno);
    }

    public void listarAlunos(){

        if(listaAlunos.isEmpty()){
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        System.out.println("\n===== LISTA DE ALUNOS =====");

        for(AlunoModel aluno : listaAlunos){

            System.out.println("----------------------------");
            System.out.println("Nome: "
                    + aluno.getPrimeiroNome() + " "
                    + aluno.getNomeMeio() + " "
                    + aluno.getUltimoNome());

            System.out.println("CPF: " + aluno.getCpf());
            System.out.println("Telefone: " + aluno.getTelefone());
            System.out.println("Email: " + aluno.getEmail());
            System.out.println("Data de nascimento: " + aluno.getDataNascimento());
            System.out.println("Data de matrícula: " + aluno.getDataMatricula());
            System.out.println("Plano: " + aluno.getPlano());
            System.out.println("----------------------------\n");
        }
    }

    public void editarAluno(){

        System.out.println("\n|--- EDITAR ALUNO ---|");

        System.out.println("Digite o CPF do aluno:");
        String cpf = sc.nextLine();

        for(AlunoModel aluno : listaAlunos){

            if(aluno.getCpf().equals(cpf)){

                System.out.println("\nAluno encontrado!");

                System.out.println("""
                    
                    O que deseja editar?
                    
                    1 - Primeiro nome
                    2 - Nome do meio
                    3 - Sobrenome
                    4 - Telefone
                    5 - Email
                    6 - Data de nascimento
                    7 - Data de matrícula
                    8 - Plano
                    """);

                int opcao = Integer.parseInt(sc.nextLine());

                switch(opcao){

                    case 1:
                        System.out.println("Novo primeiro nome:");
                        aluno.setPrimeiroNome(sc.nextLine());
                        break;

                    case 2:
                        System.out.println("Novo nome do meio:");
                        aluno.setNomeMeio(sc.nextLine());
                        break;

                    case 3:
                        System.out.println("Novo sobrenome:");
                        aluno.setUltimoNome(sc.nextLine());
                        break;

                    case 4:
                        System.out.println("Novo telefone:");
                        aluno.setTelefone(sc.nextLine());
                        break;

                    case 5:
                        System.out.println("Novo email:");
                        aluno.setEmail(sc.nextLine());
                        break;

                    case 6:
                        System.out.println("Nova data de nascimento:");
                        aluno.setDataNascimento(sc.nextLine());
                        break;

                    case 7:
                        System.out.println("Nova data de matrícula:");
                        aluno.setDataMatricula(sc.nextLine());
                        break;

                    case 8:
                        System.out.println("Novo plano:");
                        aluno.setPlano(sc.nextLine());
                        break;

                    default:
                        System.out.println("Opção inválida.");
                        return;
                }

                System.out.println("Informação atualizada com sucesso!");
                return;
            }
        }

        System.out.println("Aluno não encontrado.");
    }

    public void excluirAluno(){

        System.out.println("\n|--- EXCLUIR ALUNO ---|");

        System.out.println("Digite o CPF do aluno:");
        String cpf = sc.nextLine();

        for(int i = 0; i < listaAlunos.size(); i++){

            if(listaAlunos.get(i).getCpf().equals(cpf)){

                listaAlunos.remove(i);

                System.out.println("Aluno removido com sucesso!");
                return;
            }
        }

        System.out.println("Aluno não encontrado.");
    }

    private void salvarNoBanco(AlunoModel aluno) {

        String sql = """
                INSERT INTO aluno
                (alu_cpf,
                 alu_primeiro_nome,
                 alu_nome_meio,
                 alu_ultimo_nome,
                 alu_telefone,
                 alu_email,
                 alu_data_nascimento,
                 alu_data_matricula,
                 alu_plano)
                VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)
                """;

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, aluno.getCpf());
            stmt.setString(2, aluno.getPrimeiroNome());
            stmt.setString(3, aluno.getNomeMeio());
            stmt.setString(4, aluno.getUltimoNome());
            stmt.setString(5, aluno.getTelefone());
            stmt.setString(6, aluno.getEmail());
            stmt.setString(7, aluno.getDataNascimento());
            stmt.setString(8, aluno.getDataMatricula());
            stmt.setString(9, aluno.getPlano());

            stmt.executeUpdate();

            System.out.println("Aluno salvo com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


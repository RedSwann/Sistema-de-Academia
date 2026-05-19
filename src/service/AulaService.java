package service;

import database.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.util.ArrayList;
import java.util.Scanner;
import model.AulaModel;

public class AulaService {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<AulaModel> listaAula = new ArrayList<>();

    public void cadastrarAula(){
        System.out.println("|--- Cadastrar Aula ---|");

        System.out.println("Id:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Nome da Aula:");
        String nome = sc.nextLine();

        System.out.println("Descrição da Aula:");
        String descricao = sc.nextLine();

        System.out.println("Horário da Aula:");
        String horario = sc.nextLine();

        System.out.println("Capacidade:");
        int capacidade = sc.nextInt();
        sc.nextLine();

        System.out.println("Duração:");
        String duracao = sc.nextLine();

        System.out.println("Cpf do instrutor que dará a Aula:");
        String insCpf = sc.nextLine();

        AulaModel aula = new AulaModel(
                id,
                nome,
                descricao,
                horario,
                capacidade,
                duracao,
                insCpf
        );

        salvarNoBanco(aula);
    }

    public void listarAulas(){

        if(listaAula.isEmpty()){
            System.out.println("Nenhuma Aula cadastrada.");
            return;
        }

        System.out.println("\n===== LISTA DE ALUNOS =====");

        for(AulaModel aula : listaAula){

            System.out.println("----------------------------");
            System.out.println("ID:" + aula.getAulaId());
            System.out.println("Nome:" +aula.getNome());
            System.out.println("Descricao: " + aula.getDescricao());
            System.out.println("Horário: " + aula.getHorario());
            System.out.println("Capacidade: " + aula.getCapacidade());
            System.out.println("Duracao: " + aula.getDuracao());
            System.out.println("Cpf do Instrutor: " + aula.getInsCpf());
            System.out.println("----------------------------\n");
        }
    }

    public void editarAula(){

        System.out.println("\n|--- EDITAR AULA ---|");

        System.out.println("Digite o ID da Aula:");
        int aulaId = Integer.parseInt(sc.nextLine());

        for(AulaModel aula : listaAula){

            if(aula.getAulaId() == aulaId){

                System.out.println("\nAula encontrada!");

                System.out.println("""
                
                O que deseja editar?
                
                1 - Nome da Aula
                2 - Descrição
                3 - Horário
                4 - Capacidade
                5 - Duração
                6 - CPF do Instrutor
                """);

                int opcao = Integer.parseInt(sc.nextLine());

                switch(opcao){

                    case 1:
                        System.out.println("Novo nome da Aula:");
                        aula.setNome(sc.nextLine());
                        break;

                    case 2:
                        System.out.println("Nova descrição:");
                        aula.setDescricao(sc.nextLine());
                        break;

                    case 3:
                        System.out.println("Novo horário:");
                        aula.setHorario(sc.nextLine());
                        break;

                    case 4:
                        System.out.println("Nova capacidade:");
                        aula.setCapacidade(Integer.parseInt(sc.nextLine()));
                        break;

                    case 5:
                        System.out.println("Nova duração:");
                        aula.setDuracao(sc.nextLine());
                        break;

                    case 6:
                        System.out.println("Novo CPF do Instrutor:");
                        aula.setInsCpf(sc.nextLine());
                        break;

                    default:
                        System.out.println("Opção inválida.");
                        return;
                }

                System.out.println("Informação atualizada com sucesso!");
                return;
            }
        }

        System.out.println("Aula não encontrada.");
    }

    public void excluirAula(){

        System.out.println("\n|--- EXCLUIR AULA ---|");

        System.out.println("Digite o ID da Aula:");
        int aulaId = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < listaAula.size(); i++){

            if(listaAula.get(i).getAulaId() == aulaId){

                listaAula.remove(i);

                System.out.println("Aluno removido com sucesso!");
                return;
            }
        }

        System.out.println("Aluno não encontrado.");
    }

    private void salvarNoBanco(AulaModel aula) {

        String sql = """
                INSERT INTO aula
                (aul_id,
                 aul_nome,
                 aul_descricao,
                 aul_horario,
                 aul_capacidade,
                 aul_duracao,
                 ins_cpf)
                VALUES (?, ?, ?, ?, ?, ?, ?)
                """;

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, aula.getAulaId());
            stmt.setString(2, aula.getNome());
            stmt.setString(3, aula.getDescricao());
            stmt.setString(4, aula.getHorario());
            stmt.setInt(5, aula.getCapacidade());
            stmt.setString(6, aula.getDuracao());
            stmt.setString(7, aula.getInsCpf());

            stmt.executeUpdate();

            System.out.println("Aula salva com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

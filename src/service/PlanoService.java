package service;

import database.Conexao;
import model.AulaModel;
import model.PlanoModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;

public class PlanoService {

    private Scanner sc = new Scanner(System.in);
    private ArrayList<PlanoModel> listaPlano = new ArrayList<>();

    public void cadastrarPlano(){

        System.out.println("|--- Cadastrar Plano ---|");

        System.out.println("Id do plano:");
        int planoId = Integer.parseInt(sc.nextLine());

        System.out.println("Nome do plano:");
        String nome = sc.nextLine();

        System.out.println("Descrição:");
        String descricao = sc.nextLine();

        System.out.println("Beneficios do plano:");
        String beneficios = sc.nextLine();


        System.out.println("Valor do plano:");
        double valor = Double.parseDouble(sc.nextLine());

        System.out.println("Duração do plano:");
        int duracaoMeses = sc.nextInt();
        sc.nextLine();

        PlanoModel plano = new PlanoModel(
                planoId,
                nome,
                descricao,
                valor,
                duracaoMeses,
                beneficios
        );

        salvarNoBanco(plano);
    }

    public void listarPlanos(){

        if(listaPlano.isEmpty()){
            System.out.println("Nenhum Plano cadastrado.");
            return;
        }

        System.out.println("\n===== LISTA DE ALUNOS =====");

        for(PlanoModel plano : listaPlano){

            System.out.println("----------------------------");
            System.out.println("ID do Plano:" + plano.getPlanoId());
            System.out.println("Nome:" +plano.getNome());
            System.out.println("Descricao: " + plano.getDescricao());
            System.out.println("Valor: " + plano.getValor());
            System.out.println("Duracao: " + plano.getDuracaoMeses());
            System.out.println("Benefícios: " + plano.getBeneficios());
            System.out.println("----------------------------\n");
        }
    }

    public void editarPlano(){

        System.out.println("\n|--- EDITAR PLANO ---|");

        System.out.println("Digite o ID do Plano:");
        int planoId = Integer.parseInt(sc.nextLine());

        for(PlanoModel plano : listaPlano){

            if(plano.getPlanoId() == planoId){

                System.out.println("\nPlano encontrado!");

                System.out.println("""
                
                O que deseja editar?
                
                1 - Nome do Plano
                2 - Descrição
                3 - Valor
                4 - Duração do Plano(em meses)
                5 - Benefícios
                """);

                int opcao = Integer.parseInt(sc.nextLine());

                switch(opcao){

                    case 1:
                        System.out.println("Novo nome do Plano:");
                        plano.setNome(sc.nextLine());
                        break;

                    case 2:
                        System.out.println("Nova descrição:");
                        plano.setDescricao(sc.nextLine());
                        break;

                    case 3:
                        System.out.println("Novo Valor:");
                        plano.setValor(sc.nextDouble());
                        break;

                    case 4:
                        System.out.println("Nova Duração em Meses:");
                        plano.setDuracaoMeses(Integer.parseInt(sc.nextLine()));
                        break;

                    case 5:
                        System.out.println("Novos benefícios:");
                        plano.setBeneficios(sc.nextLine());
                        break;

                    default:
                        System.out.println("Opção inválida.");
                        return;
                }

                System.out.println("Informação atualizada com sucesso!");
                return;
            }
        }

        System.out.println("Plano não encontrada.");
    }

    public void excluirPlano(){

        System.out.println("\n|--- EXCLUIR PLANO ---|");

        System.out.println("Digite o ID do Plano:");
        int planoId = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < listaPlano.size(); i++){

            if(listaPlano.get(i).getPlanoId() == planoId){

                listaPlano.remove(i);

                System.out.println("Plano removido com sucesso!");
                return;
            }
        }

        System.out.println("Plano não encontrado.");
    }


    private void salvarNoBanco(PlanoModel plano){

        String sql = """
                INSERT INTO plano
                (pln_id,
                 pln_nome,
                 pln_descricao,
                 pln_valor,
                 pln_duracao,
                 pln_beneficos)
                VALUES (?, ?, ?, ?, ?)
                """;

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setInt(1, plano.getPlanoId());
            stmt.setString(2, plano.getNome());
            stmt.setString(3, plano.getDescricao());
            stmt.setDouble(4, plano.getValor());
            stmt.setInt(5, plano.getDuracaoMeses());

            stmt.executeUpdate();

            System.out.println("Plano salvo com sucesso!");

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

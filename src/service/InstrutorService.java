package service;

import database.Conexao;
import model.InstrutorModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InstrutorService {

    private Scanner sc = new Scanner(System.in);

    public void cadastrarInstrutor() {

        System.out.println("|--- Cadastrar Instrutor ---|");

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Primeiro Nome: ");
        String primeiroNome = sc.nextLine();

        System.out.print("Nome do meio: ");
        String nomeMeio = sc.nextLine();

        System.out.print("Ultimo nome: ");
        String ultimoNome = sc.nextLine();

        System.out.print("Telefone: ");
        String telefone = sc.nextLine();

        System.out.print("Especialidade: ");
        String especialidade = sc.nextLine();

        System.out.print("Horario de trabalho: ");
        String horario = sc.nextLine();

        InstrutorModel instrutor = new InstrutorModel(
                cpf,
                primeiroNome,
                nomeMeio,
                ultimoNome,
                telefone,
                especialidade,
                horario
        );

        salvarNoBanco(instrutor);
    }

    private void salvarNoBanco(InstrutorModel instrutor) {

        String sql = """
                INSERT INTO instrutor
                (ins_cpf,
                 ins_primeiro_nome,
                 ins_nome_meio,
                 ins_ultimo_nome,
                 ins_telefone,
                 ins_especialidade,
                 ins_horario_trabalho)
                VALUES (?, ?, ?, ?, ?, ?, ?)
                """;

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, instrutor.getCpf());
            stmt.setString(2, instrutor.getPrimeiroNome());
            stmt.setString(3, instrutor.getNomeMeio());
            stmt.setString(4, instrutor.getUltimoNome());
            stmt.setString(5, instrutor.getTelefone());
            stmt.setString(6, instrutor.getEspecialidade());
            stmt.setString(7, instrutor.getHorarioTrabalho());

            stmt.executeUpdate();

            System.out.println("Salvo com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
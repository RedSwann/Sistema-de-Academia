package service;

import model.InstrutorModel;
import java.util.ArrayList;
import java.util.Scanner;

public class InstrutorService {

    private ArrayList<InstrutorModel> instrutores = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void cadastrarInstrutor() {

        System.out.println("|--- Cadastrar Instrutor ---|");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Telefone: ");
        String telefone = sc.nextLine();

        System.out.print("Especialidade: ");
        String especialidade = sc.nextLine();

        System.out.print("Horario: ");
        String horario = sc.nextLine();

        InstrutorModel instrutor = new InstrutorModel(nome, cpf, telefone, especialidade, horario);
        instrutores.add(instrutor);

        System.out.println("Instrutor cadastrado!");
    }

    public void listasInstrutores(){
        System.out.println("--- Lista ---");

        if ((instrutores.isEmpty())){
            System.out.println("Não existe nenhum instrutor cadastrado.");
            return;
        }

        for(InstrutorModel i : instrutores){
            System.out.println(i);
        }
    }
}
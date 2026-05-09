package menus;

import java.util.Scanner;

public class MenuInscricoes {
    private Scanner sc = new Scanner(System.in);

    public  int exibirMenuInscricoes(){

        System.out.println("|-------------------------------------------|");
        System.out.println("|              MENU INSCRIÇÕES              |");
        System.out.println("|-------------------------------------------|");
        System.out.println("|    1 - Inscrever Aluno em Aula            |");
        System.out.println("|    2 - Cancelar Inscrições do Aluno       |");
        System.out.println("|    3 - Listar Alunos de uma Aula          |");
        System.out.println("|    4 - Listar Inscrições do Aluno         |");
        System.out.println("|    0 - Voltar                             |");
        System.out.println("|                                           |");
        System.out.println("|                                           |");
        System.out.println("|-------------------------------------------|");
        System.out.print("Selecione uma opção:  ");

        return sc.nextInt();
    }

}

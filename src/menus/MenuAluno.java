package menus;

import java.util.Scanner;

public class MenuAluno {
    private Scanner sc = new Scanner(System.in);

    public  int exibirMenuAluno(){

        System.out.println("|-------------------------------------------|");
        System.out.println("|                 MENU ALUNO                |");
        System.out.println("|-------------------------------------------|");
        System.out.println("|    1 - Cadastrar nova Aluno               |");
        System.out.println("|    2 - Listar Alunos                      |");
        System.out.println("|    3 - Atualizar Aluno                    |");
        System.out.println("|    4 - Remover Aluno                      |");
        System.out.println("|    0 - Voltar                             |");
        System.out.println("|                                           |");
        System.out.println("|                                           |");
        System.out.println("|-------------------------------------------|");
        System.out.print("Selecione uma opção:  ");

        return sc.nextInt();
    }
}

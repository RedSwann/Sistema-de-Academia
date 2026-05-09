package menus;

import java.util.Scanner;

public class MenuAula {
    private Scanner sc = new Scanner(System.in);

    public  int exibirMenuAula(){

        System.out.println("|-------------------------------------------|");
        System.out.println("|                 MENU AULAS                |");
        System.out.println("|-------------------------------------------|");
        System.out.println("|    1 - Cadastrar nova Aula                |");
        System.out.println("|    2 - Listar Aulas                       |");
        System.out.println("|    3 - Atualizar Aula                     |");
        System.out.println("|    4 - Remover Aula                       |");
        System.out.println("|    0 - Voltar                             |");
        System.out.println("|                                           |");
        System.out.println("|                                           |");
        System.out.println("|-------------------------------------------|");
        System.out.print("Selecione uma opção:  ");

        return sc.nextInt();
    }
}

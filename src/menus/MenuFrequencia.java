package menus;

import java.util.Scanner;

public class MenuFrequencia {
    private Scanner sc = new Scanner(System.in);

    public  int exibirMenuFrequencia(){

        System.out.println("|-------------------------------------------|");
        System.out.println("|              MENU FREQUENCIA              |");
        System.out.println("|-------------------------------------------|");
        System.out.println("|    1 - Registra Entrada                   |");
        System.out.println("|    2 - Listar Frequência do Aluno         |");
        System.out.println("|    3 - Histórico de Aluno                 |");
        System.out.println("|    0 - Voltar                             |");
        System.out.println("|                                           |");
        System.out.println("|                                           |");
        System.out.println("|                                           |");
        System.out.println("|-------------------------------------------|");
        System.out.print("Selecione uma opção:  ");

        return sc.nextInt();
    }
}

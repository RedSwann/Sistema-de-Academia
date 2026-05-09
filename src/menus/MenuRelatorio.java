package menus;

import java.util.Scanner;

public class MenuRelatorio {
    private Scanner sc = new Scanner(System.in);

    public  int exibirMenuRelatorio(){

        System.out.println("|-------------------------------------------|");
        System.out.println("|              MENU RELATÓRIO               |");
        System.out.println("|-------------------------------------------|");
        System.out.println("|    1 - Relatório de frequência de Aluno   |");
        System.out.println("|    2 - Relatório de ocupação das Aulas    |");
        System.out.println("|    3 - Alunos com Plano vencido           |");
        System.out.println("|    0 - Voltar                             |");
        System.out.println("|                                           |");
        System.out.println("|                                           |");
        System.out.println("|                                           |");
        System.out.println("|-------------------------------------------|");
        System.out.print("Selecione uma opção:  ");

        return sc.nextInt();
    }

}

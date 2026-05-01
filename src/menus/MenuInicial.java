package menus;

import java.util.Scanner;

public class MenuInicial {
    public int exibirmenu(){
        Scanner sc = new Scanner(System.in);

            System.out.println("|-------------------------------------------|");
            System.out.println("|     Sistema De Gerenciamento Academia     |");
            System.out.println("|-------------------------------------------|");
            System.out.println("|    1 - Alunos                             |");
            System.out.println("|    2 - Instrutores                        |");
            System.out.println("|    3 - Planos                             |");
            System.out.println("|    4 - Criar Aula                         |");
            System.out.println("|    5 - Inscrições                         |");
            System.out.println("|    6 - Controle de Acessos                |");
            System.out.println("|    0 - Sair                               |");
            System.out.println("|-------------------------------------------|");
            System.out.print("Selecione uma das opções: ");
            return sc.nextInt();
    }
}

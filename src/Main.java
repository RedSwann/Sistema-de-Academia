import menus.MenuInicial;
import menus.MenuInstrutor;
import service.InstrutorService;

public class Main {
    public static void main(String[] args) {

        MenuInicial menu = new MenuInicial();
        InstrutorService instrutorService = new InstrutorService();

        int opcao;

        do {

            opcao = menu.exibirmenu();

            switch (opcao){
                case 1:
                    System.out.println("Criar classe Alunos");
                    break;

                case 2:

                    MenuInstrutor menuInstrutor = new MenuInstrutor();
                    int opcaoInstrutor;

                    do {

                        opcaoInstrutor = menuInstrutor.exibirMenuInstrutor();

                        switch (opcaoInstrutor){
                            case 1:
                                instrutorService.cadastrarInstrutor();
                                break;

                            case 2:
                                // - Criar lista
                                break;

                            case 3:
                                //  - Criar metodo para atualizar instrutor
                                break;
                            case 4:
                                // Criar metodo para excluir instrutor
                                break;

                            case 0:
                                System.out.println("Voltando...");

                            default:
                                System.out.println("Opção invalida!");
                        }
                    }while (opcaoInstrutor != 0);

                    break;

                case 3:
                    System.out.println("Criar classe Planos");
                    break;

                case 4:
                    System.out.println("Criar classe Aulas");
                    break;

                case 5:
                    System.out.println("Criar classe Inscrições");
                    break;

                case 6:
                    System.out.println("Criar classe Controle de acesso");
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção invalida!");
                    break;

            }
        }while (opcao != 0);
    }
}
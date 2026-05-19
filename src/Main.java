//menus
import menus.*;

//service
import service.AlunoService;
import service.InstrutorService;
import service.AulaService;

public class Main {
    public static void main(String[] args) {

        MenuInicial menu = new MenuInicial();
        InstrutorService instrutorService = new InstrutorService();
        AlunoService alunoService = new AlunoService();
        AulaService aulaService = new AulaService();

        int opcao;

        do {

            opcao = menu.exibirmenu();

            switch (opcao){
                case 1:
                    MenuAluno menuAluno = new MenuAluno();
                    int opcaoAluno;

                    do{
                        opcaoAluno = menuAluno.exibirMenuAluno();

                        switch(opcaoAluno){
                            case 1://cadastrar
                                alunoService.cadastrarAluno();
                                break;
                            case 2://listar
                                alunoService.listarAlunos();
                                break;
                            case 3://editar
                                alunoService.editarAluno();
                                break;
                            case 4: //excluir
                                alunoService.excluirAluno();
                                break;
                            case 0:
                                System.out.println("Retornando para o menu principal....");
                                break;
                        }
                    }while(opcaoAluno != 0);
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
                    MenuPlano menuPlano = new MenuPlano();
                    int opcaoPlano;
                    do {
                        opcaoPlano = menuPlano.exibirMenuPlano();

                        switch (opcaoPlano){
                            case 1://cadastrar
                                planoService.cadastrarPlano();
                                break;

                            case 2:
                                // listar
                                planoService.listarPlanos();
                                break;

                            case 3:
                                //  editar
                                planoService.editarPlano();
                                break;
                            case 4:
                                // excluir
                                planoService.excluirPlano();
                                break;

                            case 0:
                                System.out.println("Voltando...");

                            default:
                                System.out.println("Opção invalida!");
                        }
                    }while (opcaoPlano != 0);

                    break;

                case 4:
                    MenuAula menuAula = new MenuAula();
                    int opcaoAula;

                    do{
                        opcaoAula = menuAula.exibirMenuAula();

                        switch(opcaoAula){
                            case 1://cadastrar
                                aulaService.cadastrarAula();
                                break;
                            case 2://listar
                                aulaService.listarAulas();
                                break;
                            case 3://editar
                                aulaService.editarAula();
                                break;
                            case 4: //excluir
                                aulaService.excluirAula();
                                break;
                            case 0:
                                System.out.println("Retornando para o menu principal....");
                                break;
                        }
                    }while(opcaoAula != 0);
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

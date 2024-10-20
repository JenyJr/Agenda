import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        Scanner sc = new Scanner(System.in);
        int loop = 1;

        while (loop != 3){
            int escolha = menu(sc);
            if (escolha == 1){
                consultarContato(sc, agenda);
            }
            else if (escolha == 2) {
                adicionarContato(sc, agenda);
            }
        }
    }

    public static void consultarContato(Scanner sc, Agenda agenda){
        System.out.println("===== Consultar contato na agenda =====");
        String nome = lerDados(sc, "Insira o nome do contato a ser pesquisado: ");
        if (agenda.consultarContato(nome) > 0){
            System.out.println(STR."\{nome} está na agenda!!");
        }else {
            System.out.println(STR."\{nome} não está na agenda!!");
        }
    }

    public static void adicionarContato(Scanner sc, Agenda agenda){
        System.out.println("===== Adicionar contato na agenda =====");
        String nome = lerDados(sc, "Nome: ");
        String telefone = lerDados(sc, "Telefone: ");
        String email = lerDados(sc, "Email: ");

        Contato contato = new Contato();
        contato.setNome(nome);
        contato.setEmail(email);
        contato.setTelefone(telefone);

        System.out.println("Adicionado a agenda: ");
        System.out.println(contato);

        agenda.adicionarContato(contato);
    }

    public static String lerDados(Scanner sc, String msg){
        System.out.println(msg);
        String escolha = sc.nextLine();
        return escolha;
    }

    public static int menu(Scanner sc){

        int escolha = 0;
        boolean isValido = false;

        while (!isValido){
            System.out.println("===== Agenda telefonica =====");
            System.out.println("1 - Consultar contato na agenda.");
            System.out.println("2 - Adicionar contato na agenda.");
            System.out.println("3 - Sair.");

            try {
                String entrada = sc.nextLine();
                escolha = Integer.parseInt(entrada);

                if (escolha == 1 || escolha == 2 || escolha == 3){
                    isValido = true;
                }else {
                    throw new Exception("Opção invalida!!");
                }
            } catch (Exception e) {
                System.out.println("Opção invalida!!");
            }

        }
        return escolha;
    }
}

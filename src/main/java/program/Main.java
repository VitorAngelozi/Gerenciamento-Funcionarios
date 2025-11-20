package program;

import gerenciamentoFuncionarios.ControleEstoque;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ArrayList<ControleEstoque> funcionarios = new ArrayList<>();

        int opcao = 0;

        while (opcao != 6) {

            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Aumentar salário");
            System.out.println("3 - Diminuir salário");
            System.out.println("4 - Mostrar funcionário por ID");
            System.out.println("5 - Listar todos os funcionários");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    sc.nextLine();
                    ControleEstoque f = new ControleEstoque();

                    System.out.print("Nome: ");
                    f.nome = sc.nextLine();

                    System.out.print("Salário bruto: ");
                    f.salarioBruto = sc.nextDouble();

                    System.out.print("Taxa (%): ");
                    f.taxa = sc.nextDouble();

                    funcionarios.add(f);
                    System.out.println("Funcionário cadastrado com ID: " + (funcionarios.size() - 1));
                    break;

                case 2:
                    System.out.print("ID: ");
                    int idAumento = sc.nextInt();

                    if (idAumento < funcionarios.size()) {
                        System.out.print("Aumentar salário em quantos %? ");
                        double pct = sc.nextDouble();
                        funcionarios.get(idAumento).aumentarSalario(pct);
                    } else {
                        System.out.println("ID inválido!");
                    }
                    break;

                case 3:
                    System.out.print("ID: ");
                    int idDiminuir = sc.nextInt();

                    if (idDiminuir < funcionarios.size()) {
                        System.out.print("Diminuir salário em quantos %? ");
                        double pctD = sc.nextDouble();
                        funcionarios.get(idDiminuir).diminuirSalario(pctD);
                    } else {
                        System.out.println("ID inválido!");
                    }
                    break;

                case 4:
                    System.out.print("ID do funcionário: ");
                    int idMostrar = sc.nextInt();

                    if (idMostrar < funcionarios.size()) {
                        System.out.println(funcionarios.get(idMostrar));
                    } else {
                        System.out.println("ID inválido!");
                    }
                    break;

                case 5:
                    System.out.println("\n=== LISTA DE FUNCIONÁRIOS ===");
                    for (int i = 0; i < funcionarios.size(); i++) {
                        System.out.println("ID " + i + ": " + funcionarios.get(i));
                    }
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}

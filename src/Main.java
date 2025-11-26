import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Moeda> moedas = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        System.out.println("BEM VINDO AO COFRINHO");
        while (true) {
            System.out.println("1 - ADICIONAR MOEDAS");
            System.out.println("2 - REMOVER MOEDAS");
            System.out.println("3 - LISTAR MOEDAS");
            System.out.println("4 - TOTAL DE MOEDAS CONVERTIDO EM BRL");
            System.out.println("0 - SAIR");
            System.out.println("DIGITE O NUMERO DA OPCAO ");
            int op = teclado.nextInt();
            switch (op) {
                case 1:
                    System.out.println("ADICIONAR MOEDAS");
                    System.out.println("ESCOLHA A MOEDA");
                    System.out.println("1 - REAL");
                    System.out.println("2 - DOLAR");
                    System.out.println("3 - EURO");
                    int opicao = teclado.nextInt();
                    switch (opicao) {
                        case 1:
                            System.out.println("REAL SELECIONADO");
                            System.out.println("DIGITE O VALOR ");
                            double valor = teclado.nextDouble();
                            moedas.add(new Real(valor));
                            System.out.println("VALOR ADICIONADO");
                            break;
                        case 2:
                            System.out.println("DOLAR SELECIONADO");
                            System.out.println("DIGITE O VALOR ");
                            valor = teclado.nextDouble();
                            moedas.add(new Dolar(valor));
                            System.out.println("VALOR ADICIONADO");
                            break;
                        case 3:
                            System.out.println("EURO SELECIONADO");
                            System.out.println("DIGITE O VALOR ");
                            valor = teclado.nextDouble();
                            moedas.add(new Euro(valor));
                            System.out.println("VALOR ADICIONADO");
                            break;
                        default:
                            System.out.println("OPÇÃO INVÁLIDA!");
                    }
                    break;


                case 2:
                    System.out.println("REMOVER MOEDAS");
                    for (int i = 0; i < moedas.size(); i++) {
                        System.out.print(i + " - ");
                        moedas.get(i).info();
                    }
                    System.out.println("DIGITE O ÍNDICE DA MOEDA QUE DESEJA REMOVER: ");
                    int indice = teclado.nextInt();

                    if (indice >= 0 && indice < moedas.size()) {
                        moedas.remove(indice);
                        System.out.println("MOEDA REMOVIDA!");
                    } else {
                        System.out.println("ÍNDICE INVÁLIDO!");
                    }
                    break;


                case 3:
                    System.out.println("LISTAR MOEDAS");
                    for (Moeda m : moedas) {
                        m.info();
                    }
                    break;

                case 4:
                    System.out.println("TOTAL DE MOEDAS CONVERTIDO");
                    double soma = 0;
                    for (Moeda somar : moedas) {
                        soma += somar.converter();
                    }
                    System.out.println("Total = " + soma);
                    break;
                case 0:
                    System.out.println("SAINDO...");
                    return;

                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
                }

            }
        }
    }


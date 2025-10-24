import java.util.ArrayList;
import java.util.Scanner;

public class AplicacaoConsole {
    public static void main(String[] args) {
        Tradutor tradutor = new Tradutor();
        Scanner teclado = new Scanner(System.in);
        String entrada;
        ArrayList<String> resultados; // posicoes adivinhadas

        // loop do menu de opçoes
        int opcao = 0;
        do {
            System.out.println("\n\n*************MENU*****************");
            System.out.println("0 - sair");
            System.out.println("1 - traduzir para portugues");
            System.out.println("2 - traduzir para ingles");
            System.out.println("3 - resultados em portugues");
            System.out.println("4 - resultados em ingles");
            System.out.println("********************************");
            System.out.println("Digite a opção: ");
            try {
                opcao = Integer.parseInt(teclado.nextLine());
            } catch (NumberFormatException e) {
                opcao = -1; // forca opcao invalida
            }

            switch (opcao) {
                case 0:
                    break;
                case 1:
                    System.out.println("\ndigite uma entrada em ingles: ");
                    entrada = teclado.nextLine();
                    resultados = tradutor.toPortugues(entrada);
                    if (resultados.size() > 0) {
                        System.out.println("tradução:");
                        for (String s : resultados)
                            System.out.println(s);
                    } else
                        System.out.println("entrada nao encontrada");

                    break;
                case 2:
                    System.out.println("\ndigite uma entrada em portugues: ");
                    entrada = teclado.nextLine();
                    resultados = tradutor.toIngles(entrada);
                    if (resultados.size() > 0) {
                        System.out.println("tradução:");
                        for (String s : resultados)
                            System.out.println(s);
                    } else
                        System.out.println("entrada nao encontrada");
                    break;
                case 3:
                    resultados = tradutor.getPortugues();
                    if (resultados.size() > 0) {
                        System.out.println("listagem de palavras em portugues");
                        for (String s : resultados)
                            System.out.println(s);
                    } else
                        System.out.println("lista vazia");
                    break;
                case 4:
                    tradutor.getPortugues();
                    resultados = tradutor.getIngles();
                    if (resultados.size() > 0) {
                        System.out.println("listagem de palavras em ingles:");
                        for (String s : resultados)
                            System.out.println(s);
                    } else
                        System.out.println("lista vazia");
                    break;
                default:
                    System.out.println("opcao incorreta: ");
            }// switch
        } while (opcao != 0);

        teclado.close();
        System.out.println("fim do programa");
    }

}

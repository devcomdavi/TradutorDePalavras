import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.StringBuilder;

public class Tradutor {
    private ArrayList<String> palavrasPortugues = new ArrayList<>();
    private ArrayList<String> palavrasIngles = new ArrayList<>();
    public ArrayList<String> palavrasTraduzidas = new ArrayList<>();
    public StringBuilder strGetPortugues = new StringBuilder();
    public StringBuilder strGetIngles = new StringBuilder();
    public Scanner arquivo;

    public Tradutor() {

        try {
            this.arquivo = new Scanner(new File("src/dados/palavras.txt"));
            while (this.arquivo.hasNextLine()) {
                String linha = this.arquivo.nextLine();
                // get portugues/ingles
                strGetPortugues.append(linha.split("/")[1]).append("/");
                strGetPortugues.append(linha.split("/")[0]).append("\n");

                // get ingles/portugues
                strGetIngles.append(linha).append("\n");

                // listas de palavras em ingles e portugues
                palavrasIngles.add(linha.split("/")[0]);
                palavrasPortugues.add(linha.split("/")[1]);

            }
            this.arquivo.close();
        } catch (FileNotFoundException e) {
            System.err.println("Erro: Arquivo não encontrado!");
        }
    }

    public ArrayList<String> toPortugues(String palavraing) {
        for (int i = 0; i < palavrasIngles.size(); i++) {
            if (palavraing.toLowerCase().contains(palavrasIngles.get(i).toLowerCase())) {
                palavrasTraduzidas.add(palavrasIngles.get(i));
                return palavrasTraduzidas;
            }
        }
        return palavrasTraduzidas;
    }

    public ArrayList<String> toIngles(String palavraport) {
        for (int i = 0; i < palavrasPortugues.size(); i++) {
            if (palavraport.toLowerCase().contains(palavrasPortugues.get(i).toLowerCase())) {
                palavrasTraduzidas.add(palavrasPortugues.get(i));
                return palavrasTraduzidas;
            }
        }
        return palavrasTraduzidas;
    }

    public ArrayList<String> getPortugues() {

        return null;
    }

    public ArrayList<String> getIngles() {

        return null;
    }
}

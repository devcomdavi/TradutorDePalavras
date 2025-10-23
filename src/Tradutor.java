import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tradutor {
    private ArrayList<String> palavrasPortugues = new ArrayList<>();
    private ArrayList<String> palavrasIngles = new ArrayList<>();
    public ArrayList<String> palavrasTraduzidas = new ArrayList<>();
    public Scanner arquivo;

    public Tradutor() {

        try {
            this.arquivo = new Scanner(new File("src/dados/palavras.txt"));
            while (this.arquivo.hasNextLine()) {
                palavrasIngles.add(this.arquivo.nextLine().split("/")[0]);
                palavrasPortugues.add(this.arquivo.nextLine().split("/")[1]);
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
        for (int i = 0; i < palavrasPortugues.size(); i++) {

        }
        return null;
    }

    public ArrayList<String> getIngles() {

        return null;
    }
}

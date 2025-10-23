import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tradutor {
    private ArrayList<String> palavrasPortugues = new ArrayList<>();
    private ArrayList<String> palavrasIngles = new ArrayList<>();
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

        return null;
    }

    public ArrayList<String> toIngles(String palavraport) {

        return null;
    }

    public ArrayList<String> getPortugues() {

        return null;
    }

    public ArrayList<String> getIngles() {

        return null;
    }
}

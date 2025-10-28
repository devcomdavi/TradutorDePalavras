import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tradutor {
    private ArrayList<String> palavrasPortugues = new ArrayList<>();
    private ArrayList<String> palavrasIngles = new ArrayList<>();
    public ArrayList<String> palavrasIngTraduzidas = new ArrayList<>();
    public ArrayList<String> palavrasPortTraduzidas = new ArrayList<>();
    public ArrayList<String> listaGetPortugues = new ArrayList<>();
    public ArrayList<String> listaGetIngles = new ArrayList<>();
    public Scanner arquivo;

    public Tradutor() {

        try {
            this.arquivo = new Scanner(new File("src/dados/palavras.txt"));
            while (this.arquivo.hasNextLine()) {
                String linha = this.arquivo.nextLine();

                // get portugues/ingles
                String linhaFormatada = String.format("%s/%s", linha.split("/")[1], linha.split("/")[0]);
                listaGetPortugues.add(linhaFormatada);

                // get ingles/portugues
                listaGetIngles.add(linha);

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
        if (!palavrasIngTraduzidas.isEmpty()) {
            palavrasIngTraduzidas.clear();
        }
        for (int i = 0; i < palavrasIngles.size(); i++) {
            if (palavrasIngles.get(i).toUpperCase().contains(palavraing.toUpperCase())) {
                palavrasIngTraduzidas.add(palavrasPortugues.get(i));
            }
        }
        return palavrasIngTraduzidas;
    }

    public ArrayList<String> toIngles(String palavraport) {
        if (!palavrasPortTraduzidas.isEmpty()) {
            palavrasPortTraduzidas.clear();
        }
        for (int i = 0; i < palavrasPortugues.size(); i++) {
            if (palavrasPortugues.get(i).toUpperCase().contains(palavraport.toUpperCase())) {
                palavrasPortTraduzidas.add(palavrasIngles.get(i));
            }
        }
        return palavrasPortTraduzidas;
    }

    public ArrayList<String> getPortugues() {
        return listaGetPortugues;
    }

    public ArrayList<String> getIngles() {
        return listaGetIngles;
    }
}

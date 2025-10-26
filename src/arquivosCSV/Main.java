package arquivosCSV;

public class Main {

    public  static void main(String[] args) {
        filme f1 = new filme("O Rei Leão", 10, true);

        // Adicionar filme ao arquivo
        FilmeCSV.AdicionarFilme(f1);

        // Ler filmes do arquivo
        FilmeCSV.ListarFilme();

    }
}

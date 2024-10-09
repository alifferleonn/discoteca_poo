package ArrayList;

public class Faixa {
    private String titulo;
    private String artista;
    private int duracao;

    // Construtor
    public Faixa(String titulo, String artista, int duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracao() {
        return duracao;
    }

    public String print() {
        return "T�tulo: " + titulo + ", Artista: " + artista + ", Dura��o: " + duracao + "s";
    }

    public void reproduzir() {
        System.out.println("Reproduzindo: " + titulo + " por " + artista + " (" + duracao + "s)");
    }
}

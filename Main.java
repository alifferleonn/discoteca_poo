
import ArrayList.Faixa;
import ArrayList.OrganizadorDeMusicas;

public class Main {
    public static void main(String[] args) {
        // Criando um organizador de m�sicas
        OrganizadorDeMusicas organizador = new OrganizadorDeMusicas();

        // Adicionando faixas ao organizador
        organizador.adicionarFaixa("Fear of the Dark", "Iron Maiden", 442);
        organizador.adicionarFaixa("Bohemian Rhapsody", "Queen", 354);

        // Criando uma faixa diretamente e adicionando ao organizador
        Faixa faixaExtra = new Faixa("Hotel California", "Eagles", 391);
        organizador.adicionarFaixa(faixaExtra);

        // Listar todas as faixas
        System.out.println("Lista de Faixas:");
        organizador.listarTodasAsFaixas();

        // Reproduzir uma faixa pelo �ndice
        System.out.println("\nReproduzindo a faixa 1:");
        organizador.reproduzirFaixa(1);  // Deve reproduzir "Bohemian Rhapsody"

        // Remover uma faixa
        System.out.println("\nRemovendo a faixa 0:");
        organizador.removerFaixa(0);  // Remove "Fear of the Dark"

        // Listar as faixas novamente ap�s remo��o
        System.out.println("\nLista de Faixas ap�s remo��o:");
        organizador.listarTodasAsFaixas();
    }
}

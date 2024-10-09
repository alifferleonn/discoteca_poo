package ArrayList;

import java.util.ArrayList;

public class OrganizadorDeMusicas {
    private ArrayList<Faixa> faixas;

    public OrganizadorDeMusicas() {
        faixas = new ArrayList<>();
    }

    public void adicionarFaixa(String titulo, String artista, int duracao) {
        Faixa novaFaixa = new Faixa(titulo, artista, duracao);
        faixas.add(novaFaixa);
    }

    public void adicionarFaixa(Faixa faixa) {
        faixas.add(faixa);
    }

    public void listarTodasAsFaixas() {
        if (faixas.isEmpty()) {
            System.out.println("Nenhuma faixa disponível.");
        } else {
            for (int i = 0; i < faixas.size(); i++) {
                System.out.println(i + ": " + faixas.get(i).print());
            }
        }
    }

    public void reproduzirFaixa(int indice) {
        if (indice >= 0 && indice < faixas.size()) {
            faixas.get(indice).reproduzir();
        } else {
            System.out.println("Índice inválido. Não há faixa correspondente.");
        }
    }
    
    public void removerFaixa(int indice) {
        if (indice >= 0 && indice < faixas.size()) {
            faixas.remove(indice);
            System.out.println("Faixa removida com sucesso.");
        } else {
            System.out.println("Índice inválido. Não foi possível remover a faixa.");
        }
    }
}

# Sistema de Organização de Músicas

Este projeto em Java implementa um sistema simples para gerenciar músicas, permitindo adicionar faixas, listar todas as faixas, reproduzir e remover faixas de uma lista.

## Estruturas Principais

### 1. Classe `Faixa`
A classe `Faixa` representa uma música e contém informações básicas como título, artista e duração da faixa em segundos.

#### Atributos:
- **`titulo`**: Nome da música.
- **`artista`**: Nome do artista.
- **`duracao`**: Duração da música em segundos.

#### Métodos:
- **`getTitulo()`**: Retorna o título da música.
- **`getArtista()`**: Retorna o nome do artista.
- **`getDuracao()`**: Retorna a duração da música.
- **`print()`**: Retorna uma string com as informações da faixa.
- **`reproduzir()`**: Exibe uma mensagem indicando que a música está sendo reproduzida.

### 2. Classe `OrganizadorDeMusicas`
A classe `OrganizadorDeMusicas` é responsável por gerenciar uma lista de músicas (`Faixa`).

#### Atributos:
- **`faixas`**: Lista de faixas de música armazenada em um `ArrayList`.

#### Métodos:
- **`adicionarFaixa(String titulo, String artista, int duracao)`**: Adiciona uma nova faixa com os detalhes fornecidos.
- **`adicionarFaixa(Faixa faixa)`**: Adiciona uma faixa já criada.
- **`listarTodasAsFaixas()`**: Exibe todas as faixas armazenadas.
- **`reproduzirFaixa(int indice)`**: Reproduz a faixa no índice fornecido.
- **`removerFaixa(int indice)`**: Remove a faixa no índice fornecido.

### 3. Classe `Main`
A classe `Main` demonstra o uso do sistema de organização de músicas.

#### Principais Ações:
- Adiciona músicas ao organizador.
- Lista todas as músicas.
- Reproduz uma faixa específica.
- Remove uma faixa da lista.
- Lista novamente as músicas após a remoção.

## Exemplo de Uso
1. Adiciona três músicas: "Fear of the Dark", "Bohemian Rhapsody" e "Hotel California".
2. Lista todas as faixas.
3. Reproduz a segunda faixa.
4. Remove a primeira faixa.
5. Lista novamente as faixas após a remoção.

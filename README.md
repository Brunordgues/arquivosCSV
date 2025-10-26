# 🎬 Manipulação de Arquivos CSV em Java

Este projeto foi desenvolvido com o objetivo de aprender na prática como funciona a leitura e escrita de arquivos CSV utilizando Java. A ideia é transformar o conhecimento teórico em algo funcional, organizado e reutilizável.

## Estrutura do Projeto

- src/
- ├── filme.java        // Classe de modelo para representar um filme
- ├── FilmeCSV.java     // Classe que gerencia a leitura e escrita no arquivo CSV
- └── Main.java         // Classe principal com exemplo de uso do sistema
- dados/
- └── Filmes.csv        // Arquivo gerado automaticamente pelo sistema


## Requisitos
- Java 8 ou superior

- Pasta dados na raiz do projeto (o arquivo Filmes.csv será criado automaticamente dentro dela)

## 📌 Descrição das Classes

- filme
  - Representa os dados de um filme, com os atributos:

    - nome (String)

    - nota (double)

    - assistido (boolean)

- FilmeCSV
  -  Responsável por manipular o arquivo Filmes.csv.
       - Funções principais:
         - AdicionarFilme(filme f): Grava um novo filme no arquivo CSV.
         -ListarFilme(): Lê todos os filmes salvos e retorna uma lista de objetos filme.

- Main
  - Classe com exemplo de execução, mostrando como adicionar e listar filmes.

## ⚙️ Como Funciona

```bash
filme f1 = new filme("O Rei Leão", 10, true);
FilmeCSV.AdicionarFilme(f1);
````
- O sistema ignora o cabeçalho e converte cada linha do CSV em um objeto filme, exibindo as informações no terminal.

- Também pode retornar uma lista de filmes, permitindo outras manipulações.

## 📂 Formato do Arquivo CSV Gerado
```bash
Nome;Nota;Assistido
O Rei Leão;10.0;true
````

- Cada filme é salvo em uma nova linha

- Os dados são separados por ponto e vírgula (;)

- Local padrão do arquivo: ./dados/Filmes.csv


## 💡 Observações Importantes

- Caso a pasta dados não exista, crie-a manualmente na raiz do projeto

- O arquivo é criado automaticamente na primeira gravação

- O método de leitura já desconsidera o cabeçalho para evitar erros


## 📚 Referência e Aprendizado

- Este projeto foi inspirado em conteúdos educacionais, como os vídeos do prof. Lucas Fraga, que explicam de forma clara o uso de arquivos CSV em Java.
- LINK: https://www.youtube.com/watch?v=OClKwp-NgVE


# 👨‍💻 Autor
- Bruno Rodrigues
- Formado em Análise e Desenvolvimento de Sistemas
- Estudando e praticando Java aplicado à manipulação de dados (CSV, arquivos, automação etc.)
- Este projeto faz parte do meu processo de aprendizado, evolução prática e construção de portfólio.

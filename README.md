# Imersão Java - AULA 01 - consumindo uma API de filmes com Java
Este projeto é parte das atividades da semana de Imersão em Java, oferecida gratuitamente pela Alura entre os dias 18/07/2022 até 22/07/2022.

## Estrutura do projeto
O projeto foi criado com base na versão básica criada automaticamente pelo VS Code, que contém por padrão dois pacotes, que são:

- `src`: a pasta que contém o código fonte.
- `lib`: a parta que contém as dependências.

## Materiais de apoio
Não estarei colocando os vídeos diretamente da semana da Imersão Java já que creio que eles serão tirados do ar em breve. Contudo, alguns links e materiais extras foram consultados durante o acompanhamento desta aula.

### Lista com o top 250 filmes do IMDB, criada pela instrutora Jacqueline Oliveira
* Link: https://alura-filmes.herokuapp.com/conteudos

### I can't set up JDK on Visual Studio Code
* Link: https://stackoverflow.com/questions/52539414/i-cant-set-up-jdk-on-visual-studio-code

### Class HttpRequest
* Link: https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpRequest.html

### Classe pronta que utiliza Expressões Regulares para fazer parse de um JSON.
* Link: https://gist.github.com/alexandreaquiles/cf337d3bcb59dd790ed2b08a0a4db7a3

### Regex101: ferramenta para acompanhar e ilustrar o funcionamento do regex.
* Link: https://regex101.com/

## Desafios da aula:
* 1. Consumir o endpoint de filmes mais populares da API do IMDB. Procure também, na documentação da API do IMDB, o endpoint que retorna as melhores séries e o que retorna as séries mais populares.

* 2. Usar sua criatividade para deixar a saída dos dados mais bonitinha: usar emojis com código UTF-8, mostrar a nota do filme como estrelinhas, decorar o terminal com cores, negrito e itálico usando códigos ANSI, e mais!

* 3. Colocar a chave da API do IMDB em algum lugar fora do código como um arquivo de configuração (p. ex, um arquivo .properties) ou uma variável de ambiente

* 4. Mudar o JsonParser para usar uma biblioteca de parsing de JSON como Jackson ou GSON

* 5. Desafio supremo: criar alguma maneira para você dar uma avaliação ao filme, puxando de algum arquivo de configuração OU pedindo a avaliação para o usuário digitar no terminal.
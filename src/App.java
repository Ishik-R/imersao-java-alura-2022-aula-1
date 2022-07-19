import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        // Realizar a conexão HTTP e reconhecer o arquivo JSON, buscando o top 250 filmes.
        String url = "https://alura-filmes.herokuapp.com/conteudos";
        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();
        //System.out.println(body);

        // Extrair os dados pertinentes: título, poster e a avaliação.
        var parser = new JsonParser(); 
        List<Map<String, String>> listaDeFilmes = parser.parse(body);
        System.out.println(listaDeFilmes.size());

        // Exibir e manipular os dados extraídos.
    }
}

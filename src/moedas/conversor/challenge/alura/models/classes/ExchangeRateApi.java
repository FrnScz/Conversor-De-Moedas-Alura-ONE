package moedas.conversor.challenge.alura.models.classes;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import moedas.conversor.challenge.alura.models.record.ConversaoDeMoedas;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * A classe ExchangeRateApi é responsável por consultar a API de taxas de câmbio e converter o
 * JSON de resposta em um objeto de moeda utilizável para o conversor.
 * <b>O nome da variável de ambiente pode ficar a sua escolha, eu decidi deixar como EXCHANGE_RATE_API_KEY apenas para facilitar a leitura de código</b>
 */

public class ExchangeRateApi {
    // Chave de acesso da API, obtida nas variáveis de ambiente do sistema operacional
    private final String API_KEY = System.getenv("EXCHANGE_RATE_API_KEY");
    
    
    /**
     * Metodo que consulta a API de taxas de câmbio usando um código de moeda base.
     *
     * @param codMoedaBase Código da moeda base para a qual obter as taxas de câmbio (ex.: "USD").
     * @return Um objeto Moeda com as taxas de câmbio ou null em caso de erro.
     */
    
    public Moeda consultarAPI (String codMoedaBase) {
        // Formata a URI da API usando a chave da API e o código da moeda base
        String apiUri = String.format("https://v6.exchangerate-api.com/v6/%s/latest/%s", API_KEY, codMoedaBase);
        
        // Cria uma instância da biblioteca do google GSON para manipular a resposta JSON, com formatação legível
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        try {
            // Configura o cliente Http e a solicitação para a URI gerada, com metodo GET()
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(apiUri)).GET().build();
            
            // Envia a solicitação e recebe a resposta no formato de String Json
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            
            // Converte a resposta JSON para um objeto record ConversaoDeMoedas usando a variável gson, utilizando o metodo fromJson da biblioteca GSON
            ConversaoDeMoedas moedaResponse = gson.fromJson(json, ConversaoDeMoedas.class);
            
            // Retorna uma nova instância da classe Moeda com base na resposta da API
            return new Moeda(moedaResponse);
            
        }
        // Captura o erro de código de moeda nulo ou inválido
        catch (NullPointerException e) {
            System.out.println("Ocorreu um erro ao encontrar a moeda." + codMoedaBase + "MOTIVO: A moeda precisa ter um código de 3 caracteres (ex: 'BRL' \n");
            return null;
        }
        // Captura erros de estado ilegal ao processar a resposta
        catch (IllegalStateException e) {
            System.out.println("Ocorreu um erro na aplicação!");
            return null;
        }
        // Captura outras exceções e exibe a mensagem de erro geral
        catch (Exception e) {
            System.out.println("Ocorreu um erro na execução!");
            return null;
        }
    }
}

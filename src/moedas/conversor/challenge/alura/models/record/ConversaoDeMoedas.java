package moedas.conversor.challenge.alura.models.record;


import java.util.Map;

/**
 * Record ConversaoDeMoedas representa a estrutura dos dados recebidos da API de conversão de moedas.
 *
 * @param base_code        Código da moeda base (ex.: "USD", "BRL").</br>
 * @param result           Status da resposta da API (ex.: "success", "error"). </br>
 * @param conversion_rates Mapa contendo as taxas de conversão para várias moedas, onde cada chave é um código de moeda e o valor é a taxa de câmbio.
 */


public record ConversaoDeMoedas(String base_code, String result, Map<String, Double> conversion_rates) {
}

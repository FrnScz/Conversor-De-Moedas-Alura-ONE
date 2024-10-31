package moedas.conversor.challenge.alura.models.classes;

import moedas.conversor.challenge.alura.models.record.ConversaoDeMoedas;

import java.util.HashMap;
import java.util.Map;

/**
 * A classe Moeda representa uma moeda com código (ex.: "USD", "BRL"), quantidade,
 * e um conjunto de taxas de câmbio para outras moedas.
 * Ela recebe um objeto ConversaoDeMoedas contendo as taxas de câmbio.
 */

public class Moeda {
    // Codigo da moeda (ex: "USD" para Dolar, "BRL" para Real)
    private final String codigo;
    
    // Mapa que armazena as taxas de conversão desta moeda para outras moedas
    private final Map<String, Double> taxas;
    
    // Quantidade da moeda (inicialmente 1)
    private double quantidade;
    
    // Métodos get para retornar o valor dos atributos
    public String getCodigo () {
        return codigo;
    }
    
    public double getQuantidade () {
        return quantidade;
    }
    
    public Map<String, Double> getTaxas () {
        return taxas;
    }
    
    /**
     * Construtor que inicializa a moeda com o código e as taxas de conversão.
     *
     * @param conversao Objeto ConversaoDeMoedas contendo os dados da moeda base e as taxas de conversão.
     */
    
    public Moeda (ConversaoDeMoedas conversao) {
        // Inicializa a quantidade padrão para 1 unidade
        this.quantidade = 1;
        // Define o código da moeda base com base na resposta da API
        this.codigo = conversao.base_code();
        // Inicializa o mapa de taxas de conversão
        this.taxas = new HashMap<>();
        
        // Clona as taxas de conversão da API para o mapa local 'taxas'
        Map<String, Double> valor = new HashMap<>(conversao.conversion_rates());
        for (String cotacao : valor.keySet()) {
            this.taxas.put(cotacao, valor.get(cotacao));
        }
    }
    
    // Define a quantidade da moeda a ser convertida
    public void setQuantidade (double quantidade) {
        this.quantidade = quantidade;
    }
    
    /**
     * Metodo para formatar a moeda em uma string legível.
     *
     * @return String formatada com a quantidade e o código da moeda.
     */
    
    @Override
    public String toString () {
        return String.format("%s (%s)", this.quantidade , this.codigo );
    }
}

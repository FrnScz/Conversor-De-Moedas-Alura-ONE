package moedas.conversor.challenge.alura.models.classes;

import java.util.Scanner;

/**
 * A classe ServicoConversao é responsável pela lógica de conversão de moedas.
 * Utiliza a ExchangeRateAPI que é uma API de taxa de câmbio para obter informações de conversão e permite
 * ao usuário inserir um valor a ser convertido entre duas moedas especificadas.
 */

public class ServicoConversao {
    // Scanner para inserção de dados do usuário pelo teclado
    private final Scanner scanner = new Scanner(System.in);
    
    // Objeto responsável por interagir com a API de taxas de câmbio
    private final ExchangeRateApi consultarApi = new ExchangeRateApi();
    
    // Objeto moeda para armazenar a moeda base da conversão
    private Moeda moedaBase;
    
    // String para armazenar o código da moeda de destino
    private String moedaDestino;
    
    /**
     * Define a moeda base para conversão.
     *
     * @param moedaBase objeto Moeda representando a moeda base.
     */
    public void setMoedaBase (Moeda moedaBase) {
        this.moedaBase = moedaBase;
    }
    
    /**
     * Realiza a conversão entre a moeda base e a moeda de destino e exibe o resultado.
     * O cálculo é feito com base na taxa de câmbio fornecida pela API.
     */
    
    public void converter () {
        // Realiza a conversão usando a taxa de câmbio da moeda de destino multiplicada pela quantidade definida
        double resultado = this.moedaBase.getTaxas().get(this.moedaDestino) * this.moedaBase.getQuantidade();
        
        // Exibe o resultado da conversão formatado para duas casas decimais
        System.out.printf("%s %s convertido para %s é de: %.2f \n", this.moedaBase.getQuantidade(), this.moedaBase.getCodigo(), this.moedaDestino, resultado);
    }
    
    /**
     * Obtém as informações da moeda base e da moeda de destino para realizar a conversão.
     * Define a moeda base através da API e solicita ao usuário um valor para converter.
     *
     * @param codMoedaBase   código da moeda base (por exemplo, "USD").
     * @param codMoedaDestino código da moeda destino (por exemplo, "BRL").
     */
    public void consulta (String codMoedaBase, String codMoedaDestino) {
        // Define a moeda base ao consultar a API
        this.setMoedaBase(consultarApi.consultarAPI(codMoedaBase));
        
        // Define a moeda de destino
        this.moedaDestino = codMoedaDestino;
        
        // Verifica se a moeda base foi obtida com sucesso da API
        if (this.moedaBase != null) {
            // Solicita ao usuário um valor a ser convertido da moeda base para a moeda de destino
            System.out.println("Digite o valor para converter de: " + codMoedaBase + " para: " + codMoedaDestino + ": ");
            
            // Captura o valor do usuário e define na moeda base
            double valor = this.scanner.nextDouble();
            this.scanner.nextLine();
            this.moedaBase.setQuantidade(valor);
            
            // Exibe o valor definido da moeda base no console
            System.out.println("Valor definido: " + this.moedaBase + "\n");
        }
        else {
            // Caso a API retorne nulo, informa o que o processo será encerrado
            System.out.println("Execução encerrada. Voltando ao menu principal...");
        }
    }
}

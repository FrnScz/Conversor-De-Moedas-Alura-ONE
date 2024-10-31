
package moedas.conversor.challenge.alura.main;

import moedas.conversor.challenge.alura.models.classes.MenuConversor;
import moedas.conversor.challenge.alura.models.classes.ServicoConversao;

/**
 * Este projeto é um desafio do programa Oracle Next Education, que visa desenvolver um conversor de moedas utilizando Java.
 * O objetivo é criar uma aplicação simples que permita aos usuários converter valores entre diferentes moedas,
 * utilizando a ExchangeRateAPI para obter as taxas de câmbio mais recentes. </br>
 * <b>Desenvolvido por: Fernando Scorza.</b>
 */

public class Main {
    
    /**
     * O metodo main é o ponto de entrada do programa.</br>
     * Uma instância das classes MenuConversor e ServicoConversao são criadas.
     * Para começar a conversão uma variável booleana foi criada para iniciar o processo de conversão de moedas. </br>
     * Toda a estrutura, design e lógica foi mantida dentro das outras classes, para que o metodo main esteja bem organizado, fácil de ler e entender!
     */
     
    public static void main (String[] args) {
        System.out.println("Boas vindas ao conversor de moedas!");
        MenuConversor menu = new MenuConversor();
        ServicoConversao conversao = new ServicoConversao();
        boolean executar = true;
        
        
        while (executar) {
            executar = menu.executarMenu();
        }
    }
}

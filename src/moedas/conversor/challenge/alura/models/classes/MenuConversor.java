package moedas.conversor.challenge.alura.models.classes;

import java.util.Scanner;

/**
 * A classe MenuConversor representa o menu de opções para o usuário.
 * Permite a escolha das moedas base e de destino para conversão.
 * Utiliza a classe ServicoConversao para realizar as operações de conversão.
 */


public class MenuConversor {
    // Instância do servico de conversão, responsável pela lógica de conversão
    private final ServicoConversao conversor = new ServicoConversao();
    
    // Scanner para capturar a opção de menu do usuário
    private final Scanner menuLeitor = new Scanner(System.in);
    
    // Strings para armazenar os códigos das moedas base e destino
    private String codMoedaBase = "";
    private String codMoedaDestino = "";
    
    
    /**
     * Construtor da classe MenuConversor.
     * Inicializa um novo menu para o conversor de moedas.
     */
    
    public MenuConversor () {
    
    }
    
    
    /**
     * Exibe o menu de opções e executa a conversão de moedas baseada na escolha do usuário.
     * As opções permitem escolher as moedas base e de destino. O método consulta e converte
     * o valor entre as moedas escolhidas e exibe o resultado ao usuário.
     *
     * @return True se o menu deve continuar executando. False se o usuário escolher a opção "Sair".
     */
    
    public boolean executarMenu() {
        // Exibe o menu de opções
        System.out.println("""
            *******************************************
            1 - USD => ARS
            2 - ARS => USD
            3 - USD => BRL
            4 - BRL => USD
            5 - USD => COP
            6 - COP => USD
            7 - Sair
            Digite a opção desejada...
            *******************************************
            """);
        
        // Captura a opção do usuário
        var opcao  = 0;
        opcao = menuLeitor.nextInt();
        
        // Processa a opção escolhida pelo usuário, definindo as moedas de base e destino
        switch (opcao) {
            case 1 -> {
                codMoedaBase = "USD";
                codMoedaDestino = "ARS";
                System.out.println("Você escolheu a opção 1 - USD => ARS");
            }
            case 2 -> {
                codMoedaBase = "ARS";
                codMoedaDestino = "USD";
                System.out.println("Você escolheu a opção 2 - ARS => USD");
            }
            case 3 -> {
                codMoedaBase = "USD";
                codMoedaDestino = "BRL";
                System.out.println("Você escolheu a opção 3 - USD => BRL");
            }
            case 4 -> {
                codMoedaBase = "BRL";
                codMoedaDestino = "USD";
                System.out.println("Você escolheu a opção 4 - BRL => USD");
            }
            case 5 -> {
                codMoedaBase = "USD";
                codMoedaDestino = "COP";
                System.out.println("Você escolheu a opção 5 - USD => COP");
            }
            case 6 -> {
                codMoedaBase = "COP";
                codMoedaDestino = "USD";
                System.out.println("Você escolheu a opção 6 - COP => USD");
            }
            case 7 -> {
                // Encerra o programa ao escolher a opção 7
                System.out.println("Programa encerrado!");
                return false;
            }
            default -> {
                // Informa ao usuário que a opção é invalida e reinicia o menu
                System.out.println("Digite uma opção válida");
                return true;
            }
        }
        
        // Executa a consulta e conversão usando a API e exibe o resultado da conversão
        try {
            conversor.consulta(codMoedaBase, codMoedaDestino);
            conversor.converter();
        }
        catch (Exception e) {
            // Tratamento de erro genérico para exceções ocorridas durante a conversão
            System.out.println("Erro ao realizar a conversão: " + e.getMessage());
        }
        
        return true; // Continua o loop do menu
    }
}

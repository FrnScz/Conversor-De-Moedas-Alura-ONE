<img src="https://caelum-online-public.s3.amazonaws.com/oracle-one-fase2/one-br-kit-boas-vindas/ONE+desktop+2.png" alt="Logo do Projeto" width="100%" height="450">

# 💰  Conversor de Moedas
## Olá, seja bem vindo ao meu projeto do Challenge Conversor De Moedas da formação Java e Orientação a Objetos!

### Este projeto é um **desafio do programa Oracle Next Education** que visa desenvolver um **conversor de moedas** utilizando **Java**. O objetivo é criar uma aplicação simples que permita aos usuários **converter valores entre diferentes moedas**, utilizando a **ExchangeRateAPI** para obter as taxas de câmbio mais recentes.

---

## 📜 Resumo do Projeto

### O **Conversor de Moedas** é uma aplicação que permite ao usuário escolher duas moedas e inserir um valor a ser convertido. Utilizando a **ExchangeRateAPI**, o programa busca as taxas de câmbio e realiza a conversão. O projeto é dividido em várias classes que gerenciam a lógica da conversão, a interação com o usuário e a comunicação com a API.

### Principais Funcionalidades:

- **Escolha de Moedas**: O usuário pode escolher entre várias opções de moedas para conversão. 💱
- **Conversão em Tempo Real**: As taxas de câmbio são obtidas diretamente da **ExchangeRateAPI**, garantindo informações atualizadas. 📈
- **Interface Simples**: A aplicação possui um menu interativo que torna a experiência do usuário simples e intuitiva. 📊
- **Tratamento de Erros**: O programa inclui tratamento de exceções para garantir que os erros sejam manejados adequadamente. ❌
---
## 🚀 Como Funciona

1. **Inicialização**: Ao iniciar o programa, o usuário é recebido com uma mensagem de boas-vindas.
2. **Menu de Opções**: O usuário é apresentado a um menu onde pode escolher a conversão desejada entre diferentes pares de moedas.
3. **Entrada de Dados**: Após selecionar as moedas, o usuário insere o valor que deseja converter.
4. **Consulta à API**: O programa consulta a **ExchangeRateAPI** para obter as taxas de câmbio atuais.
5. **Cálculo da Conversão**: Com as informações obtidas, o programa calcula o valor convertido e apresenta o resultado ao usuário.
6. **Repetição ou Saída**: O usuário pode escolher realizar uma nova conversão ou sair do programa.
---
## 📋 Exemplo de Execução:
**Escolha uma opção para a conversão:**

1 - USD => ARS

2 - ARS => USD

3 - USD => BRL

4 - BRL => USD

5 - USD => COP

6 - COP => USD

7 - Sair

Digite a opção que deseja executar...

**Se o usuário escolher a opção 1 e digitar o valor 100, o programa fará a conversão de 100 dólares para pesos argentinos usando a taxa de câmbio mais recente e exibirá o resultado.**

---
## ⚙️ Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para desenvolver a aplicação.
- **Gson**: Biblioteca utilizada para manipulação de JSON.
- **API ExchangeRateAPI**: API utilizada para obter as taxas de câmbio.
---

## 🚀 Como Executar o Projeto no IntelliJ

### Passo 1: Abrir o Projeto

1. Abra o **IntelliJ IDEA**.
2. Clique em **File** > **Open...**.
3. Navegue até o diretório do projeto e selecione a pasta `ConversorDeMoedas`.

### Passo 2: Configurar a Variável de Ambiente

1. No menu superior, clique em **Run** > **Edit Configurations...**.
2. Clique no ícone de **+** no canto superior esquerdo e selecione **Application**.
3. Em **Environment Variables**, adicione a variável `EXCHANGE_RATE_API_KEY` com sua chave de API da **ExchangeRateAPI (Ou o nome que preferir)**.

### Passo 3: Compilar e Executar o Projeto

1. No painel do projeto, navegue até o arquivo `Main.java` em `src/moedas/conversor/challenge/alura/main/`.
2. Clique com o botão direito do mouse no arquivo `Main.java`.
3. Selecione **Run 'Main.main()'** para compilar e executar o projeto.

### Passo 4: Interagir com o Programa

Após a execução, siga as instruções exibidas no console para usar o conversor de moedas.

### Observações

- Certifique-se de que o JDK está corretamente configurado no IntelliJ para evitar problemas de compilação.
---
### Projeto desenvolvido por: © Fernando Scorza 
### 10/2024

---
<img src="https://caelum-online-public.s3.amazonaws.com/oracle-one-fase2/one-br-kit-boas-vindas/ONE+desktop+2.png" alt="Logo do Projeto" width="100%" height="450">

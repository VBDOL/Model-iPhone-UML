public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando o Reprodutor Musical
        meuIphone.tocar();
        meuIphone.selecionarMusica("Imagine - John Lennon");

        // Testando o Aparelho Telefônico
        meuIphone.ligar("123456789");
        meuIphone.atender();

        // Testando o Navegador na Internet
        meuIphone.exibirPagina("https://www.dio.me");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}

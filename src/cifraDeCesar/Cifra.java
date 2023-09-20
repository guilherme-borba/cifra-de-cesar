package cifraDeCesar;

abstract class Cifra {

    // Método para cifrar a mensagem
    abstract String cifrar(String mensagem, int deslocamento);

    // Método para decifrar a mensagem
    abstract String decifrar(String mensagem, int deslocamento);

    // Método para quebrar o código usando uma palavra conhecida
    abstract String quebrarCodigo(String mensagemCifrada, String palavraConhecida);
}

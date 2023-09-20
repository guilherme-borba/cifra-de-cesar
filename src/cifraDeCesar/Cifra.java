package cifraDeCesar;

abstract class Cifra {

    // M�todo para cifrar a mensagem
    abstract String cifrar(String mensagem, int deslocamento);

    // M�todo para decifrar a mensagem
    abstract String decifrar(String mensagem, int deslocamento);

    // M�todo para quebrar o c�digo usando uma palavra conhecida
    abstract String quebrarCodigo(String mensagemCifrada, String palavraConhecida);
}

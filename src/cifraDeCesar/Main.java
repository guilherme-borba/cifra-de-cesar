package cifraDeCesar;

public class Main {
    public static void main(String[] args) {
        String mensagemOriginal = "Olá, Mundo!";
        int deslocamento = 3;
        String palavraConhecida = "Mundo";

        CifraDeCesar cifra = new CifraDeCesar();

        // Cifrar a mensagem original
        String mensagemCifrada = cifra.cifrar(mensagemOriginal, deslocamento);
        System.out.println("Mensagem Encriptada: " + mensagemCifrada);

        // Decifrar a mensagem
        String mensagemDecifrada = cifra.decifrar(mensagemCifrada, deslocamento);
        System.out.println("Mensagem Decriptada: " + mensagemDecifrada);

        // Quebrar o código com a palavra conhecida
        String mensagemQuebrada = cifra.quebrarCodigo(mensagemCifrada, palavraConhecida);
        System.out.println("Mensagem Original Decifrada: " + mensagemQuebrada);
    }
}

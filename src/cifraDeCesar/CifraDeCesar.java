package cifraDeCesar;

class CifraDeCesar extends Cifra {

    @Override
    String cifrar(String mensagem, int deslocamento) {
        StringBuilder mensagemCifrada = new StringBuilder();

        for (char caractere : mensagem.toCharArray()) {
            if (Character.isLetter(caractere)) {
                char base = Character.isLowerCase(caractere) ? 'a' : 'A';
                char cifrado = (char) ((caractere - base + deslocamento) % 26 + base);
                mensagemCifrada.append(cifrado);
            } else {
                mensagemCifrada.append(caractere);
            }
        }

        return mensagemCifrada.toString();
    }

    @Override
    String decifrar(String mensagemCifrada, int deslocamento) {
        return cifrar(mensagemCifrada, 26 - deslocamento); // Decifra��o � o oposto da cifra��o com deslocamento invertido
    }

    @Override
    String quebrarCodigo(String mensagemCifrada, String palavraConhecida) {
        for (int deslocamento = 0; deslocamento < 26; deslocamento++) {
            String mensagemDecifrada = decifrar(mensagemCifrada, deslocamento);
            if (mensagemDecifrada.contains(palavraConhecida)) {
                return mensagemDecifrada;
            }
        }
        return "N�o foi poss�vel quebrar o c�digo com a palavra conhecida.";
    }
}

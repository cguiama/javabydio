package br.com.dio;

public class Mensagem {
    public static void obterMensagem(int hora) {

        for (int i = 0; i < 24; i++) {
            if (hora <= 11) {
                mensagemBomDia();
                break;
            } else if (hora <= 18) {
                mensagemBoaTarde();
                break;
            } else if (hora < 24) {
                mensagemBoaNoite();
                break;
            } else {
                System.out.println("Hora Inválida!");
                break;
            }
        }
    }

    public static void mensagemBomDia() {
        System.out.println("Bom dia!");
    }

    public static void mensagemBoaTarde() {
        System.out.println("Boa tarde!");
    }

    public static void mensagemBoaNoite() {
        System.out.println("Boa noite!");
    }
}

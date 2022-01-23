package br.com.dio;

public class Emprestimo {
    public static double getTaxa() {
        return 0.02;
    }

    public static void calcular(double valor, int parcelas) {
        double valorFinal;
        valorFinal = valor * Math.pow(1 + getTaxa(), parcelas);
        System.out.println("\n O valor final do empréstimo para " + parcelas + " parcelas será: R$ " + Math.round(valorFinal));
    }

}

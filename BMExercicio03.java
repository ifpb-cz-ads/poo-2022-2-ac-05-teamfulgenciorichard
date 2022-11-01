public class BMExercicio03 {
    /* Inseridos para não ficar com nenhum erro e para não ter que reescrever
     todo o código também, favor ignorar */

    double saldo;
    String nomeDoCorrentista;
    boolean contaÉEspecial;

    /* Problema em questão resolvido */

    void mostrarDados() {
        System.out.println("O nome do correntista é" + nomeDoCorrentista);
        System.out.println("O saldo é " + saldo);

        if(contaÉEspecial){
            System.out.println("A conta é especial.");
            System.out.println("ALERTA: O saldo está negativo");
        }
        else
            System.out.println("A conta é comum.");
    }
}

public class BMExercicio06 {
    /* Inseridos para não ficar com nenhum erro e para não ter que reescrever
     todo o código também, favor ignorar */
     
    double saldo;
    String nomeDoCorrentista;
    boolean contaÉEspecial;

    /* Problema em questão resolvido */

    void abreContaSimples(String nome, double valorDoCliente){
        if(valorDoCliente < 100){
            System.out.println("O cliente não poderá abrir uma conta com valor inferior a R$100,00");
        }
        else{
            nomeDoCorrentista = nome;
            saldo = valorDoCliente; //default
            contaÉEspecial = false;
        }
    }
}

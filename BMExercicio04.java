public class BMExercicio04 {
    class Lampada{
    
        float valor;
        boolean compra;
    
        float verValor(){
            return valor;
        }
        
        String comprar(){
            String retorno;
            if(compra){
                retorno = "foi comprada.";
            }
            else{
                retorno = "não foi comprada.";
            }
            return retorno;
        }
    
        void lampadaAVenda(){
            System.out.println("O valor da lâmpada é " + verValor());
            System.out.println("A lâmpada " + comprar());
        }
    } 
}
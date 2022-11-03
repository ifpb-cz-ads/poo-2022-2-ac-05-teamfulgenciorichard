public class BMExercicio05 {
    class Time{
    
        String timeRival;
        String dataJogo;
        String localJogo;

        boolean jogoGanho;
    
        String verRival(){
            return timeRival;
        }
        
        String verData(){
            return dataJogo;
        }

        String verLocal(){
            return localJogo;
        }

        String statusJogo(){
            String analise;
            if(jogoGanho){
                analise = "foi ganho.";
            }
            else{
                analise = "não foi ganho.";
            }
            return analise;
        }
    
        void campeonato(){
            System.out.println("O time rival é " + verRival());
            System.out.println("O jogo será no dia " + verData());
            System.out.println("O jogo será no " + verLocal());
            System.out.println("O jogo " + statusJogo());
        }
    }
}

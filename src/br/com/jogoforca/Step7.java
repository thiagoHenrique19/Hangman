package br.com.jogoforca;

public class Step7 implements StepFork{
    //sobreescrevendo um metodo
    @Override
    public void printStep() {
        //caso não contenha a letra correspondida o boneco vai aparecendo cada vez mais ate ser inforcado
        String step = """
                         -----------------------|
                         |                      |
                         |                      *   ______
                         |                      * / $  $  /
                         |                      */   ~   /
                         |                     */ \\_\\ /
                         |                      **** 
                         |                     ____||___
                         |                    |       |
                         |                   /|       |\\
                         |                \\/ |       | \\/
                         |                    |       |
                         |                     ________
                         |                      |    |
                         |                      |    |
                       -----                   _|    |_
                       |   |
                    ----------
                    |        |
                    ----------
                """;
        System.out.println(step);
    }

}


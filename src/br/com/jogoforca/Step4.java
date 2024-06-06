package br.com.jogoforca;

public class Step4 implements StepFork{
    //sobreescrevendo um metodo
    @Override
    public void printStep() {
        //caso não contenha a letra correspondida o boneco vai aparecendo cada vez mais ate ser inforcado
        String step = """
                         -----------------------|
                         |                      |
                         |                     _____   
                         |                    | 0 0 |
                         |                    |  s  |
                         |                    | --- |
                         |                       |
                         |                    ________
                         |                    |      |
                         |                   /|      |\\
                         |                \\/ |      |  \\/
                         |                    |      |
                         |                    ________
                         | 
                         | 
                       -----
                       |   |
                    ----------
                    |        |
                    ----------
                """;
        System.out.println(step);
    }

}


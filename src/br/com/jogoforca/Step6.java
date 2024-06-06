package br.com.jogoforca;

public class Step6 implements StepFork{
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
                         |                \\/ |      | \\/
                         |                    |      |
                         |                    ________
                         |                     |    |
                         |                     |    |
                       -----                  _|    |_
                       |   |
                    ----------
                    |        |
                    ----------
                """;
        System.out.println(step);
    }

}


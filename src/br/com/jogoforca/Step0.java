package br.com.jogoforca;

public class Step0 implements StepFork{
    //sobreescrevendo um metodo
    @Override
    public void printStep() {
        String step = """
                         -----------------------|
                         |                      |
                         |
                         |
                         |
                         |
                         |
                         |
                         |
                         |
                         |
                         |
                         |
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


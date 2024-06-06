package br.com.jogoforca;

import java.util.List;
//Esta controloando o estado do enforcado no jogo,contem uma lista
//a ser seguida ate ser enforcado, isso atualiza a cada tetativa errada
public class Hangman {
    private final List<StepFork> steps = List.of(new Step0(),new Step1(),new Step2(),new Step3(),new Step4(),new Step5(),new Step6(),new Step7());
    private int position = 0;
    private static final int LAST_POSITION = 7;
    public boolean isFinishedFork() {
        return position == LAST_POSITION;
    }
    public void printFork() {
        steps.get(position).printStep();
    }
    public void increaseFork() {
        if(position< LAST_POSITION){
            position++;
        }
    }
}

package br.com.jogoforca;

import java.util.ArrayList;
import java.util.List;

public class Word {
    //diz sobre a palavra ser advinhada no jogo,
    //mantem a palavra em segredo atualiznado a cada chance do jogador
    private final String secretWord;
    private final List<Character> viewWord;

    public Word(String secretWord){

        if(secretWord != null && !secretWord.trim().isEmpty()){
            this.secretWord = secretWord.toUpperCase();
           viewWord = new ArrayList<>();
           for(int index = 0; index < secretWord.length(); index++){
               viewWord.add('-');
           }
        }else{
            throw new IllegalArgumentException("A palavra secreta não pode ser nula ou vazia");
        }
    }

    public boolean isCompleted() {
        return !viewWord.contains('-');
    }

    public void print() {
        System.out.println(viewWord);
    }

    public boolean processShot(char shot) {
        boolean hit = false;
        for(int index = 0; index < secretWord.length(); index++){
             if(Character.toUpperCase(shot)  == Character.toUpperCase(secretWord.charAt(index))){
                 viewWord.set(index,Character.toUpperCase(shot));
                 hit = true;
             }
        }
        return hit;
    }
}
// Adicionada uma validação no construtor para
// garantir que a palavra secreta não seja nula ou vazia.
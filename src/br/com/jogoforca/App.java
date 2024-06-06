package br.com.jogoforca;

import java.util.Scanner;

public class App {

    public void start(){
        //esta iniciando o jogo,criando instancias de Player,Hangman e WordService
        //e então executa o jogo
        Scanner terminal = new Scanner(System.in);
        Player player = new Player(terminal);
        Hangman hangman = new Hangman();
        WordService wordService = new WordService();
        Game game = new Game(player,wordService.getRandomWord(),hangman);
        game.run();
    }
}

package br.com.jogoforca;

import java.util.Scanner;

public class Player {
    //interação com o jogador
    private final Scanner terminal;

    public Player(Scanner terminal){
        this.terminal = terminal;
    }

    public char nextShot() {
        return terminal.nextLine().charAt(0);
    }
}

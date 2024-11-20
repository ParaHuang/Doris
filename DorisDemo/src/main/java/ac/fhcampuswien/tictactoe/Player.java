package ac.fhcampuswien.tictactoe;

import java.util.Scanner;

public class Player {
    private char symbol;
    private String name;

    public Player(char symbol,String name){
        this.symbol = symbol;
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public void move(TikTakToe toe, Scanner scanner){
        int num;
        do{
            System.out.print(name+" make your move (choose a number):");
            num = scanner.nextInt();
        }while (num<1 || num>9 /* or it's taken*/);

        //it's a valid move
        double row = Math.ceil(num/3);
        int col = num%3==0 ? 3 : num%3;        ;
        toe.placeTic(this,(int)row,col);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

import java.util.Scanner;

public class GuessGameClass {

    Scanner s = new Scanner(System.in);
        int number;
        int myguess;
        int numguess = 0;
    public static void main(String[] args) {
        // TODO code application logic here
      //  int number;
       // int myguess;
    //    int numguess = 0;
        Scanner s = new Scanner(System.in);

      //  System.out.println("Guess a number --> ");
      //  myguess = s.nextInt();

    }
public int getNumber(){
    return number;
}
public int getGuess(int g){
    return myguess;
}


    public void setNumber() {
        number = (int) (Math.random() * 100 + 1);
    }

    public void showHint() {
        if (myguess == number) {
            System.out.println("Good job! you got it");
            System.out.println("it took only " + numguess + " guesses!");
        } else if (myguess > number) {
            System.out.println("Too high, guess lower");
            numguess++;

        } else if (myguess < number) {
            System.out.println("Too low, guess higher");
            numguess++;

        }
    }
}

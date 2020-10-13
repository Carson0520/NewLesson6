/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryInterface;

import java.util.Scanner;

/**
 *
 * @author Lazyd
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Book b1, b2, b3, b4, b5;
        Scanner s = new Scanner(System.in);
        b1 = new Book("From Russua With Love", "Greg Hines");
        b2 = new Book("Living Smart", "Rita Langill");
        b3 = new Book("Singing In The Rain", "Harry Conner");
        b4 = new Book("Good Housekeeping", "Pat Burns");
        b5 = new Book("To Be a Model", "Lisa Lahey");
        System.out.println("Here are the books available: ");
        System.out.println(b1.getTitle());
        System.out.println(b2);

    }
    
}

package edu.handong.csee.java;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main stepF = new Main();
        stepF.f08();
    }

    void f08() {
      Scanner s = new Scanner(System.in);
      int[] number = new int[10];
      int newnum;
      int i, j;

      System.out.println("Enter a number from 1 to 100");
      for(i = 0; i < 10; i++){
        System.out.print("Enter " + (i+1) + "th number > ");
        newnum = s.nextInt();
        number[i] = newnum;

        for(j = 0; j < i; j++){
          if(newnum == number[j]){
            System.out.println("Invalid input!");
            i--;
          }
        }

      }
      for(i = 0; i < 10; i++)
        System.out.println((i+1) + "th number is " + number[i]);
	}

}

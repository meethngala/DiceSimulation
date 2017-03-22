/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicesimulation;

import java.util.*;

/**
 * represents the rolling dice
 * @author Meeth
 * @version 1
 */
public class RollDice {

    Scanner sc = new Scanner(System.in);
    int n;// represents the number of rolls
    int j;

    /**
     * takes input from the user
     */
    public void input() {
        System.out.println("Enter the number of trials");
        n = sc.nextInt();

    }

    /**
     * generates random n within a range specified
     * @param min lower limit of range
     * @param max upper limit of range
     * @return an integer within the range specified
     */
    public int getRandomNumber(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    /**
     * represents the result of trial that is result of rolling dice
     * @return sum of the numbers on dice
     */
    public int[] trials() {

        int sum[] = new int[n];
        for (j = 0; j < n; j++) {
            int d1 = getRandomNumber(1, 6);
            
            int d2 = getRandomNumber(1, 6);
            
            sum[j] = d1 + d2;

        }

        return sum;
    }

    /**
     * displays the result of rolling in percentage format with their respective frequencies
     */
    public void display() {
        int c2 = 0;// counter for sum 2
        int c3 = 0;// counter for sum3
        int c4 = 0;// counter for sum4
        int c5 = 0;// counter for sum5
        int c6 = 0;// counter for sum6
        int c7 = 0;// counter for sum7
        int c8 = 0;// counter for sum8
        int c9 = 0;// counter for sum9
        int c10 = 0;// counter for sum10
        int c11 = 0;// counter for sum11
        int c12 = 0;// counter for sum12
        int[] ch = new int[n];
        ch = trials();
        for (int i = 0; i < n; i++) {
            

            switch (ch[i]) {
                case 2:
                    c2++;
                    
                    break;
                case 3:
                    c3++;
                    break;
                case 4:
                    c4++;
                   
                    break;
                case 5:
                    c5++;
                    break;
                case 6:
                    c6++;
                    
                    break;
                case 7:
                    c7++;
                    break;
                case 8:
                    c8++;
                    
                    break;
                case 9:
                    c9++;
                    break;
                case 10:
                    c10++;
                    break;
                case 11:
                    c11++;
                    break;
                case 12:
                    c12++;
                    break;
            }
        }
        // converting into percentages
        c2 = ((c2 * 100)/n);
        c3 = ((c3 * 100)/n);
        c4 = ((c4 * 100)/n);
        c5 = ((c5 * 100)/n);
        c6 = ((c6 * 100)/n);
        c7 = ((c7 * 100)/n);
        c8 = ((c8 * 100)/n);
        c9 = ((c9 * 100)/n);
        c10 = ((c10 * 100)/n);
        c11 = ((c11 * 100)/n);
        c12 = ((c12 * 100)/n);
        int [] counter= {c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12};
        System.out.println("Sum     Frequency");
        
        for(int k=0;k< counter.length; k++)
        {   
            int m=k+2;
            System.out.print(m);
            System.out.print("\t");
            for(int l=1;l<=counter[k];l++)
            {   
                
            System.out.printf("*");
            }
            System.out.println();
        }
        
    }
}

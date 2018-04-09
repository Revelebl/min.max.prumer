/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package min.max.prumer;

import java.util.Scanner;

/**
 *
 * @author petr.adam
 */
public class MinMaxPrumer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "CP1250");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int pocet = 1;
        int soucet = 0;
        while (true) {
            System.out.println("vloz " + pocet + ".cislo: ");
            int vstup = sc.nextInt();

            if (vstup < min) {
                min = vstup;
            }

            if (vstup > max) {
                max = vstup;
            }
            if (vstup == 0) {
                break;
            }
            soucet = soucet + vstup;

            System.out.println(" Nynejsi nejmensi je " + min);
            System.out.println("Nynenjsi nejvetsi je " + max);
            System.out.println("prumer: "+((float) soucet/pocet));
            System.out.println("\n"); //  \n znamena dalsi radek vynechat
            pocet = (pocet + 1);
        }
    }

}

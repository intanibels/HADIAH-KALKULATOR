/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadiah.kalkulatorsederhana;

import java.util.Scanner;

/**
 *
 * @author Intan
 */
public class HadiahKalkulatorSederhana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat Scanner dan tipe data
        Scanner input = new Scanner(System.in);
        double angka1, angka2, hasil;
        //membuat judul
        System.out.println("\n KALKULATOR SEDERHANA \n");
        //membuat pilihan operator
        String[] operator = {" ", "Penjumlahan", "Pengurangan", "Pembagian", "Perkalian", "Modulus"};
        for (int a = 1; a < operator.length; a++) {
            System.out.println(a + ". " + operator[a]);
        }
        System.out.print("Pilihan Anda : ");
        int pilihan = input.nextInt();
        //membuat operator
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Bilangan Pertama : ");
                angka1 = input.nextDouble();
                System.out.print("Masukkan Bilangan Kedua   : ");
                angka2 = input.nextDouble();
                hasil = angka1 + angka2;
                System.out.println("Hasil Dari " + angka1 + " + " + angka2 + " = " + hasil);
                break;
            case 2:
                System.out.print("Masukkan Bilangan Pertama : ");
                angka1 = input.nextDouble();
                System.out.print("Masukkan Bilangan Kedua   : ");
                angka2 = input.nextDouble();
                hasil = angka1 - angka2;
                System.out.println("Hasil Dari " + angka1 + " - " + angka2 + " = " + hasil);
                break;
            case 3:
                System.out.print("Masukkan Bilangan Pertama : ");
                angka1 = input.nextDouble();
                System.out.print("Masukkan Bilangan Kedua   : ");
                angka2 = input.nextDouble();
                hasil = angka1 / angka2;
                System.out.println("Hasil Dari " + angka1 + " : " + angka2 + " = " + hasil);
                break;
            case 4:
                System.out.print("Masukkan Bilangan Pertama : ");
                angka1 = input.nextDouble();
                System.out.print("Masukkan Bilangan Kedua   : ");
                angka2 = input.nextDouble();
                hasil = angka1 * angka2;
                System.out.println("Hasil Dari " + angka1 + " x " + angka2 + " = " + hasil);
                break;
            case 5:
                System.out.print("Masukkan Bilangan Pertama : ");
                angka1 = input.nextDouble();
                System.out.print("Masukkan Bilangan Kedua   : ");
                angka2 = input.nextDouble();
                hasil = angka1 % angka2;
                System.out.println("Hasil Dari " + angka1 + " % " + angka2 + " = " + hasil);
                break;
            default:
                System.out.println("Anda Salah Memasukkan Kode");
                break;
        }
    }
    
}

package Tugas1BasicSyntaxChallenge;

import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        // Deklarasi variabel
        float Sisajam, Total_Biaya, Hari, Lama;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Total Lama Parkir Anda (Jam): ");
        Lama = scanner.nextInt();

        Hari = Lama / 24;
        Hari = (float) Math.floor(Hari);
        //System.out.println(Hari); //mengecek hari

        Sisajam = Lama - Hari*24;
        //System.out.println(Sisajam); //mengecek sisa jam

        Total_Biaya = Hari*15;
        //System.out.println(Total_Biaya); //mengecek total biaya

        if (Sisajam >= 5) {
            Total_Biaya +=5;
            //System.out.println(Total_Biaya); //mengecek total biaya
            Sisajam -=5;
            //System.out.println(Sisajam); //mengecek sisa jam
        }

        Total_Biaya += (Sisajam*0.5);
        //System.out.println(Total_Biaya); //mengecek total biaya

        System.out.println("Total biaya parkir anda adalah $" + Total_Biaya);
    }
}

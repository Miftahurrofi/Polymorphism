/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematic;

/**
 *
 * @author WINDOWS 11
 */
public class Matematika {
    public String pertambahan(double a, double b) {
        double hasil = a + b;
        return konversiKePecahan(hasil);
    }

    // Pengurangan dengan 2 parameter
    public String pengurangan(double a, double b) {
        double hasil = a - b;
        return konversiKePecahan(hasil);
    }

    // Perkalian dengan 2 parameter
    public String perkalian(double a, double b) {
        double hasil = a * b;
        return konversiKePecahan(hasil);
    }

    // Pembagian dengan 2 parameter
    public String pembagian(double a, double b) {
        if (b != 0) {
            double hasil = a / b;
            return konversiKePecahan(hasil);
        } else {
            return "Pembagian dengan nol tidak dapat dilakukan";
        }
    }

    // Modulus dengan 2 parameter
    public String modulus(double a, double b) {
        double hasil = a % b;
        return konversiKePecahan(hasil);
    }

    // Konversi hasil operasi ke pecahan
    protected String konversiKePecahan(double nilai) {
        if (nilai % 1 == 0) {

            return String.format("%d", (int) nilai);
        } else {
    
            int pembilang = (int) (nilai * 10000);  // Menentukan ketepatan hingga 4 desimal
            int penyebut = 10000;
            int gcd = findGCD(pembilang, penyebut);  // Menyederhanakan pecahan
            pembilang /= gcd;
            penyebut /= gcd;
            return pembilang + "/" + penyebut;
        }
    }

    
    private int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}

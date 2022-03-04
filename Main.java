package pkginterface;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // membuat objek HP
        Phone redmiNote8 = new Xiaomi();
        Phone S10 = new Samsung();

        // membuat objek user
        PhoneUser dian = new PhoneUser(redmiNote8);
        PhoneUser udin = new PhoneUser(S10);

        // memilih samrtphone yang akan dijalankan
        int pilih;
        System.out.println("[1] redmiNote8\n"
                + "[2] Samsung S10");
        System.out.print("Pilih SmartPhone>");
        pilih = input.nextInt();

        
        String aksi;
        if (pilih == 1) {
            // kita coba nyalakan HP-nya
            dian.turnOnThePhone();

            // biar enak, kita buat dalam program

            while (true) {
                System.out.println("=== APLIKASI INTERFACE ===");
                System.out.println("[1] Nyalakan HP");
                System.out.println("[2] Matikan HP");
                System.out.println("[3] Perbesar Volume");
                System.out.println("[4] Kecilkan Volume");
                System.out.println("[0] Keluar");
                System.out.println("--------------------------");
                System.out.print("Pilih aksi> ");
                aksi = input.nextLine();

                if (aksi.equalsIgnoreCase("1")) {
                    dian.turnOnThePhone();
                } else if (aksi.equalsIgnoreCase("2")) {
                    dian.turnOffThePhone();
                } else if (aksi.equalsIgnoreCase("3")) {
                    dian.makePhoneLouder();
                } else if (aksi.equalsIgnoreCase("4")) {
                    dian.makePhoneSilent();
                } else if (aksi.equalsIgnoreCase("0")) {
                    System.exit(0);
                } else {
                    System.out.println("Kamu memilih aksi yang salah!");
                }
            }
        } else if (pilih == 2) {
            // kita coba nyalakan HP-nya
            udin.turnOnThePhone();

            // biar enak, kita buat dalam program

            while (true) {
                System.out.println("=== APLIKASI INTERFACE ===");
                System.out.println("[1] Nyalakan HP");
                System.out.println("[2] Matikan HP");
                System.out.println("[3] Perbesar Volume");
                System.out.println("[4] Kecilkan Volume");
                System.out.println("[0] Keluar");
                System.out.println("--------------------------");
                System.out.print("Pilih aksi> ");
                aksi = input.nextLine();

                if (aksi.equalsIgnoreCase("1")) {
                    udin.turnOnThePhone();
                } else if (aksi.equalsIgnoreCase("2")) {
                    udin.turnOffThePhone();
                } else if (aksi.equalsIgnoreCase("3")) {
                    udin.makePhoneLouder();
                } else if (aksi.equalsIgnoreCase("4")) {
                    udin.makePhoneSilent();
                } else if (aksi.equalsIgnoreCase("0")) {
                    System.exit(0);
                } else {
                    System.out.println("Kamu memilih aksi yang salah!");
                }
            }
        }else {
            System.out.println("Smartphone tidak tersedia");   
        }
    }
}

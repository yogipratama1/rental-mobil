/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.uas;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author YOGI
 */
public class ProjectUAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Selamat Datang di Rental Mobil "
                + "Berkah Abadi Selamanya Takkan Pernah Terganti Hingga Akhir Nanti");
        lanjutan();

    }

    public static void lanjutan() {

        Scanner nilai = new Scanner(System.in);

        System.out.println(" Silahkan Pilih Mobil yang Ingin Anda Sewa \n 1.Avanza \n"
                + " 2.Xenia \n 3.Kijang Inova\n 4.Grand Livina \n 5.Elf");
        System.out.print("Pilih Mobil Yang Ingin Anda Sewa \t:");
        int b = nilai.nextInt();
        System.out.print("masukan jumlah mobil yang ingin anda sewa \t: ");
        int m = nilai.nextInt();
        switch (b) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("__________-_______________");
                System.out.println("sewa mobil per hari = Rp.350000.00");
                System.out.print("apakah anda ingin melanjutkan?\n 1. iya \n"
                        + " 2.Tidak \n masukan pilihanmu \t:");

                int q = nilai.nextInt();
                if (q == 1) {
                    System.out.print("Mulai Tanggal (1-30) \t:");
                    int angka = nilai.nextInt();
                    System.out.print("Sampai Tanggal (2-30) \t :");
                    int angkaa = nilai.nextInt();
                    int bayar = (angkaa - angka) * 350000*m;
                    perhitungan(bayar);
                } else if (q == 2) {
                    System.out.println("Terimakasih telah berkunjung di rental "
                            + "mobil berkah abadi selamanya takkan pernah terganti .");
                    System.exit(0);
                } else if (q > 2) {
                    System.out.println("masukan pilihan yang benar");
                    lanjutan();

                    break;
                }

            case 5:
                System.out.println("______________-_______________");
                System.out.println("Sewa Elf per hari = Rp.450000.00");
                System.out.print("apakah anda ingin melanjutkan?\n 1. iya \n"
                        + " 2.Tidak \n masukan pilihanmu \t:");

                int r = nilai.nextInt();
                if (r == 1) {

                    System.out.print("Mulai Tanggal (1-30) \t :");
                    int angka = nilai.nextInt();
                    System.out.print("Sampai Tanggal (2-30) \t :");
                    int angkaa = nilai.nextInt();
                    int bayar = (angkaa - angka) * 450000*m;
                    elf(bayar);
                } else if (r == 2) {
                    System.out.println("Terimakasih telah berkunjung di rental "
                            + "mobil berkah abadi selamanya takkan pernah terganti .");
                } else if (r > 2) {
                    System.out.println("masukan pilihan yang benar" + r);

                    break;
                }
            default:
                JOptionPane.showMessageDialog(null, "Masukan Pilihan Yang Benar");
                lanjutan();

        }
    }

    public static double perhitungan(double bayar) {
        Scanner nilai = new Scanner(System.in);
        System.out.print("Apakah Anda Ingin Memakai Sopir?\n 1.Iya \n 2.Tidak "
                + "\n masukan pilihanmu \t:");
        int ab = nilai.nextInt();
        System.out.println("___________________________");
        if (ab == 1) {
            int ac = (int) (bayar + 100000);
            System.out.println("Sewa Sopir          :Rp.100000.00");
            System.out.println("Sewa Mobil per hari :Rp.350000.00");
            System.out.println("Total Pembayaran   :" + "Rp." + ac + "0");
            System.out.print("apakah anda benar benar ingin menyewa mobil ini"
                    + " dan melanjutkan ke registrasi? \n 1.iya"
                    + "\n 2. tidak \n masukan pilihanmu :");
            int p = nilai.nextInt();
            if (p == 1) {
                registrasi();
            } else if (p == 2) {
                System.out.println("silakan memilih mobil kembali");
                lanjutan();
            }

        } else if (ab == 2) {
            System.out.println("Sewa Mobil per hari :Rp.350000.00");
            System.out.println("Total Pembayaran Sewa :" + "Rp." + bayar + "0");
            System.out.print("apakah anda benar benar ingin menyewa mobil ini"
                    + " dan melanjutkan ke registrasi? \n 1.iya"
                    + "\n 2. tidak \n masukan pilihanmu :");
            int p = nilai.nextInt();
            if (p == 1) {
                registrasi();
            } else if (p == 2) {
                System.out.println("silakan memilih mobil kembali");
                lanjutan();
            }
        } else if (ab > 2) {
            System.out.println("Masukan Pilihan Yang Benar");
            perhitungan(bayar);
        }

        return 0;
    }

    public static double elf(double bayar) {
        Scanner nilai = new Scanner(System.in);
        System.out.println("Apakah Anda Ingin Memakai Sopir?\n 1.Iya \n 2.Tidak");
        int ab = nilai.nextInt();
        System.out.println("______________________");
        if (ab == 1) {
            int ac = (int) (bayar + 100000);
            System.out.println("Sewa Sopir          :Rp.100000.00");
            System.out.println("Sewa elf per hari :Rp.450000.00/elf");
            System.out.println("Total Pembayaran   :" + "Rp." + ac + "0");
            System.out.print("apakah anda benar benar ingin menyewa mobil ini"
                    + " dan melanjutkan ke registrasi? \n 1.iya"
                    + "\n 2. tidak \n masukan pilihanmu :");
            int p = nilai.nextInt();
            if (p == 1) {
                registrasi();
                
            } else if (p == 2) {
                System.out.println("silakan memilih mobil kembali");
                lanjutan();
            }
            } else if (ab == 2) {
                System.out.println("Sewa Mobil per hari :Rp.450000.00");
                System.out.println("Total Pembayaran Sewa :" + "Rp." + bayar + "0");
                System.out.print("apakah anda benar benar ingin menyewa mobil ini"
                    + " dan melanjutkan ke registrasi? \n 1.iya"
                    + "\n 2. tidak \n masukan pilihanmu :");
            int p = nilai.nextInt();
            if (p == 1) {
                registrasi();
            } else if (p == 2) {
                System.out.println("silakan memilih mobil kembali");
                lanjutan();
            }
            else if (ab > 2) {
            System.out.println("Masukan Pilihan Yang Benar");
            perhitungan(bayar);
            
            }
        
    }
        return 0;
    }
    

    public static int registrasi() {
        String nama, nik, alamat,nomor_hp;
        int  jenis_kelamin;
        Scanner input = new Scanner(System.in);
        System.out.println("*** PENDAFTARAN PENYEWA MOBIL***");
        System.out.print("Nama penyewa  :\t");
        nama = input.next();
        System.out.print("nik           :\t");
        nik = input.next();
        System.out.print("alamat        :\t");
        alamat = input.next();
        System.out.print("jenis kelamin :\t");

        String jenis = input.next();
        System.out.print("nomer hp      :\t");
        nomor_hp = input.next();

        System.out.println("--------------------");
        System.out.println("Nama penyewa    : " + nama);
        System.out.println("nik             : " + nik);
        System.out.println("alamat          : " + alamat);
        System.out.println("jenis kelamin   : " + jenis);
        System.out.println("nomor hp        : " + nomor_hp);
        System.out.println("Silakan membawa mobilnya");
        System.out.println("DAN JANGAN LUPA MENGEMBALIKAN");
        System.out.println("JIKA ANDA LUPA MAKA ANDA HARUS MEMBAYAR");
        
        System.exit(0);
        return 0;

    }
}

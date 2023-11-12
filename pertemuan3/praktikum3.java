package pertemuan3;

import java.util.Scanner;

public class praktikum3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Selamat datang silahkan ketik anda ingin ke lantai berapa : ");
        int floor_lantai = input.nextInt();
        if (floor_lantai > 13) {
            floor_lantai--;  
            System.out.println("Selamat datang sekarang anda  berada di lantai: " + floor_lantai);
        } else {
            System.out.println("Selamat datang sekarang anda berada di lantai: " + floor_lantai);
        }

        input.close();
    }
}

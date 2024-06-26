import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------- PROGRAMMING TEST ----------");
        System.out.println();
        okYes();
    }

    public static void okYes(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------- SOAL 1 ----------");

        System.out.print("Masukkan nilai batas yang anda inginkan:");
        int angka = scanner.nextInt();

        OkYes.okYes(angka);
        jalurAngka();

    }

    public static void jalurAngka(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------- SOAL 2 ----------");
        System.out.println();
        System.out.print("Masukkan nilai untuk mengerjakan soal A:");

        int angka = scanner.nextInt();
        JalurAngka.jalurA(angka);

        System.out.print("Masukkan nilai untuk mengerjakan soal B:");

        int angka2 = scanner.nextInt();
        JalurAngka.jalurB(angka2);

        System.out.print("Masukkan nilai untuk mengerjakan soal C:");

        int angka3 = scanner.nextInt();
        JalurAngka.jalurC(angka3);

        System.out.print("Masukkan nilai untuk mengerjakan soal D:");

        int angka4 = scanner.nextInt();
        JalurAngka.jalurD(angka4);

        selainKelipatanTiga();


    }

    public static void selainKelipatanTiga(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------- SOAL 3 ----------");
        System.out.println();
        List<Integer> parsedValue = new ArrayList<>();
        System.out.print("Masukkan nilai untuk mengerjakan soal (setiap nilai dipisahkan dengan spasi):");
        String[] strNums = scanner.nextLine().split(" ");

        for (String num : strNums){
            Integer intValue = Integer.parseInt(num);
            parsedValue.add(intValue);
        }

        List<Integer> hasilArray = SelainAngkaTiga.selainAngkaTiga(parsedValue);

        System.out.println(hasilArray);

    }

}
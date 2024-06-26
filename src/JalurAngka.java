public class JalurAngka {
    public static void jalurA(int angka){
        System.out.println();
        System.out.println("---------- JAWABAN 2A ----------");
        System.out.println();

        for (int i = 1; i <= angka; i++){
            String string = Integer.toString(i);

            System.out.println(string.repeat(i));
        }
        System.out.println();
    }

    public static void jalurB(int angka){
        System.out.println();
        System.out.println("---------- JAWABAN 2B ----------");
        System.out.println();

        for (int i = 1; i <= angka; i++){
            for (int j = i; j > 0; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void jalurC(int angka){
        System.out.println();
        System.out.println("---------- JAWABAN 2C ----------");
        System.out.println();


        int count = 0; // yang ditambah dan berkurang bertubi -tubi
        int flag = 0; // yang dijadikan flag
        int j = 0;
        for (int i = 1; i <= angka; i++) {

            while (flag % 2 == 0){

                count++;
                System.out.print(count);
                j++;
                if (count == angka){
                    flag++;
//                    flag = false;
                }
                if (j == i){
                    j = 0;
                    System.out.println();
                    break;
                }
            }

//            if (j == 0) {
//
//                continue;
//            }

            while (flag % 2 != 0){
                count--;
                System.out.print(count);
                j++;
                if (count == 1){
                    flag++;
                }
                if (j == i) {
                    j = 0;

                    System.out.println();
                    break;
                }
            }
        }

        // NOMOR 2D AJA DULU
    }

    public static void jalurD(int angka) {
        System.out.println();
        System.out.println("---------- JAWABAN 2D ----------");
        System.out.println();

        int[][] matriks = new int[angka][angka];
        int num = 1;

        for (int i = 0; i < angka; i++) {
            for (int j = 0; j < angka; j++) {
                if (i % 2 == 0) {
                    matriks[j][i] = num++;
                } else {
                    matriks[angka - 1 - j][i] = num++;
                }
            }
        }

        for (int i = 0; i < angka; i++) {
            for (int j = 0; j < angka; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
    }
}

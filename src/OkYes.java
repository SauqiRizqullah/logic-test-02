public class OkYes {
    public static void okYes(int angka){

        for (int i = 1; i <= angka; i++){
            if (i % 3 == 0 && i % 4 == 0){
                System.out.print("OKYES");
            } else if (i % 3 == 0){
                System.out.print("OK");
            } else if (i % 4 ==0) {
                System.out.print("YES");
            } else {
                System.out.print(i);
            }

            if (i != angka){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

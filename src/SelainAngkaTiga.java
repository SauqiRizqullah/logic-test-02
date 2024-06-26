import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelainAngkaTiga {
    public static List<Integer> selainAngkaTiga(List<Integer> arrayUtuh){
        System.out.println();
        System.out.println("---------- JAWABAN 3 ----------");
        System.out.println();

        Collections.sort(arrayUtuh);

        List<Integer> antiAngkaTiga = new ArrayList<>();

        for (Integer num : arrayUtuh){
            if (num % 3 != 0){
                antiAngkaTiga.add(num);
            }
        }
        System.out.println();
        return antiAngkaTiga;
    }
}

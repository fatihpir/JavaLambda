package dongu;

import java.util.Arrays;
import java.util.List;

/**
 * Created by fatihpir on 23.12.2016.
 */
public class Dongu {
    public static void main(String[] args){
        String[] ATBank = {"Altuğ","Selin","Fatih"};

        List<String> egitmenler = Arrays.asList(ATBank);

        /*
        Eski for döngüsü
         */
        System.out.println("Bilinen for döngüsü ile:");
        for (String s:egitmenler){
            System.out.print(s+",");
        }

        /*
        Lambda ile
         */
        System.out.println("");
        System.out.println("Java 8 ile birlikte gelen lambda ile:");
        egitmenler.forEach((egitmen)-> System.out.print(egitmen+","));
    }
}

package limit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by fatihpir on 23.12.2016.
 */
public class Limit {
    public static void main(String[] args){
        String[] ATBank = {"Altuğ","Selin","Fatih"};

        List<String> egitmenler = Arrays.asList(ATBank);

        egitmenler.stream()
                .limit(2)
                .forEach((egitmen)-> System.out.print(egitmen+","));

    }
}

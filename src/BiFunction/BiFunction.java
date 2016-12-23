package BiFunction;/**
 * Created by fatihpir on 23.12.2016.
 */

public interface BiFunction<T,U,R> {
    R fonksiyon(T t,U u); //(t,u) ->r
}
class BiFunctionUygulama{
    public static void main(String[] args){
        BiFunction<Integer,Integer,String> biFunction = (sayi1,sayi2)-> "Sonuç " +(sayi1*sayi2);

        String sonuc = biFunction.fonksiyon(9,6);
        System.out.println(sonuc);
    }
}
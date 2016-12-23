package BiConsumer;/**
 * Created by fatihpir on 23.12.2016.
 */

public interface BiConsumer<T,U> {
    void fonksiyon(T t,U u);

    /*

    (t,u)->{}

     */
}
class BiConsumerUygulama{
    public static void main(String[] args){
        BiConsumer<String,Integer> biConsumer = (isim,yas)->{
            System.out.println(isim+" "+yas+" yaşında");
        };
        biConsumer.fonksiyon("Ali",35);
    }
}

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainHash {


    public static void main(String[] args){
        HashList hashList = new HashList();

        HashMap hashMap = new HashMap();
        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            //这种效率比较低
            Map.Entry entry = (Map.Entry) iterator.next();
            Object key = entry.getKey();
            Object val = entry.getValue();

            //来个效率高的
            Object key2 = iterator.next();
            Object val2 = hashMap.get(key2);
        }

        int count = 1;
        int size = 12;

        double result =(double) count/(double) size;
        System.out.println(result);
    }

}

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.HashMap;

/**
 * hash表，手撸，走你
 *
 * @param <K>
 * @param <V>
 */
public class HashList<K, V> implements HashCompile<K, V> {
    //hash表的初始化长度
    private final int size = 12;
    //增长因子
    private final double cent = 0.75;
    //数组，用来存放数据
    private Node[] arrays;

    public HashList() {
        arrays = new Node[size];
    }

    @Override
    public void put(K k, V v) {
        int hash = k.hashCode();
        int index = hash % 12;
        Node node = new Node();
        node.setHash(hash);
        node.setData(v);
        node.setKey(k);

        if (arrays[index] == null) {
            arrays[index] = node;
            //检查是否要扩容
            if (checkResize()) {
                resized();
            }
        } else {
            Node temp = arrays[index];
            while (temp.getNext() != null) {
                if(temp.getKey() == k){
                    temp.setData(v);
                    return;
                }
                temp = temp.getNext();

            }
            temp.setNext(node);
        }
    }

    @Override
    public V get(K k) {
        int hash = k.hashCode();
        int index = hash % size;
        if(arrays[index] == null){
            return null;
        }else{
            Node temp = arrays[index];
            while (temp != null){
                if(temp.getHash() == hash){
                    return (V) temp.getData();
                }
                temp.getNext();
            }
            return null;
        }
    }

    @Override
    public void clear() {
        arrays = null;
    }

    @Override
    public void putAll(HashList<K, V> HashList) {

    }

    @Override
    public void remove(K k) {

    }

    @Override
    public void resized() {

    }

    private boolean checkResize() {
        int count = 0;
        for (Node node : arrays) {
            if (node != null) {
                count++;
            }
        }
        double result = (double) count / size;
        result = new BigDecimal(result).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        if (result > cent) {
            return true;
        } else {
            return false;
        }
    }


}
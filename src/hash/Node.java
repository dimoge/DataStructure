public class Node<K,V> {
    K key;
    V data;
    Node next;
    int hash;

    public V getData() {
        return data;
    }

    public void setData(V data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }

    public K getKey(){
        return key;
    }

    public void setKey(K key){
        this.key = key;
    }
}

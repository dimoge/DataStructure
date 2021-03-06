public interface HashCompile<K, V>{

    public void put(K k, V v);

    public V get(K k);

    public void clear();

    public void putAll(HashList<K,V> hashMap);

    public void remove(K k);

    public void resized();

}
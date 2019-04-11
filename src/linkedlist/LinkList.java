public interface LinkList<T> {

    public int getSize();

    public void addHead(T t);

    public boolean add(int index, T t);

    public boolean remove(T t);

    public void print();

    public boolean remove(int index);

    public T get(int index);
}

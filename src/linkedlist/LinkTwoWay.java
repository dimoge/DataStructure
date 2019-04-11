/**
 * 双向链表，每个节点都有对上一个和下一个的节点的引用，next，pre
 */
public class LinkTwoWay implements LinkList<LinkTwoWay.Node> {
    Node head;
    Node pre;
    Node next;

    @Override
    public int getSize() {
        int size = 0;
        Node current_node = head;
        while(current_node != null){
            size ++;
            current_node = current_node.next;
        }
        return size;
    }

    @Override
    public void addHead(Node node) {

    }

    @Override
    public boolean add(int index, Node node) {
        return false;
    }

    @Override
    public boolean remove(Node node) {
        return false;
    }

    @Override
    public void print() {

    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public Node get(int index) {
        return null;
    }

    public static class Node<T>{
        T data;
        Node pre;
        Node next;

        public Node(){

        }

        public Node(T data, Node pre, Node next) {
            this.data = data;
            this.pre = pre;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public Node getPre() {
            return pre;
        }

        public Node getNext() {
            return next;
        }

        public void setData(T data) {
            this.data = data;
        }

        public void setPre(Node pre) {
            this.pre = pre;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}

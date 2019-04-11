/**
 * 按照我的理解，先写一个试试手
 *
 * 单向链表
 */
public class LinkSingle implements LinkList<LinkSingle.Node> {

    public Node head;

    public LinkSingle(Node head){
        this.head = head;
    }

    public LinkSingle(){

    }

    /**
     * 获取链表长度
     * @return
     */
    @Override
    public int getSize(){
        int size = 0;

        Node current_node = head;
        while (current_node!=null){
            size++;
            current_node = current_node.next;
        }
        return size;
    }

    /**
     * 添加方法
     * @param node
     */
    @Override
    public void addHead(Node node){
        //将当前节点的next设置为曾经头节点
        node.next = head;
        //将头节点设置为当前节点
        this.head = node;
    }

    /**
     * 添加方法，插入到指定位置
     * 【从0开始】
     * @param index
     * @param node
     */
    @Override
    public boolean add(int index, Node node){
        if(index<0 || index>getSize()){
            return false;
        }
        Node current_node = head;
        //先拿到指定位置的前一个节点
        for(int i=1; i<index; i++){
            current_node = current_node.next;
        }
        //将前一个节点的next设置为待添加的node
        Node lastNode = current_node;
        Node nextNode = current_node.next;
        lastNode.next = node;
        node.next = nextNode;
        return true;

    }

    /**
     * 删除方法
     * @param node
     * @return
     */
    @Override
    public boolean remove(Node node){
        //先查询一下当前链表中是否存在这个node
        if(head == null){
            return false;
        }
        if(head == node){
            head = head.next;
            return true;
        }else{
            Node current_node = head;
            while (current_node.next != null){
                if(current_node.next == node){
                    current_node.next = node.next;
                    return true;
                }else{
                    current_node = current_node.next;
                }
            }
            return false;
        }
    }

    @Override
    public void print(){
        Node current_node = head;
        System.out.println("单链表开始输出： 总长度=" + getSize());
        for(int i=0; i<getSize(); i++){
            System.out.println("序号：" + i + ", 数据： " + current_node.getData());
            current_node = current_node.getNext();
        }
        System.out.println("单链表结束输出：…………………………\n" );
    }

    /**
     * 删除方法，按照序号删除
     * @param index
     * @return
     */
    @Override
    public boolean remove(int index){
        if(index<0 || index>getSize()-1){
            return false;
        }
        Node current_node = head;
        for(int i=1; i<index; i++){
            current_node = current_node.next;
        }
        current_node.next = current_node.next.next;
        return true;
    }

    /**
     * 获取节点
     * @param index
     * @return
     */
    @Override
    public Node get(int index){
        if(index<0 || index>getSize()-1){
            return null;
        }
        Node current_node = head;
        for(int i=0; i!=index; i++){
            current_node = current_node.next;
        }
        return current_node;
    }



    public static class Node<T>{

        private T data;
        private Node next;

        public Node( T t){
            this.data = t;
        }

        public Node(){

        }

        public T getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setData(T data) {
            this.data = data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

    }
}

/**
 * 扩展，单向链表类似于栈
 */

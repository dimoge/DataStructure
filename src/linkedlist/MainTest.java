

public class MainTest {

    public static void main(String[] args){
        LinkSingle linkSingle = new LinkSingle(new LinkSingle.Node(111));

        linkSingle.add(1,new LinkSingle.Node(222));
        linkSingle.add(2,new LinkSingle.Node(333));
        linkSingle.add(3,new LinkSingle.Node(444));

        linkSingle.print();

        linkSingle.remove(1);

        linkSingle.print();

        linkSingle.addHead(new LinkSingle.Node("HELLO WORLD"));

        linkSingle.print();

        System.out.println("第一个节点：" + linkSingle.get(0).getData());





    }
}

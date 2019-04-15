import java.util.List;

public interface TreeCompile<T extends TreeParent>{

    public void clear();


    /**
     * 求树的深度
     * @return
     */
    public int dept(T tree);

    public int width(T t1, T t2);

    public Tree get(int index);

    public List getChildren(Tree tree);

    public boolean isEmpty();

    public Tree getRoot();

    public int getChildrenSize();



}
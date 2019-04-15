import java.util.List;

/**
 * 普通树
 * 有很多个节点吧
 */
public class TreeNomal extends TreeParent implements TreeCompile<TreeNomal>{

    public Tree rootTree;

    @Override
    public void clear() {

    }

    @Override
    public int dept(TreeNomal tree) {
        return 0;
    }


    @Override
    public int width(TreeNomal t1, TreeNomal t2) {
        return 0;
    }

    @Override
    public Tree get(int index) {
        return null;
    }

    @Override
    public List getChildren(Tree tree) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Tree getRoot() {
        return null;
    }

    @Override
    public int getChildrenSize() {
        return 0;
    }
}

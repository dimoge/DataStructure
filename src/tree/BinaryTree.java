import java.util.List;

/**
 * 二叉树
 *    二叉树相对简单点吧，不然要疯了，普通树有点复杂哦
 */
public class BinaryTree extends TreeParent implements TreeCompile<BinaryTree>{

    public int data;
    public BinaryTree leftTree;
    public BinaryTree rightTree;

    public BinaryTree(int data, BinaryTree leftTree, BinaryTree rightTree) {
        this.data = data;
        this.leftTree = leftTree;
        this.rightTree = rightTree;
    }


    @Override
    public void clear() {
        leftTree = null;
        rightTree = null;
    }

    @Override
    public int dept(BinaryTree binaryTree) {
        //TODO: 求深度
        if(this == null){
            return 0;
        }
        int leftDept = dept(binaryTree.leftTree);
        int rightDept = dept(binaryTree.rightTree);
        return 1+ Math.max(leftDept, rightDept);
    }

    @Override
    public int width(BinaryTree t1, BinaryTree t2) {
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

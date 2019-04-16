import java.util.List;

/**
 * 二叉树
 *    二叉树相对简单点吧，不然要疯了，普通树有点复杂哦
 */
public class BinaryTree extends TreeParent implements TreeCompile<BinaryTree.Tree>{

    public int data;
    public Tree root;
    public BinaryTree leftTree;
    public BinaryTree rightTree;
    private Tree t1;
    private Tree t2;

    public BinaryTree(Tree root) {
        this.root = root;
    }


    @Override
    public void clear() {
        leftTree = null;
        rightTree = null;
    }



    @Override
    public int width(Tree t1, Tree t2) {
        return 0;
    }

    /**
     * 求深度, 后序遍历
     * @param tree 从此节点开始算
     * @return
     */
    @Override
    public int dept(Tree tree) {
        if(tree == null){
            return 0;
        }
//        System.out.println("本节点为：" + tree.data);
        int leftDept = dept(tree.left);
        int rightDept = dept(tree.right);
        int result = 1 + Math.max(leftDept,rightDept);
        System.out.println("本次结果为- 来自|" + tree.data + "->" + result);
        return 1+ Math.max(leftDept, rightDept);
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

    public static class Tree extends TreeParent{
        public Object data;
        public Tree left;
        public Tree right;

        public Tree(Object o){
            data = o;
        }

    }
}

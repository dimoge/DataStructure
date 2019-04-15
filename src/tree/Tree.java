import java.io.Serializable;
import java.util.List;

/**
 * 树结构的学习
 *      概念： 定义：空二叉树的高度为-1，只有根节点的二叉树高度为0，根节点在0层，深度为0。
 *
 *  1、斜树
 *      只有左子树或者右子树的，应用较少
 *  2、满树
 *      所有节点都有左右子树，所有的叶子节点都同一层上
 *
 *  3、平衡树
 *      每个结点的左右子树的高度差小等于1，只须在计算二叉树高度时，同时判断左右子树的高度差即可。
 *      它是一棵空树或它的左右两个子树的高度差的绝对值不超过1，并且左右两个子树都是一棵平衡二叉树。平衡二叉树的常用实现方法有红黑树、AVL、替罪羊树、Treap、伸展树等。 最小二叉平衡树的节点的公式如下 F(n)=F(n-1)+F(n-2)+1 这个类似于一个递归的数列，可以参考Fibonacci数列，1是根节点，F(n-1)是左子树的节点数量，F(n-2)是右子树的节点数量。
 *
 *      ======树结构太难学了，先看看hash表吧。。。。 :(
 *
 *
 *      基本术语
 * 结点：存储数据元素和指向子树的链接，由数据元素和构造数据元素之间关系的引用组成。
 * 孩子结点：树中一个结点的子树的根结点称为这个结点的孩子结点，如图1中的A的孩子结点有B、C、D
 * 双亲结点：树中某个结点有孩子结点(即该结点的度不为0)，该结点称为它孩子结点的双亲结点，也叫前驱结点。双亲结点和孩子结点是相互的，如图1中，A的孩子结点是B、C、D，B、C、D的双亲结点是A。
 * 兄弟结点：具有相同双亲结点(即同一个前驱)的结点称为兄弟结点，如图1中B、B、D为兄弟结点。
 * 结点的度：结点所有子树的个数称为该结点的度，如图1，A的度为3，B的度为2.
 * 树的度：树中所有结点的度的最大值称为树的度，如图1的度为3.
 * 叶子结点：度为0的结点称为叶子结点，也叫终端结点。如图1的K、L、F、G、M、I、J
 * 分支结点：度不为0的结点称为分支结点，也叫非终端结点。如图1的A、B、C、D、E、H
 * 结点的层次：从根结点到树中某结点所经路径的分支数称为该结点的层次。根结点的层次一般为1(也可以自己定义为0)，这样，其它结点的层次是其双亲结点的层次加1.
 * 树的深度：树中所有结点的层次的最大值称为该树的深度(也就是最下面那个结点的层次)。--从根节点开始（其深度为0）自顶向下逐层累加的。
 * 有序树和无序树：树中任意一个结点的各子树按从左到右是有序的，称为有序树，否则称为无序树。
 * 树的抽象数据类型描述
 * 数据元素：具有相同特性的数据元素的集合。
 * 结构关系：树中数据元素间的结构关系由树的定义确定。
 * 基本操作：树的主要操作有
 */


/**
 * 一个最普通的树
 */
public class Tree implements Serializable {
    Object data;
    List childs;

    public Tree(Object o, List childs){
        this.data = o;
        this.childs = childs;
    }

    public Tree(){

    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public List getChilds() {
        return childs;
    }

    public void setChilds(List childs) {
        this.childs = childs;
    }

    public void add(Tree tree){
        this.childs.add(tree);
    }

    public boolean remove(Tree tree){
        return this.childs.remove(tree);
    }

    public Tree remove(int index){
        return (Tree) this.childs.remove(index);
    }

    /**
     * 获取此节点的深度
     * @return
     */
    public int getDetp(){
        return 0;
    }

    /**
     * 获取此树的层次
     * @return
     */
    public int getLevel(){
        return 0;
    }
}
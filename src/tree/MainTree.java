public class MainTree {

    public static void main(String[] args){

        BinaryTree.Tree root = new BinaryTree.Tree("root");
        BinaryTree.Tree tree11 = new BinaryTree.Tree("11");
        BinaryTree.Tree tree12 = new BinaryTree.Tree("12");
        BinaryTree.Tree tree21 = new BinaryTree.Tree("21");
        BinaryTree.Tree tree22 = new BinaryTree.Tree("22");
        BinaryTree.Tree tree23 = new BinaryTree.Tree("23");
        BinaryTree.Tree tree24 = new BinaryTree.Tree("24");
        BinaryTree.Tree tree31 = new BinaryTree.Tree("31");
        BinaryTree.Tree tree32 = new BinaryTree.Tree("32");
        BinaryTree.Tree tree33 = new BinaryTree.Tree("33");
        BinaryTree.Tree tree34 = new BinaryTree.Tree("34");
        BinaryTree.Tree tree35 = new BinaryTree.Tree("35");
        BinaryTree.Tree tree36 = new BinaryTree.Tree("36");
        BinaryTree.Tree tree37 = new BinaryTree.Tree("37");
        BinaryTree.Tree tree38 = new BinaryTree.Tree("38");
        BinaryTree.Tree tree41 = new BinaryTree.Tree("41");
        BinaryTree.Tree tree42 = new BinaryTree.Tree("42");
        BinaryTree.Tree tree43 = new BinaryTree.Tree("43");
        BinaryTree.Tree tree51 = new BinaryTree.Tree("51");

        root.left = tree11;
        root.right = tree12;
        //第二层
        tree11.left = tree21;
        tree11.right = tree22;
        tree12.left = tree23;
        tree12.right = tree24;
        //第三层
        tree21.left = tree31;
        tree21.right = tree32;
        tree22.left = tree33;
        tree22.right = tree34;
        tree23.left = tree35;
        tree23.right = tree36;
        tree24.left = tree37;
        tree24.right = tree38;
        //第四层
        tree31.left = tree41;
        tree31.right = tree42;
        tree32.left = tree43;
        //第五层
        tree41.left = tree51;

        BinaryTree binaryTree = new BinaryTree(root);
        System.out.println(binaryTree.dept(root));
//        System.out.println(binaryTree.dept(tree51));


    }
}

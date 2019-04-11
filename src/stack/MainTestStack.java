public class MainTestStack {

    public static void main(String[] args){

        Stack<StackItem> stack = new Stack<>(StackItem.class, 10);

        System.out.println("顶部序号是：" + stack.getTopIndex());
        stack.push(new StackItem("hello"));

        System.out.println("顶部序号是：" + stack.getTopIndex());
        stack.push(new StackItem("my"));

        System.out.println("顶部序号是：" + stack.getTopIndex());
        stack.push(new StackItem("baby"));

        System.out.println("顶部序号是：" + stack.getTopIndex());

        System.out.println("顶部序号是：" + stack.getTopIndex());
        System.out.println("顶部数据是：" + stack.getTop().getStr());

    }

    public static class StackItem{

        String str;

        public StackItem(String str){
            this.str = str;
        }

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }
    }
}

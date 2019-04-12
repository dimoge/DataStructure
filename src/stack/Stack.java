import java.lang.reflect.Array;

/**
 * 栈的实现
 * 栈是只能在某一端插入和删除的特殊线性表。它按照先进后出的原则存储数据，先进入的数据被压入栈底，最后的数据在栈顶，需要读数据的时候从栈顶开始弹出数据（最后一个数据被第一个读出来）。
 * 栈，或叫堆栈，先进后出，类似于羽毛球筒
 * 与队列完全相反，不再展开
 * @param <T>
 */
public class Stack<T> {

    private int max_size;
    private T[] arrays;
    //最顶部的index
    private int top = 0;

    public Stack(Class<T> type,int size){
        /**
         * 申明一个泛型数组
         * T[] arrays = (T[])new Objects[size];
         * 这是一个错误方法，编译能过得去，但是在操作数组的时候（赋值，取值），会发生ClassCastException ：Object cannot be cast to Thread
         */
        //arrays = (T[])new Objects[size];
        arrays = (T[]) Array.newInstance(type, size);//利用反射机制，实现泛型数组
        max_size = size;
    }


    public T[] getArrays() {
        return arrays;
    }

    public void setArrays(T[] arrays) {
        this.arrays = arrays;
    }

    /**
     * 获取顶部数据
     * @return
     */
    public T getTop(){
        return arrays[top];
    }

    public int getTopIndex(){
        return top;
    }

    /**
     * 取出一个，只能从顶部取
     * @return
     */
    public boolean pop(){
        if(top == 0){
            return false;
        }
        arrays[top] = null;
        top--;
        return true;
    }

    /**
     * 添加一个，放到顶部
     * @param t
     * @return
     */
    public boolean push(T t){
        if(top == max_size-1){
            return false;
        }
        arrays[++top] = t;
        return true;
    }
}

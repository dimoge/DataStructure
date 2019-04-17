import java.util.ArrayList;
import java.util.List;

public class MainTest2 {

    public static void main(String[] args){

            List list = new ArrayList<>();
            list.add(new Person("hello"));
            list.add(new Person("world"));

            List temp = new ArrayList(list.size());
            temp.addAll(list);

            list.remove(0);

            System.gc();
            System.out.println(list.size() + "-" + temp.size());

    }

    public static class Person{
        public String name;

        public Person(String name){
            this.name = name;
        }
    }
}

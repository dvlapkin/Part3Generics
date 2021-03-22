import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("hi");
        list.add("bay");
        list.add("fi");
        list.add("mi");
        Car c = new Car();
        for (Object o:list){
            System.out.println(o+" lenght = "+ ((String)o).length());
        }
    }
}
 class Car{
     @Override
     public String toString() {
         return "Car{}";
     }
 }
/**
 * Main
 */
/**
 * Main
 */
import java.lang.*;
class fruits{    // class create
    String name;
    String color;
    //methods
    void show(){
        System.out.println("Name :"+name);
        System.out.println("Color :"+color);
    }
}
public class Main {

    public static void main(String[] args) {
        fruits apple=new fruits();//object create
        apple.name= "Apple";
        apple.color="red";
        apple.show();
    }
}
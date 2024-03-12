public class Check {
    int a = 90;// Global variable.
    void add(){
        int a = 20;// Local variable.
        System.out.println(a);
    }
    public static void main(String[] args) {
        Check c = new Check();
        c.add();
    }
}

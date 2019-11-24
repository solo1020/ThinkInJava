package ExtendsDemo;

/**
 * @Author quzheng
 * @Date 2019/10/27 18:36
 * @Version 1.0
 */
public class Frog extends Amphibian {

    public Frog(){
        System.out.println("Forg constructor");
    }

    public static void main(String[] args) {
        Frog fg = new Frog();

        Amphibian.run(fg);
    }
}

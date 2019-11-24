package EnumDemo;

/**
 * @Author quzheng
 * @Date 2019/10/26 20:06
 * @Version 1.0
 */
public class Burrito {
    Spiciness degree;

    public Burrito(Spiciness degree){
        this.degree = degree;
    }

    public void describe(){
        System.out.print("This burrito is ");
        switch (degree){
            case NOT:
                System.out.println("not spicy at all");
                break;
            case MILD:
            case MEDIUM:
                System.out.println(" a little hot");
                break;
            case HOT:
            case FLAMING:
            default:
                System.out.println("may be too hot");
        }
    }

    public static void main(String[] args) {
        new Burrito(Spiciness.NOT).describe();
        new Burrito(Spiciness.HOT).describe();
        new Burrito(Spiciness.MEDIUM).describe();

    }
}

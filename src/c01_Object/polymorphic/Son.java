package c01_Object.polymorphic;

/**
 * @ClassName Son
 * @description:
 * @author: isquz
 * @time: 2020/9/10 20:26
 */
public class Son extends Father{

    public String name = "子类属性";

    public static void fatherStaticFunc(){
        System.out.println("子类隐藏(未覆盖) 父类 public static 方法");
    }

    public void fatherFieldFunc(){
        System.out.println("子类重写父类成员方法");
    }

    public Son(){
        this(new String("从子类无参构造器this 调用子类有参构造器："));
//        super(new String("从子类无参构造器super调用父类有参构造器："));
        System.out.println("子类无参构造器...");
    }

    public Son(String s) {
        super(s);
//        super();
        System.out.println("子类有参构造器");
    }

    public static void main(String[] args) {
//        Son s = new Son("string");
        Son s = new Son();
        s.fatherStaticFunc();
        s.fatherFieldFunc();

        Father f = (Father)s;
        f.fatherStaticFunc();
        f.fatherFieldFunc();
        System.out.println("调用的属性：" + f.name);
    }
}

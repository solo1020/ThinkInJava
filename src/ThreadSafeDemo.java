/**
 * 多线程并发访问同一数据资源
 * 3个线程，对一个票资源出售
 */
public class ThreadSafeDemo {
    public static void main(String[] args) {
        Tickets t = new Tickets();
        Thread t0 = new Thread(t);
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t0.start();
        t1.start();
        t2.start();
    }
}

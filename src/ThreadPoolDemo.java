import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 使用工厂类 Executors 中的静态方法创建线程对象，指定线程的个数
 * static ExecutorService newFixedThreadPool(int 个数) 返回线程池对象
 * 返回的是ExecutorService接口的实现类(线程池对象)
 *
 * 接口实现类对象，调用方法submit(Runnable r) 提交线程执行任务
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);

        es.submit(new ThreadPoolRunnable());
        es.submit(new ThreadPoolRunnable());
        es.submit(new ThreadPoolRunnable());
    }
}

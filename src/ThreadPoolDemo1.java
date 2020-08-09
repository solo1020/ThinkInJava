import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 使用多线程技术，求和
 * 两个线程，1个线程计算1+100， 另一个计算1+200的和
 *
 * 实现线程程序的第三个方式，实现Callable接口方式
 * 实现步骤：
 *  工厂类Executors 静态方法 newFixedThreadPool创建线程池对象
 *  线程池对象ExecutorService接口实现类，调用方法submit提交线程任务
 *  submit(Callable c)
 *  
 */
public class ThreadPoolDemo1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es =
                Executors.newFixedThreadPool(2);
        // 提交线程任务方法的submit方法返回Future接口的实现类
        Future<String>f = es.submit(new ThreadPoolCallable());

        System.out.println(f.get());
    }
}

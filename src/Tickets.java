public class Tickets implements Runnable {
    private int ticket = 100;
    @Override
    public void run() {
        while (true){
            if (ticket > 0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+
                        " 出售第 "+ ticket-- + " 张票");
            }
        }
    }
}

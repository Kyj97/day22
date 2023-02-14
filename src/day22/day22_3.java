package day22;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.State.TERMINATED;

public class day22_3 {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        Runnable task = () -> {
            for (int i = 0 ; i < 5 ; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                }
            }
            exec.shutdown();
        };
        exec.execute(task);
        int alpabet = 'a';

        while (exec.isShutdown() != true) {
            System.out.println((char)(alpabet));
            alpabet = alpabet + 1;
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){

            }
            exec.shutdown();

        }

    }

}

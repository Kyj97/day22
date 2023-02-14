package day22;

import static java.lang.Thread.State.TERMINATED;

public class day22_2 {
    public static void main(String[] args) {
        Thread worker = new Thread(( ) -> {
                for (int i = 0 ; i < 5 ; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                    }
                }
            });
        worker.start();
        int alpabet = 'a';

        while (worker.getState() != TERMINATED) {
            System.out.println((char)(alpabet));
            alpabet = alpabet + 1;
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){

            }

        }
    }
}

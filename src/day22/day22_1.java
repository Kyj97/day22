package day22;


import static java.lang.Thread.State.TERMINATED;

class Worker extends Thread {
    public void run() {
        for (int i = 0 ; i < 5 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
            }
        }
    }
}
public class day22_1 {
    public static void main(String[] args) {
        int alpabet = 'a';
        Thread a = new Worker();
        a.start();

        while (a.getState() != TERMINATED) {
            System.out.println((char)(alpabet));
            alpabet = alpabet + 1;
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){

            }

            }
        }
    }


package org.example;

public class MyRunnable1 implements Runnable{
    private int x;

    public MyRunnable1(int x){
        this.x = x;
    }

    @Override
    public void run() {
        if (x > 0) countUp();
        else if(x < 0) countDown();
        else System.exit(0);
    }

    void countUp() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void countDown() {
        for (int i = 19; i >= 0; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

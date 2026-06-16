package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws InterruptedException {
        constructorMethod();


        System.out.println("Welcome to our counting program!");
//        daemonThreads();


        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println(i);
        }
        System.out.println("Goodbye!");
    }

    static void parentThread(){
        MyThread myThread0 = new MyThread();
        MyThread myThread1 = new MyThread();

        myThread0.start();
        myThread1.start();
    }

    static void interfaceRunnable(){
        MyRunnable runnable0    = new MyRunnable();

        Thread thread0          = new Thread(runnable0);
        Thread thread1          = new Thread(runnable0);

        thread0.start();
        thread1.start();
    }

    static void lambdaExpression(){
        Runnable runnable0 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + " from " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread thread0          = new Thread(runnable0);
        Thread thread1          = new Thread(runnable0);

        thread0.start();
        thread1.start();
    }

    static void lam(){
        Runnable runnable0 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " from " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread0 = new Thread(runnable0);
        Thread thread1 = new Thread(runnable0);

        thread0.start();
        thread1.start();
    }

    static void asd() throws InterruptedException {
        Runnable runnable0 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " from " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread0          = new Thread(runnable0);
        Thread thread1          = new Thread(runnable0);

        thread0.start();
        thread1.start();

        thread0.join();
        thread1.join();
    }

    static void daemonThreads(){
        MyRunnable runnable = new MyRunnable();

        Thread thread0 = new Thread(runnable);
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread0.setDaemon(true);
        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread0.start();
        thread1.start();
        thread2.start();
    }

    static void constructorMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a random integer : ");
        int x = scanner.nextInt();
        MyRunnable1 myRunnable1 = new MyRunnable1(x);
        Thread thread = new Thread(myRunnable1);
        thread.start();
    }

}

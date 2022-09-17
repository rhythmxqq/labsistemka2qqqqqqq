package com.company;

public class Main {
    public static void main(String[] args) {

AnimalThread krol = new AnimalThread("кролик");
        AnimalThread _4er = new AnimalThread("черепаха");
        krol.start();
        _4er.start();
    }
}
class AnimalThread extends  Thread{
    int kk;
    int qq;
    String Name;

    AnimalThread(String Name){
        super(Name);
    }
    public void run(){
        for(int i = 0; i <= 10; i++ ) {
            if (kk > 600) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (Thread.currentThread().getName().equalsIgnoreCase("кролик") & kk < 1000) {
                kk += 100;
                System.out.println("Пробежал"  + " кролик  " + kk);
            }
            if (Thread.currentThread().getName().equalsIgnoreCase("черепаха") & qq < 1000) {
                qq += 100;
                System.out.println("Пробежал"  + " черепах " + qq);
            }
        }
    }
}

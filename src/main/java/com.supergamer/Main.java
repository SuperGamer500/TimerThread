package com.supergamer;

public class Main {
    static ProgressClass p1 = new ProgressClass();
    static ProgressClass p2 = new ProgressClass();
    public static void main(String[] args) throws InterruptedException{
       // return;
        System.out.println("Thank you for testing the timer system!\nA 2 timers is about to be set off for 0.25 minutes once they both finish you will be removed from the system");
        Thread.sleep(1250);
        TaskTimer.instance.AddTask(p1, 1000 * 15,(x) -> {p1.progress = x; p1.isDone = x >=1;} );
        System.out.println("Timer 1 is now set");

        Thread.sleep(3750);
        TaskTimer.instance.AddTask(p2, 1000 * 15,(x) -> {p2.progress = x; p2.isDone = x >=1;} );
        System.out.println("Timer 2 is now set");

        while (!p1.GetFinished() || !p2.GetFinished())
        {
            Thread.sleep(1000);
            System.out.println("Timer 1: " + (p1.isDone ? "Done" : "%"+ p1.progress * 100) + " Timer 2: " + (p2.isDone ? "Done" : "%"+ p2.progress * 100));
        }
        System.out.println("Terminating Program");
        TaskTimer.instance.Close();
        EventValue.CloseTasks();
    }

   static class ProgressClass{
         private Boolean isDone = false;
         private  float progress;
         public ProgressClass(){}
         Boolean GetFinished(){return isDone;}
         float GetProgress(){return progress;}

    }
}

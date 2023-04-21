package sg.edu.nus.iss;

public class ThreadExample implements Runnable {

    private String threadName;

    public ThreadExample(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {

        try {
            System.out.println("help me its starting");
            System.out.println("I want to die");
            
        } catch (UnsupportedOperationException uoex) {
            // TODO Auto-generated method stub

            System.out.println("error beep beep");
            System.exit(0);

            ;
        }

    }

}

package exercise;

public class RunnableDemo {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                System.out.println("Before Java 8, too much code for too little to do");
            }
        }).start();

        System.out.println(" ---------------------- ");

        new Thread(()-> System.out.println(" In Java 8 ,Lambda expression rocks !")).start();
    }
}

package pl.sda.recap;

public class Run implements Runnable {

    private final String name;
    private final int numberOfRepeats;

    public Run(String name, int numberOfRepeats) {
        this.name = name;
        this.numberOfRepeats = numberOfRepeats;
    }

    public void run() {
        for (int i = 0; i < numberOfRepeats; i++){
            System.out.println("Hello from thread named " + name);
        }
    }
}

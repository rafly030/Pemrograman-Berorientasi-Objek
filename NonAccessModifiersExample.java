public final class NonAccessModifiersExample {
    public static final double PI = 3.14;
    private static int counter = 0;

    public static void incrementCounter() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        System.out.println("The value of PI is: " + PI);
        incrementCounter();
        System.out.println("Counter value: " + counter);
    }
}
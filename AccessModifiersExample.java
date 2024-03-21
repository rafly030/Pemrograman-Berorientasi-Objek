public class AccessModifiersExample {
    public int publicNumber;
    protected int protectedNumber;
    int defaultNumber;
    @SuppressWarnings("unused")
    private int privateNumber;

    public void publicMethod() {
        System.out.println("This is a public method");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }

    void defautlMethod() {
        System.out.println("This is a default method");
    }

    @SuppressWarnings("unused")
    private void  privateMethod() {
        System.out.println("This is a private method");
    }
}

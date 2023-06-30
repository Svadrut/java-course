package Fortieth;

class Temp implements AutoCloseable {
    public void close() throws Exception {
        System.out.println("Closing!");
        throw new Exception("oh no!");
    }
}

public class Fortieth {
    public static void main(String[] args) {

        try (Temp temp = new Temp()) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package ThirtySeventh;

public class ThirtySeventh {
    public static void main(String[] args) {

        String[] texts = { "one", "two", "three" };

        try {
            System.out.println(texts[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}

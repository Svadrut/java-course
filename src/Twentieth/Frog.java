package Twentieth;

public class Frog {
    private int id;
    private String name;

    public Frog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {

        return String.format("%-4d: %s", id, name);

        // StringBuilder sb = new StringBuilder();
        // sb.append(id).append(": ").append(name);
        // 
        // return sb.toString();
    }

}

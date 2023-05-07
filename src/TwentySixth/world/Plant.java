package TwentySixth.world;

public class Plant {
    // Bad practice
    public String name;

    // Acceptable practice --- it's final
    public final static int ID = 8;

    private String type;

    protected String size;

    int height;

    public Plant() {
        this.name = "freddy";
        this.type = "plant";
        this.size = "medium";
        this.height = 8;
    }
}

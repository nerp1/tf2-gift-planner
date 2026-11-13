public class Hat extends Item {
    private String type;

    public Hat (String name, int price, int classId, String type) {
        super(name, price, classId);
        this.type = type;
    }
}
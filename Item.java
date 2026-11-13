public class Item {

    private String name;
    private int price;
    private int classId; //0 = scout, 1 = soldier, etc

    public Item(String name, int price, int classId) {
        this.name = name;
        this.price = price;
        this.classId = classId;
    }

    public String getName() {
        return name;
    }

   public int getPrice() {
        return price;
   }

   public int getClassId() {return classId;}
}

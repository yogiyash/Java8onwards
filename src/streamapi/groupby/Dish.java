package streamapi;

public class Dish {

    public enum Type {
        MEAT, OTHER, VEG, FRUIT,FISH;
    }

    private String name;
    private Type type;
    private int price;
    private boolean vegOnly;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public boolean isVegOnly() {
        return vegOnly;
    }
    public void setVegOnly(boolean vegOnly) {
        this.vegOnly = vegOnly;
    }
    Dish( String name, boolean vegOnly, int price, Type type){

        this.name = name;
        this.vegOnly = vegOnly;
        this.price = price;
        this.type = type;

    }

}

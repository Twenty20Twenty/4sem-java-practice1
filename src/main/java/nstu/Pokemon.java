package nstu;

public class Pokemon {
    private String name;
    private int height;
    private int id;

    public Pokemon(){
        this.name = "default";
        this.height = 0;
        this.id = 0;
    }

    public Pokemon(String name, int id, int height){
        this.name = name;
        this.height = height;
        this.id = id;
    }

    @Override
    public String toString(){
        String str = new String("Pokemon(name: \"" + name + "\", id: \"" + id + "\", height: \"" + height + "\")");
        return str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

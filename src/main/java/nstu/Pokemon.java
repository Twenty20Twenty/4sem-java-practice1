package nstu;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon {
    @JsonProperty("name")
    private String name;
    @JsonProperty("height")
    private int height;
    @JsonProperty("id")
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

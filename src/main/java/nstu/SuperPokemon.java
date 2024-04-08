package nstu;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SuperPokemon extends Pokemon{
    @JsonProperty("power")
    private int power;

    public SuperPokemon(){
        super();
        this.power = 0;
    }

    public SuperPokemon(String name, int id, int height, int power){
        super(name, id, height);
        this.power = power;
    }

    @Override
    public String toString(){
        String str = new String("SuperPokemon(name: \"" + getName() + "\", id: \"" + getId() + "\", " +
                "height: \"" + getHeight() + "\", power: \"" + power + "\")");
        return str;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}

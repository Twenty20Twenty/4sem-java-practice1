package nstu;

public class SuperPokemon extends Pokemon{
    private int power;

    public SuperPokemon(String name, int id, int height, int power){
        super(name, id, height);
        this.power = power;
    }

    @Override
    public String toString(){
        String str = new String("Pokemon(name: \"" + getName() + "\", id: \"" + getId() + "\", " +
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

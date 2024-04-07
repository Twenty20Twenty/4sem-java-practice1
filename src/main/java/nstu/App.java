package nstu;

import java.io.IOException;
import java.net.URL;


public class App 
{
    public static void main(String[] args ) throws IOException
    {
        URL pikachuUrl = new URL("https://pokeapi.co/api/v2/pokemon/pikachu");
        URL powerUrl = new URL("https://pokeapi.co/api/v2/pokemon/pikachu");

        Pokemon p1 = new Pokemon("p1", 1, 20);
        SuperPokemon sp1 = new SuperPokemon("p1", 1, 20, 95);

        System.out.println(p1.toString());
        System.out.println(sp1.toString());
    }
}

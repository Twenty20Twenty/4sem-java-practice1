package nstu;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.IOException;
import java.net.URL;


public class Main
{
    public static void main(String[] args ) throws IOException
    {
        URL pikachuUrl = new URL("https://pokeapi.co/api/v2/pokemon/pikachu/");
        URL mankeyUrl = new URL("https://pokeapi.co/api/v2/pokemon/mankey/");
        URL powerUrl = new URL("https://pokeapi.co/api/v2/move/5/");

        ObjectMapper objMapper = new ObjectMapper();

        JsonNode jsonNode = objMapper.readTree(powerUrl);
        JsonNode power = jsonNode.path("power");

        SuperPokemon sp1 = new SuperPokemon("p1", 1, 20, 95);
        Pokemon pikachu = objMapper.readValue(pikachuUrl, Pokemon.class);
        SuperPokemon superMankey = objMapper.readValue(mankeyUrl, SuperPokemon.class);
        superMankey.setPower(power.asInt());

        System.out.println(pikachu.toString());
        System.out.println(superMankey.toString());
    }
}

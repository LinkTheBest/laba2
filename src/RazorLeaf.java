import ru.ifmo.se.pokemon.*;

public class RazorLeaf extends PhysicalMove{
    protected RazorLeaf(){
        super(Type.GRASS, 55, 95);
    }
    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {
        if((2.0 * (double) pokemon.getLevel()+5.0) / ((double)pokemon.getLevel() + 5.0) == 0.125){
            pokemon.setMod(Stat.HP, (int)damage *2);
        }
    }
}


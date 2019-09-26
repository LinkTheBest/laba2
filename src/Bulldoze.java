import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
    protected Bulldoze(){
        super(Type.GROUND, 60, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {

        pokemon.setMod(Stat.HP, (int)damage);
    }
}


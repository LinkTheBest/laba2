import ru.ifmo.se.pokemon.*;

public class HydroPump extends SpecialMove {
    protected HydroPump(){
        super(Type.WATER, 110, 80);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {
        pokemon.setMod(Stat.HP, (int)damage );
    }
}


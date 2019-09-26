import ru.ifmo.se.pokemon.*;

public class Pound extends PhysicalMove {
    protected Pound(){
        super(Type.NORMAL, 40, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {
        pokemon.setMod(Stat.HP, (int) damage);
    }
}

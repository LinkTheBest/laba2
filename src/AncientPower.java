import ru.ifmo.se.pokemon.*;

public class AncientPower extends SpecialMove{
    protected AncientPower(){
        super(Type.ROCK, 60,  100);
    }

    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.1){
            pokemon.setMod(Stat.ATTACK,  6);
            pokemon.setMod(Stat.DEFENSE,  6);
            pokemon.setMod(Stat.SPECIAL_ATTACK, 6);
            pokemon.setMod(Stat.SPECIAL_DEFENSE, 6);
            pokemon.setMod(Stat.SPEED, 6);

        }
    }
}

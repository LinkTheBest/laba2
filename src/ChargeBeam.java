import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove{
    protected ChargeBeam(){
        super(Type.ELECTRIC, 50, 90);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if(Math.random() <= 0.7){
            pokemon.setMod(Stat.SPECIAL_ATTACK, 1);
        }
    }

}


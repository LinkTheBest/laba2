import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove{
    protected ChargeBeam(){
        super(Type.ELECTRIC, 50, 90);
    }

    protected void applyOppEffects(Pokemon pokemon, double v) {
        if(Math.random() <= 0.7){

        }

    }
}

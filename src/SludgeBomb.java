import ru.ifmo.se.pokemon.*;

public class SludgeBomb extends SpecialMove{
    protected SludgeBomb(){
        super(Type.POISON, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.3){
            Effect.poison(pokemon);
        }
    }
}

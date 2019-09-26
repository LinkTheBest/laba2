import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove{
    protected Rest(){
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect.sleep(pokemon);


    }
}

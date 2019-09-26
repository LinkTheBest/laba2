import ru.ifmo.se.pokemon.*;

public class PlayNice extends StatusMove{
    protected PlayNice(){
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK, -1);
    }
}

import ru.ifmo.se.pokemon.*;

class PoisonGas extends StatusMove {
    protected PoisonGas(){
        super(Type.POISON, 0, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.poison(pokemon);
        pokemon.setMod(Stat.HP, - (int)( pokemon.getHP() / 8.0));
    }
}

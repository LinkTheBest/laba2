import ru.ifmo.se.pokemon.*;

public class DoubleSlap extends PhysicalMove{

    Double[] percents = {0.125, 0.375, 0.125, 0.375};

    protected DoubleSlap(){
        super(Type.NORMAL, 15, 85);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {

        int number = (int )Math.round(Math.random() * 3);

        switch (number){
            case 0:
                pokemon.setMod(Stat.HP, (int) damage );
                pokemon.setMod(Stat.HP, (int) damage );
                pokemon.setMod(Stat.HP, (int) damage );
                pokemon.setMod(Stat.HP, (int) damage );
                break;
            case 1:
                pokemon.setMod(Stat.HP, (int) damage );
                pokemon.setMod(Stat.HP, (int) damage );
                break;
            case 2:
                pokemon.setMod(Stat.HP, (int) damage );
                pokemon.setMod(Stat.HP, (int) damage );
                pokemon.setMod(Stat.HP, (int) damage );
                pokemon.setMod(Stat.HP, (int) damage );
                pokemon.setMod(Stat.HP, (int) damage );
            case 3:
                pokemon.setMod(Stat.HP, (int) damage );
                pokemon.setMod(Stat.HP, (int) damage );
                pokemon.setMod(Stat.HP, (int) damage );
        }

    }
}

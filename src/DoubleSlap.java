import ru.ifmo.se.pokemon.*;

public class DoubleSlap extends PhysicalMove {

    Double[] percents = {0.125, 0.375, 0.125, 0.375};
    int[] num = {4, 2, 5, 3};

    protected DoubleSlap() {
        super(Type.NORMAL, 15, 85);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {

        int number = (int) Math.round(Math.random() * 3);

        switch (number) {
            case 0:
                for (int i = 0; i < num[number]; i++) {
                    pokemon.setMod(Stat.HP, (int) damage);
                }
                break;
            case 1:
                for (int i = 0; i < num[number]; i++) {
                    pokemon.setMod(Stat.HP, (int) damage);
                }
                break;
            case 2:
                for (int i = 0; i < num[number]; i++) {
                    pokemon.setMod(Stat.HP, (int) damage);
                }
                break;
            case 3:
                for (int i = 0; i < num[number]; i++) {
                    pokemon.setMod(Stat.HP, (int) damage);
                }
        }

    }
}

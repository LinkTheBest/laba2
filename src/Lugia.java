import ru.ifmo.se.pokemon.*;

public class Lugia extends Pokemon {

    public Lugia(String name, int level){
        super(name, level);
        setStats(106, 90, 130,90, 154, 110);
        setType(Type.FIGHTING, Type.FLYING );
        setMove(new Bulldoze(), new ChargeBeam(), new AncientPower(), new HydroPump());


    }
}

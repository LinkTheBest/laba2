import ru.ifmo.se.pokemon.Type;

public class Tsareena extends Steenee{
    public Tsareena(String name, int level){
        super(name, level);
        setStats(72, 120, 98,50,98, 72);
        setType(Type.GRASS);
        setMove(new RazorLeaf(), new Rest(), new PlayNice(), new DoubleSlap());
    }
}

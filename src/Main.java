import ru.ifmo.se.pokemon.*;
public class Main {

    public static void main(String[] args) {

         Battle battle_field = new Battle();
         battle_field.addAlly(new Lugia("Первый", 2));
         battle_field.addAlly(new Gulpin("Второй", 2));
         battle_field.addAlly(new Swalot("Третий", 2));
         battle_field.addFoe(new Bounsweet("Четвертый", 2));
         battle_field.addFoe(new Steenee("Пятый", 2));
         battle_field.addFoe(new Tsareena("Шестой", 2));
         battle_field.go();



    }
}

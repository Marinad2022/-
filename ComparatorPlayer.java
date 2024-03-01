import java.util.Comparator;

public class ComparatorPlayer implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {

        return o1.getName().compareToIgnoreCase(o2.getName()); // сортировка по имени
        //return -Integer.compare(o1.getPlayer(), o2.getPlayer()); // сортировка по очкам по убыванию
    }
}

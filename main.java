import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Basa> Kino = new ArrayList<>(List.of(new Basa(2, 3, 4), new Basa(5, 6, 7), new Basa(4, 9, 1)));
        Kino.sort((o1, o2) -> o1.a * o1.b * o1.c - o2.a * o2.b * o2.c);
        for (Basa basa : Kino) {
            System.out.println(basa);
        }

    }
}

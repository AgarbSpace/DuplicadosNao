import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        List<String> firstArray = new ArrayList<>();
        List<String> secondArray = new ArrayList<>();
        List<String> commonItens = new ArrayList<>();
        
        firstArray.add("Morango");
        firstArray.add("Uva");
        firstArray.add("Acerola");
        firstArray.add("Manga");

        secondArray.add("Pêra");
        secondArray.add("Caju");
        secondArray.add("Morango");
        secondArray.add("Kiwi");

        for (int i = 0; i < firstArray.size(); i++) {
            for (int j = 0; j < secondArray.size(); j++) {
                if (Objects.equals(firstArray.get(i), secondArray.get(j))) {
                    commonItens.add(firstArray.get(i));
                }
            }
        }

        System.out.println(commonItens);
    }
}

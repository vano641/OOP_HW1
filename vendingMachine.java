import java.util.List;

public interface vendingMachine {

    List<hotDrink> initDrinks();

    void getInfo(String name, Integer volume, Integer temperature);

}

import java.util.ArrayList;
import java.util.List;

public class hotDrinkMachine implements vendingMachine{

    static List<hotDrink> DL;

    public hotDrinkMachine() {
        hotDrinkMachine.DL = initDrinks();
    }

    public List<hotDrink> initDrinks() {
    List<hotDrink> drinkList = new ArrayList<>();
        drinkList.add(new hotDrink("Кофе", 1,90));
        drinkList.add(new hotDrink("Чай", 2,85));
        drinkList.add(new hotDrink("Бульон", 1,95));
        return drinkList;
    }

    public void getDL() {
        System.out.println(DL);
    }

    public void getInfo(String name, Integer volume, Integer temperature){
        int count = 0;
        for (hotDrink i : DL) {
            if (i.getName().equals(name) && i.getVolume().equals(volume) && i.getTemperature().equals(temperature)){
            System.out.println(i);
            count++;
            }
        }
        if (count == 0) {
            System.out.println("Напиток с введенными параметрами не найден");
        }
    }
}

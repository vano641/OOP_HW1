/**
 * hotDrink
 */
public class hotDrink extends drink{

    protected Integer temperature;

    public hotDrink(String name, Integer volume, Integer temperature) {
        super(name, volume);
        this.temperature = temperature;
    }


    public Integer getTemperature() {
        return this.temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return String.format("name: %s => volume: %d => temperature: %d", name, volume, temperature);
    }

    
}

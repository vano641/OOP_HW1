public class drink {
    
    protected String name;
    protected Integer volume;


    public drink(String name, Integer volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVolume() {
        return this.volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("name: %s => price: %d", name, volume);
    }

}

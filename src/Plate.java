public class Plate {
    private int volume = 95;

    public void fodDecrease(int hunger) {
        this.volume -= hunger;
        System.out.println("Оставшийся корм: " + this.volume);
    }
    public int plateVolume() {
        return this.volume;
    }
    public void addFood(int foodAmount) {
        this.volume += foodAmount;
        System.out.println("Оставшийся корм: " + this.volume);
    }
}

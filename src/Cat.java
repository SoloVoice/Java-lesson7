public class Cat {
    private int hunger = 10;
    private boolean full = false;

    public void feedCat(Plate plate) {
        if (plate.plateVolume() >= hunger) {
            System.out.println("Кот успешно накормлен.");
            plate.fodDecrease(hunger);
            this.full = true;
            System.out.println("Кот сыт? " + full);
            System.out.println();
        } else {
            System.out.println("Еды не хватило");
            System.out.println("Кот сыт? " + full);
            System.out.println();
        }
    }
}

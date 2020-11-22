public class lesson7 {
    public static void main(String[] args) {
        Plate plate = new Plate();
        Cat[] cats = new Cat[10];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
            cats[i].feedCat(plate);
        }
        plate.addFood(100);
    }
}

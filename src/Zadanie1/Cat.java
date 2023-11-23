public class Cat extends Animal {
    private static int catCount;
    private boolean isFull = false;

    public Cat() {
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    public boolean isFull() {
        return isFull;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println("Кот пробежал " + distance + " м.");
        } else {
            System.out.println("Кот не может пробежать такую длину");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать");
    }


    public void eat(Dish dish, int foodAmount) {
        if (dish.decreaseFood(foodAmount)) {
            isFull = true;
            System.out.println("Кот поел и наелся");
        } else {
            System.out.println("В миске недостаточно еды");
        }
    }
}
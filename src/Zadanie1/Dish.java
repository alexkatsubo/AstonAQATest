public class Dish {
    private int food;

    public Dish(int food) {
        if (food >= 0) {
            this.food = food;
        } else {
            this.food = 0;
        }
    }

    public boolean decreaseFood(int amount) {
        if (food - amount >= 0) {
            food -= amount;
            return true;
        } else {
            return false;
        }
    }

    public void addFood(int amount) {
        if (amount >= 0) {
            food += amount;
        } else {
            System.out.println("Количество еды должно быть неотрицательным");
        }
    }
}



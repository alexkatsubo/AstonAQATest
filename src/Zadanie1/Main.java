public class Main {
    public static void main(String[] args) {
        Dog bobik = new Dog();
        Dog butch = new Dog();
        Dog rex = new Dog();

        Cat kesha = new Cat();
        Cat pushok = new Cat();
        Cat barsik = new Cat();

        System.out.println("Результаты бега и плавания собак:");
        bobik.run(300);
        butch.swim(5);
        rex.run(400);
        rex.swim(15);

        System.out.println("Результаты бега и плавания котов:");
        kesha.run(150);
        pushok.swim(10);
        barsik.run(250);
        barsik.swim(5);

        System.out.println("Количество животных: " + Animal.getAnimalCount());
        System.out.println("Количество собак: " + Dog.getDogCount());
        System.out.println("Количество котов: " + Cat.getCatCount());

        System.out.println("Определение сытости котов: ");

        Cat[] cats = new Cat[3];
        Dish dish = new Dish(20);

        cats[0] = new Cat();
        cats[1] = new Cat();
        cats[2] = new Cat();

        cats[0].eat(dish, 10);
        cats[2].eat(dish, 3);

        for (int i = 0; i < cats.length; i++) {
            System.out.print("Кот " + (i + 1) + " сыт: ");
            if (cats[i].isFull()) {
                System.out.println("да");
            } else {
                System.out.println("нет");
            }
        }

        dish.addFood(10);
    }

}



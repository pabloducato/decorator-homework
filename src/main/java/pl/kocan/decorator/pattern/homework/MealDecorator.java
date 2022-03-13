package pl.kocan.decorator.pattern.homework;

public abstract class MealDecorator extends Meal {

    Meal meal;

    public MealDecorator(Meal meal) {
        this.meal = meal;
    }

    @Override
    public void prepareMeal() {
        this.meal.prepareMeal();
    }
}

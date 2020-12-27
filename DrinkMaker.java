public abstract class DrinkMaker {
    public void makeDrink(){
        getRightCup();
        addIngredients();
        pour();
    }
    public abstract void getRightCup();
    public abstract void addIngredients();
    public abstract void pour();
}


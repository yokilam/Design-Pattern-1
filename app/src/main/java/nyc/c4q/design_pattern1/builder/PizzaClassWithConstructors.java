package nyc.c4q.design_pattern1.builder;

/**
 * Created by yokilam on 1/7/18.
 */

public class PizzaClassWithConstructors {

    private boolean tomatoSauce;
    private boolean cheese;
    private int diameter;
    private boolean pepperoni;
    private boolean onions;
    private boolean olives;
    private boolean arugula;
    private boolean artichokes;
    private boolean anchovies;

    public PizzaClassWithConstructors(boolean tomatoSauce) {
        this.tomatoSauce = tomatoSauce;
    }

    public PizzaClassWithConstructors(boolean tomatoSauce, boolean cheese) {
        this.tomatoSauce = tomatoSauce;
        this.cheese = cheese;
    }

    public PizzaClassWithConstructors(boolean tomatoSauce, boolean cheese, int diameter) {
        this.tomatoSauce = tomatoSauce;
        this.cheese = cheese;
        this.diameter = diameter;
    }

    public PizzaClassWithConstructors(boolean tomatoSauce, boolean cheese, int diameter, boolean pepperoni) {
        this.tomatoSauce = tomatoSauce;
        this.cheese = cheese;
        this.diameter = diameter;
        this.pepperoni = pepperoni;
    }

    public PizzaClassWithConstructors(boolean tomatoSauce, boolean cheese, int diameter, boolean pepperoni, boolean onions) {
        this.tomatoSauce = tomatoSauce;
        this.cheese = cheese;
        this.diameter = diameter;
        this.pepperoni = pepperoni;
        this.onions = onions;
    }

    public PizzaClassWithConstructors(boolean tomatoSauce, boolean cheese, int diameter, boolean pepperoni, boolean onions, boolean olives) {
        this.tomatoSauce = tomatoSauce;
        this.cheese = cheese;
        this.diameter = diameter;
        this.pepperoni = pepperoni;
        this.onions = onions;
        this.olives = olives;
    }

    public PizzaClassWithConstructors(boolean tomatoSauce, boolean cheese, int diameter, boolean pepperoni, boolean onions, boolean olives, boolean arugula) {
        this.tomatoSauce = tomatoSauce;
        this.cheese = cheese;
        this.diameter = diameter;
        this.pepperoni = pepperoni;
        this.onions = onions;
        this.olives = olives;
        this.arugula = arugula;
    }

    public PizzaClassWithConstructors(boolean tomatoSauce, boolean cheese, int diameter, boolean pepperoni, boolean onions, boolean olives, boolean arugula, boolean artichokes) {
        this.tomatoSauce = tomatoSauce;
        this.cheese = cheese;
        this.diameter = diameter;
        this.pepperoni = pepperoni;
        this.onions = onions;
        this.olives = olives;
        this.arugula = arugula;
        this.artichokes = artichokes;
    }

    public PizzaClassWithConstructors(boolean tomatoSauce, boolean cheese, int diameter, boolean pepperoni, boolean onions, boolean olives, boolean arugula, boolean artichokes, boolean anchovies) {
        this.tomatoSauce = tomatoSauce;
        this.cheese = cheese;
        this.diameter = diameter;
        this.pepperoni = pepperoni;
        this.onions = onions;
        this.olives = olives;
        this.arugula = arugula;
        this.artichokes = artichokes;
        this.anchovies = anchovies;
    }

    public boolean isTomatoSauce() {
        return tomatoSauce;
    }

    public void setTomatoSauce(boolean tomatoSauce) {
        this.tomatoSauce = tomatoSauce;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
    }

    public boolean isOnions() {
        return onions;
    }

    public void setOnions(boolean onions) {
        this.onions = onions;
    }

    public boolean isOlives() {
        return olives;
    }

    public void setOlives(boolean olives) {
        this.olives = olives;
    }

    public boolean isArugula() {
        return arugula;
    }

    public void setArugula(boolean arugula) {
        this.arugula = arugula;
    }

    public boolean isArtichokes() {
        return artichokes;
    }

    public void setArtichokes(boolean artichokes) {
        this.artichokes = artichokes;
    }

    public boolean isAnchovies() {
        return anchovies;
    }

    public void setAnchovies(boolean anchovies) {
        this.anchovies = anchovies;
    }


}

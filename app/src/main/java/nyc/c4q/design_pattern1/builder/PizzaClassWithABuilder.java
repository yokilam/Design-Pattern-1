package nyc.c4q.design_pattern1.builder;

/**
 * Created by yokilam on 1/7/18.
 */

public class PizzaClassWithABuilder {
    private boolean tomatoSauce;
    private boolean cheese;
    private int diameter;
    private boolean pepperoni;
    private boolean onions;
    private boolean olives;
    private boolean arugula;
    private boolean artichokes;
    private boolean anchoves;

    private PizzaClassWithABuilder(boolean tomatoSauce, boolean cheese, int diameter, boolean pepperoni, boolean onions, boolean olives, boolean arugula, boolean artichokes, boolean anchoves) {
        this.tomatoSauce = tomatoSauce;
        this.cheese = cheese;
        this.diameter = diameter;
        this.pepperoni = pepperoni;
        this.onions = onions;
        this.olives = olives;
        this.arugula = arugula;
        this.artichokes = artichokes;
        this.anchoves = anchoves;
    }

    public static class PizzaBuilder {
        private boolean tomatoSauce;
        private boolean cheese;
        private int diameter;
        private boolean pepperoni;
        private boolean onions;
        private boolean olives;
        private boolean arugula;
        private boolean artichokes;
        private boolean anchoves;

        public PizzaBuilder(boolean tomatoSauce, boolean cheese, int diameter) {
            this.tomatoSauce = tomatoSauce;
            this.cheese = cheese;
            this.diameter = diameter;
        }

        public PizzaBuilder setTomatoSauce(boolean tomatoSauce) {
            this.tomatoSauce = tomatoSauce;
            return this;
        }

        public PizzaBuilder setCheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder setDiameter(int diameter) {
            this.diameter = diameter;
            return this;
        }

        public PizzaBuilder setPepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public PizzaBuilder setOnions(boolean onions) {
            this.onions = onions;
            return this;
        }

        public PizzaBuilder setOlives(boolean olives) {
            this.olives = olives;
            return this;
        }

        public PizzaBuilder setArugula(boolean arugula) {
            this.arugula = arugula;
            return this;
        }

        public PizzaBuilder setArtichokes(boolean artichokes) {
            this.artichokes = artichokes;
            return this;
        }

        public PizzaBuilder setAnchoves(boolean anchoves) {
            this.anchoves = anchoves;
            return this;
        }

        //Method that returns the actual Pizza object:
        public PizzaClassWithABuilder build(){
            return new PizzaClassWithABuilder(
                    tomatoSauce,
                    cheese,
                    diameter,
                    pepperoni,
                    onions,
                    olives,
                    arugula,
                    artichokes,
                    anchoves);
        }
    }

}

package nyc.c4q.design_pattern1.builder;

/**
 * Created by yokilam on 1/7/18.
 */

public class Sandwich {
    private String bread;
    private String cheese;
    private String meat;
    private String dressing;
    private String greens;
    private String veggies;
    private boolean isHot;

    private Sandwich(String bread, String cheese, String meat, String dressing, String greens, String veggies, boolean isHot) {
        this.bread = bread;
        this.cheese = cheese;
        this.meat = meat;
        this.dressing = dressing;
        this.greens = greens;
        this.veggies = veggies;
        this.isHot = isHot;
    }

    public String getBread() {
        return bread;
    }

    public String getCheese() {
        return cheese;
    }

    public String getMeat() {
        return meat;
    }

    public String getDressing() {
        return dressing;
    }

    public String getGreens() {
        return greens;
    }

    public String getVeggies() {
        return veggies;
    }

    public boolean isHot() {
        return isHot;
    }

    public static class SandwhichBulder {
        private String bread;
        private String cheese;
        private String meat;
        private String dressing;
        private String greens;
        private String veggies;
        private boolean isHot;

        public SandwhichBulder() {
        }

        public SandwhichBulder setBread(String bread) {
            this.bread = bread;
            return this;
        }

        public SandwhichBulder setCheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public SandwhichBulder setMeat(String meat) {
            this.meat = meat;
            return this;
        }

        public SandwhichBulder setDressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public SandwhichBulder setGreens(String greens) {
            this.greens = greens;
            return this;
        }

        public SandwhichBulder setVeggies(String veggies) {
            this.veggies = veggies;
            return this;
        }

        public SandwhichBulder setHot(boolean hot) {
            isHot = hot;
            return this;
        }

        //it will return an instance of the outer class
        public Sandwich build(){
            return new Sandwich(bread,cheese, meat,dressing, greens, veggies, isHot);
        }

    }
}

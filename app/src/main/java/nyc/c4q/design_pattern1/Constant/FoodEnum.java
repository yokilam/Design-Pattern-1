package nyc.c4q.design_pattern1.Constant;

/**
 * Created by yokilam on 1/7/18.
 */

public enum FoodEnum {
    CHINESE("Eat fry rice!"),
    ITALIAN("Eat some pasta!"),
    JAPANESE("Eat sushi!"),
    SNACKS("Have some snacks!"),
    AMERICAN("Have some steak!");

    private String text;

    FoodEnum(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}

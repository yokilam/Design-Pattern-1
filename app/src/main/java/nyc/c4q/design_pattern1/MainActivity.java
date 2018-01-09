package nyc.c4q.design_pattern1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import nyc.c4q.design_pattern1.Constant.FoodEnum;
import static nyc.c4q.design_pattern1.Constant.FoodEnum.*;
import nyc.c4q.design_pattern1.Constant.WeatherEnum;
import nyc.c4q.design_pattern1.builder.PizzaClassWithABuilder;
import nyc.c4q.design_pattern1.builder.Sandwich;
import nyc.c4q.design_pattern1.static_factor_methods.PizzaParty;

import static nyc.c4q.design_pattern1.Constant.WeatherEnum.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //need to import static, if not u have to import regularly
        //for static import take the same import, add static, and add * at the end
        WeatherEnum weatherEnum= RAINY;
        Loggy(whatShouldIWear(weatherEnum));

        LogFood(whatShouldIEat(FoodEnum.AMERICAN));
//        LogFood(whatShouldIEat(JAPANESE));

        //Able to use toString because in the enum class we override toString that return the text.
        LogFood(FoodEnum.JAPANESE.name() + ": " + JAPANESE.toString());

        FoodEnum[] stuff = FoodEnum.values();

        Log.d("_____________", "onCreate: " + stuff);

        //-----------Static Factor Methods------------------------
        //They are not required to create a new object each time they're invoked, (Instance-Controlled) avoid creating unncecessary duplicate objects
        //Also improves performance
        //Can return an object of any subtype of their return type.
        PizzaParty pizzaParty01= PizzaParty.getInstance();
        PizzaParty pizzaParty02= PizzaParty.getInstance();

        Boolean sameParty= pizzaParty01.equals(pizzaParty02);
        //false because both of them is in the different memory, two different instances (if we return new pizzaPartyInstance in our class)
        LogSomething(Boolean.toString(sameParty));

        LogSomething("Are they in the same memory" + pizzaParty01 + " " + pizzaParty02);


//      ------------BUILDER -------------------------
        PizzaClassWithABuilder pizza = new PizzaClassWithABuilder
                .PizzaBuilder(true, true, 12)
                .setArugula(true)
                .setPepperoni(true)
                .build();

        Sandwich sandwich= new Sandwich.SandwhichBulder()
                .setBread("Whole Wheat")
                .setMeat("Ham")
                .setCheese("Cheddar")
                .setDressing("Mayo/Ketchup")
                .setHot(false)
                .build();

        //more robust
        Sandwich.SandwhichBulder newSandwhich= new Sandwich.SandwhichBulder();
        newSandwhich.setGreens("Lettuce");
        Sandwich finalSanwhich= newSandwhich.build();

        LogSomething("We have a " + sandwich.getMeat() + " and " + sandwich.getCheese() + "sandwich on " + sandwich.getBread());

    }

    public void LogSomething(String input){
        Log.d("LOG SOMETHING", input);
    }

    public void Loggy(String input){
        Log.d("What should I wear? ", input);
    }
    public void LogFood(String input){
        Log.d("What should I eat? ", input);
    }

    public String whatShouldIWear(WeatherEnum currentWeather){
        String result= "";
        switch (currentWeather){
            case SUNNY:
                result= "Wear Sunglasses!";
                break;
            case RAINY:
                result= "Bring an Umbrella";
                break;
            case CLOUDY:
                result=  "Wear a Jacket!";
                break;
            case SNOWY:
                result= "Wear a SnowBoot!";
                break;
            case WINDY:
                result= "Wear a Wind Jacket";
                break;
            case UNKNOWN:
                result= "I dont know what to wear! AHHH!";
                break;
        }
        return result;
    }

    public String whatShouldIEat(FoodEnum typeOfFood){
        String result= "";
        switch (typeOfFood){
            case CHINESE:
                result = "Eat fry rice!";
                break;
            case ITALIAN:
                result = "Eat pasta!";
                break;
            case AMERICAN:
                result= "Eat Steak!";
                break;
            case JAPANESE:
                result = "Eat sushi!!";
                break;
            case SNACKS:
                result= "Just have some snacks!";
                break;

        }
        return result;
    }
}

package nyc.c4q.design_pattern1.static_factor_methods;

/**
 * Created by yokilam on 1/7/18.
 */

public class PizzaParty {

    private static PizzaParty pizzaPartyInstance;

    private PizzaParty(){

    }

    public static PizzaParty getInstance(){
        if (pizzaPartyInstance!= null) {
//            return only one Instance
            return pizzaPartyInstance;
        }
        pizzaPartyInstance = new PizzaParty();
        return pizzaPartyInstance;
        //can have more than one Instance
//        return new PizzaParty();
    }
}

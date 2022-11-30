public class NyPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
        	if (item.equals("cheese")) {
            		return new NYStyleCheesePizza();
        	} else return null;
	}
}
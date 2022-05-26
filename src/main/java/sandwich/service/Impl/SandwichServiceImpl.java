package sandwich.service.Impl;

import sandwich.model.Sandwich;
import sandwich.service.SandwichService;

import java.util.ArrayList;

public class SandwichServiceImpl implements SandwichService {
    @Override
    public ArrayList<String> getSelectedCondiments(Sandwich sandwich) {
        ArrayList<String> condiments = new ArrayList<>();
        if (sandwich.getLettuce() > 0) {
            condiments.add("Lettuce");
        }
        if (sandwich.getTomato() > 0) {
            condiments.add("Tomato");
        }
        if (sandwich.getMustard() > 0) {
            condiments.add("Mustard");
        }
        if (sandwich.getSprouts() > 0) {
            condiments.add("Sprouts");
        }
        return condiments;
    }
}


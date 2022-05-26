package sandwich.service;

import sandwich.model.Sandwich;

import java.util.ArrayList;

public interface SandwichService {
    ArrayList<String> getSelectedCondiments(Sandwich sandwich) ;
}

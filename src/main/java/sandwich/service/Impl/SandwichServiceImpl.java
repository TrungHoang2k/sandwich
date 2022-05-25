package sandwich.service.Impl;


import sandwich.model.Sandwich;
import sandwich.service.SandwichService;

public class SandwichServiceImpl implements SandwichService {
    @Override
    public Sandwich makeSandwich(Long lettuce, Long tomato, Long mustard, Long sprouts){
        Sandwich sandwich = new Sandwich(lettuce,tomato,mustard,sprouts);
        return sandwich;
    }
}

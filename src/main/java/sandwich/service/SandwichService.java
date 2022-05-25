package sandwich.service;

import sandwich.model.Sandwich;

public interface SandwichService {
    Sandwich makeSandwich(Long lettuce, Long tomato, Long mustard, Long sprouts);
}

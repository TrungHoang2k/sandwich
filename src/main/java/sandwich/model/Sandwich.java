package sandwich.model;

public class Sandwich implements Cloneable {
    private Long lettuce;
    private Long tomato;
    private Long mustard;
    private Long sprouts;

    public Sandwich() {
    }

    public Sandwich(Long lettuce, Long tomato, Long mustard, Long sprouts) {
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.mustard = mustard;
        this.sprouts = sprouts;
    }

    public Long getLettuce() {
        return lettuce;
    }

    public void setLettuce(Long lettuce) {
        this.lettuce = lettuce;
    }

    public Long getTomato() {
        return tomato;
    }

    public void setTomato(Long tomato) {
        this.tomato = tomato;
    }

    public Long getMustard() {
        return mustard;
    }

    public void setMustard(Long mustard) {
        this.mustard = mustard;
    }

    public Long getSprouts() {
        return sprouts;
    }

    public void setSprouts(Long sprouts) {
        this.sprouts = sprouts;
    }
}


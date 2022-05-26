package sandwich.model;

public class Sandwich implements Cloneable {
    private Integer lettuce;
    private Integer tomato;
    private Integer mustard;
    private Integer sprouts;

    public Sandwich() {
    }

    public Sandwich(Integer lettuce, Integer tomato, Integer mustard, Integer sprouts) {
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.mustard = mustard;
        this.sprouts = sprouts;
    }

    public Integer getLettuce() {
        return lettuce;
    }

    public void setLettuce(Integer lettuce) {
        this.lettuce = lettuce;
    }

    public Integer getTomato() {
        return tomato;
    }

    public void setTomato(Integer tomato) {
        this.tomato = tomato;
    }

    public Integer getMustard() {
        return mustard;
    }

    public void setMustard(Integer mustard) {
        this.mustard = mustard;
    }

    public Integer getSprouts() {
        return sprouts;
    }

    public void setSprouts(Integer sprouts) {
        this.sprouts = sprouts;
    }
}


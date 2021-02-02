package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements IReviewed, ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public int getRating(){
        return 5;
    }

    public String getName(){
        return "Bumper Cars";
    }

    public double defaultPrice(){
        return 4.5;
    }


    public double priceFor(Visitor visitor) {
        if (visitor == null){
            return 0.0;
        }
        if (visitor.getAge() < 12) {
            return (defaultPrice() / 2);
        }
        return defaultPrice();
    }

}

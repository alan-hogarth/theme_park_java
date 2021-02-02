package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, IReviewed, ITicketed {



    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getHeight() >= 145 && visitor.getAge() > 12){
            return true;
        }
        return false;
    }

    public int getRating(){
        return 10;
    }

    public String getName(){
        return "Blue Ridge";
    }

    public double defaultPrice(){
            return 8.4;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor == null){
            return 0.0;
        }
        if (visitor.getHeight() > 200) {
            return (defaultPrice() * 2);
        }
        return defaultPrice();    }


}

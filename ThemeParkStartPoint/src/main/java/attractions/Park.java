package attractions;

import behaviours.IReviewed;

public class Park extends Attraction implements IReviewed {

    public Park(String name, int rating) {
        super(name, rating);
    }


    public int getRating(){
        return 9;
    }

    public String getName(){
        return "Leafy Meadows";
    }
}

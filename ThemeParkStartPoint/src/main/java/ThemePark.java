
import attractions.Attraction;
import behaviours.IReviewed;
import stalls.Stall;


import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;


    public ThemePark(ArrayList<Attraction> attractions, ArrayList<Stall> stalls){
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<Stall>();
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public void setAttractions(ArrayList<Attraction> attractions) {
        this.attractions = attractions;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public void setStalls(ArrayList<Stall> stalls) {
        this.stalls = stalls;
    }

    public ArrayList<IReviewed> getAllReviewed(){
        ArrayList<IReviewed> reviews = new ArrayList<>();
        for (Attraction reviewed : attractions){
            reviews.add((IReviewed) reviewed);
        }
        for (Stall reviewed : stalls){
            reviews.add((IReviewed) reviewed);
        }
            return reviews;
    }

}

package strategy;

import user.User;

import java.util.List;

public class DistanceStrategy implements MatchStrategy {

    @Override
    public User findMatch(User me, List<User> others) {

        double distance = 0;
        double minDistance = Double.MAX_VALUE;
        User matchUser = null;
        int xMe = me.getLocation().charAt(1);
        int yMe = me.getLocation().charAt(3);
        int xOther;
        int yOther;
        for (User other : others) {
            if (other.getId() == me.getId()) {
                continue;
            }
            xOther = other.getLocation().charAt(1);
            yOther = other.getLocation().charAt(3);

            distance = Math.sqrt(Math.pow(xMe - xOther, 2) + Math.pow(yMe - yOther, 2));
            System.out.println("distance: "+ distance);
            if (distance < minDistance) {
                minDistance = distance;
                matchUser = other;
            }
        }


        return matchUser;
    }
}

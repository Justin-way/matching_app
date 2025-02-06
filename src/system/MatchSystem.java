package system;

import strategy.MatchStrategy;
import user.User;

import java.util.List;

public class MatchSystem {

    private MatchStrategy strategy;

    public MatchSystem(MatchStrategy strategy) {
        this.strategy = strategy;
    }


    public User getPerson(User user, List<User> others) {
        if (strategy == null) {
            throw new IllegalStateException("Matchmaking strategy is not set.");
        }
        return strategy.findMatch(user, others);
    }


}

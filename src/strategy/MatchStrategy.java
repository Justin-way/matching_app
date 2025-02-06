package strategy;

import user.User;

import java.util.List;

public interface MatchStrategy {

    public User findMatch(User user, List<User> users);
}

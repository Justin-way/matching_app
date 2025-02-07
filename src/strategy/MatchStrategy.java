package strategy;

import java.util.List;

import user.User;

public interface MatchStrategy {


	public User findMatch(User user, List<User> users);

	public double getScore(User user, User other);
}

package system;

import java.util.List;

import strategy.MatchStrategy;
import user.User;

public class MatchSystem {

	private MatchStrategy strategy;

	public MatchSystem(MatchStrategy strategy) {
		this.strategy = strategy;
	}


	public User getPerson(User user, List<User> others) {
		if (strategy == null) {
			throw new IllegalStateException("Match strategy is not set.");
		}
		return strategy.findMatch(user, others);
	}


}

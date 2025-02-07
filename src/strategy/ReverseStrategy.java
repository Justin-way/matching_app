package strategy;

import java.util.List;

import user.User;

public class ReverseStrategy implements MatchStrategy {

	private final MatchStrategy strategy;

	public ReverseStrategy(MatchStrategy strategy) {
		this.strategy = strategy;
	}

	@Override
	public User findMatch(User user, List<User> users) {
		User worstMatch = null;
		double minScore = Double.MAX_VALUE;

		for (User other : users) {
			if (other.getId() == user.getId()) {
				continue;
			}

			double score = strategy.getScore(user, other);

			if (score < minScore) {
				minScore = score;
				worstMatch = other;
			}
		}


		return worstMatch;

	}

}



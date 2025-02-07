package strategy;

import java.util.List;

import user.User;

public class InterestStrategy implements MatchStrategy {

	User matchUser = null;

	@Override
	public User findMatch(User user, List<User> users) {


		double maxScore = -1;

		for (User other : users) {

			if (other.getId() == user.getId()) {
				continue;
			}

			double score = getScore(user, other);

			if (score > maxScore) {
				maxScore = score;
				matchUser = other;
			}

		}

		return matchUser;
	}

	@Override
	public double getScore(User user, User other) {
		String[] myInterests = user.getInterest().split(",");
		String[] otherInterests = other.getInterest().split(",");
		int matchCount = 0;

		for (String myInterest : myInterests) {
			for (String otherInterest : otherInterests) {
				if (myInterest.equals(otherInterest)) {
					matchCount++;
				}
			}
		}
		return matchCount;

	}

}

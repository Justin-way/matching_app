package strategy;

import java.util.List;

import user.User;

public class DistanceStrategy implements MatchStrategy {

	User matchUser = null;


	@Override
	public User findMatch(User user, List<User> users) {


		double maxScore = -Double.MAX_VALUE;

		for (User other : users) {
			if (other.getId() == user.getId()) {
				continue;
			}

			double score = getScore(user, other);
			System.out.println("User " + other.getId() + " | Score: " + score);
			if (score > maxScore) {
				maxScore = score;
				matchUser = other;
			}
		}


		return matchUser;
	}

	@Override
	public double getScore(User user, User other) {

		double distance = 0;

		String[] coordsMe = user.getLocation().replaceAll("[()]", "").split(",");
		String[] coordsOther = other.getLocation().replaceAll("[()]", "").split(",");

		int xMe = Integer.parseInt(coordsMe[0]);
		int yMe = Integer.parseInt(coordsMe[1]);
		int xOther = Integer.parseInt(coordsOther[0]);
		int yOther = Integer.parseInt(coordsOther[1]);

		distance = Math.sqrt(Math.pow(xMe - xOther, 2) + Math.pow(yMe - yOther, 2));
		System.out.println("User " + other.getId() + ",distance: " + distance);

		return -distance;

	}
}

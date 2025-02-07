package main;
import strategy.DistanceStrategy;
import strategy.InterestStrategy;
import strategy.ReverseStrategy;
import system.MatchApp;
import user.User;

public class Main {
	public static void main(String[] args) {
		String introduction = "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd";
		User user1 = new User(1, "male", 18, introduction, "music,sport,dancing", "(1,2)");
		User user2 = new User(2, "female", 20, introduction, "music", "(10,10)");
		User user3 = new User(3, "male", 21, introduction, "music,sport", "(60,60)");

		MatchApp matchApp = MatchApp.getInstance();
		DistanceStrategy distanceStrategy = new DistanceStrategy();
		InterestStrategy interestStrategy = new InterestStrategy();
		ReverseStrategy reverseStrategy = new ReverseStrategy(interestStrategy);
		matchApp.register(user1);
		matchApp.register(user2);
		matchApp.register(user3);

		User matchUser = matchApp.startMath(user1, reverseStrategy);
		System.out.println("matchUser: " + matchUser.getId());



	}
}
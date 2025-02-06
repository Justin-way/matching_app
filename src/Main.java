import strategy.DistanceStrategy;
import system.MatchApp;
import user.User;

public class Main {
    public static void main(String[] args) {
        String introduction = "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd";
        User user1 = new User(1, "male", 18, introduction, "Male", "(1,2)");
        User user2 = new User(2, "male", 18, introduction, "Male", "(1,2)");
        User user3 = new User(3, "male", 18, introduction, "Male", "(1,5)");

        MatchApp matchApp = MatchApp.getInstance();
        DistanceStrategy distanceStrategy = new DistanceStrategy();

        matchApp.register(user1);
        matchApp.register(user2);
        matchApp.register(user3);

        User user4 = matchApp.startMath(user1, distanceStrategy);
        System.out.println(user4.getId());



    }
}
package system;

import strategy.MatchStrategy;
import user.User;

import java.util.ArrayList;
import java.util.List;

public class MatchApp {

    private static final MatchApp INSTANCE = new MatchApp();
    List<User> registers = new ArrayList<>();
    private MatchApp() {
    }

    public static MatchApp getInstance() {
        return INSTANCE;
    }

    public void register(User user){
        System.out.println("user id" + user.getId() + " has been registered.");
        registers.add(user);
    }

    public User startMath(User user, MatchStrategy strategy){
        MatchSystem matchSystem = new MatchSystem(strategy);
        return matchSystem.getPerson(user, registers);
    }


}

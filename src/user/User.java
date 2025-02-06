package user;

public class User {
    int id;
    String gender;
    int age;
    String introduction;
    String interest;
    String location;
    public void createUser(User user){

    }
    public User(int id, String gender, int age, String introduction, String interest, String location) {
        setId(id);
        setGender(gender);
        setAge(age);
        setIntroduction(introduction);
        setInterest(interest);
        setLocation(location);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("id cannot be negative");
        }
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (!"male".equals(gender) && !"female".equals(gender)) {
            throw new IllegalArgumentException("Not a valid gender");
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("age cannot be less than 18");
        }
        this.age = age;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        if (introduction.length() < 200) {
            throw new IllegalArgumentException("introduction cannot be less than 200 words");
        }
        this.introduction = introduction;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if (location == null || !location.matches("\\(\\s*-?\\d+\\s*,\\s*-?\\d+\\s*\\)")) {
            throw new IllegalArgumentException("Location must be in the format (x, y), where x and y are integers.");
        }

        this.location = location;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        String[] interests = interest.split(",");
        for (String inter : interests) {
            if (inter.isEmpty() || inter.length() > 10) {
                throw new IllegalArgumentException("interest cannot be moew than 10 words or be empty");
            }
        }
        this.interest = interest;
    }
}


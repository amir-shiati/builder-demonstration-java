package core;

public class User {
    private final int id;
    private String fName;
    private String lName;
    private int age;
    private int height;
    private UserRole role;

    public User(Builder builder) {
        this.id = builder.id;
        this.fName = builder.fName;
        this.lName = builder.lName;
        this.age = builder.age;
        this.height = builder.height;
        this.role = builder.role;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return fName;
    }

    public String getLastName() {
        return lName;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public UserRole getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "User info: " +
                "Id: " + this.getId() + "\n" +
                "First name: " + this.getFirstName() + "\n" +
                "Last name: " + this.getLastName() + "\n" +
                "Age: " + this.getAge() + "\n" +
                "Height: " + this.getHeight() + "\n" +
                "Role: " + this.getRole().toString();
    }

    public static class Builder {
        private final int id;
        private String fName;
        private String lName;
        private int age;
        private int height;
        private UserRole role;

        public Builder(int id) {
            this.id = id;
        }

        public Builder setFirstName(String fName) {
            this.fName = fName;
            return this;
        }

        public Builder setLastName(String lName) {
            this.lName = lName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setHeight(int height) {
            this.height = height;
            return this;
        }

        public Builder setRole(UserRole role) {
            this.role = role;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

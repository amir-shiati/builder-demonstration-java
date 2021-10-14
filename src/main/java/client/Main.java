package client;

import core.User;
import core.UserRole;

public class Main {
    public static void main(String[] args) {
        User user = new User.Builder(10)
                .setFirstName("Amir")
                .setLastName("Shiati")
                .setAge(23)
                .setHeight(180)
                .setRole(UserRole.ADMIN)
                .build();

        System.out.println(user.toString());
    }
}

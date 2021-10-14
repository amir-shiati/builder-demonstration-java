package core;

public enum UserRole {
    ADMIN("admin"),
    VENDOR("vendor"),
    CUSTOMER("customer");

    private final String name;

    UserRole(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name();
    }
}

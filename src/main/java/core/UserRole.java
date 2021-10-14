package core;

public enum UserRole {
    ADMIN("Admin"),
    VENDOR("Vendor"),
    CUSTOMER("Customer");

    String role;

    UserRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return role;
    }
}

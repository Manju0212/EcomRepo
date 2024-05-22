package Assignment3.java;

public abstract class User {
    private int userId;
    private String username;
    private String password;
    private String email;

    public User(int userId, String username, String password, String email) {
        this.userId = userId;
        this.setUsername(username);
        this.setPassword(password);
        this.setEmail(email);
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username == null || username.isEmpty()) {
            System.out.println("Username cannot be null or empty.");
        } else {
            this.username = username;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null || password.isEmpty()) {
            System.out.println("Password cannot be null or empty.");
        } else {
            this.password = password;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.isEmpty()) {
            System.out.println("Email cannot be null or empty.");
        } else {
            this.email = email;
        }
    }

    public void login() {
        System.out.println(username + " logged in.");
    }

    public void logout() {
        System.out.println(username + " logged out.");
    }

    public abstract void viewProfile();

    public abstract void updateProfile();
}

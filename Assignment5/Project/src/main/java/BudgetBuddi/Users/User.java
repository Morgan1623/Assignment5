package BudgetBuddi.Users;

public class User
{
    //Variables
    private String userName;
    private String email;
    private String name;
    private long password;

    public User(String userName, String email, String name, long password) {
        this.userName = userName;
        this.email = email;
        this.name = name;
        this.password = password;
    }//closes constructor

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPassword() {
        return password;
    }

    public void setPassword(long password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", password=" + password +
                '}';
    }
}//closes class

public class  User  {
    private String firstname;
    private String lastname;
    private String email;
    private String password;

    public User() {

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public User(String firstname, String lastname, String email, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;

    }

    @Override
    public String toString() {
        return "\f FIRSTNAME_Ashot \n  LASTNAME_Aleqsanyan\n  EMAIL_aleqsanyan1996@mail.ru\n  PASSWORD_1234qwer";

    }
}




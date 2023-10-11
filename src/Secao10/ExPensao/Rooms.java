package Secao10.ExPensao;

public class Rooms {
    private String name, email;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Rooms(String name, String email) {
        this.name = name;
        this.email = email;
    }
    @Override
    public String toString() {
        return  this.name + ", " + this.email ;
    }
}

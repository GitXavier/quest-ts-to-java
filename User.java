import java.util.ArrayList;
import java.util.Date;

public class User {
    
    // attributes
    private Date birthdate;
    private int size;
    private ArrayList<Photo> photo;
    private Address address; 


    // constructors
    public User() { }

    // getters and setter
    public Date getBirthdate() {
        return this.birthdate;
    }

    public void setNumber(Date birthdate) {
        this.birthdate = birthdate;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<Photo> getPhoto() {
        return this.photo;
    }

    public void setPhoto(ArrayList<Photo> photo) {
        this.photo = photo;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAdress(Address adress) {
        this.address = address;
    }
}

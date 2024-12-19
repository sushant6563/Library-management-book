package models;

public class Member {

    private int id;
    private String name;
    private String email;
    private String phoneNumber;

    // Constructors
    public Member() {
        // Default constructor
    }

    public Member(int id, String name, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Member(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    // toString method for displaying member details
    @Override
    public String toString() {
        return STR."Member{id=\{id}, name='\{name}', email='\{email}', phoneNumber='\{phoneNumber}'}";
    }
}
}

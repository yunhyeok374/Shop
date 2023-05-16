package Online.Shop.Shop.Member;

public class Member {

    private Long id;
    private String name;
    private String email;
    private String address;
    private Grade grade;

    public Member(Long id, String name, String email, String address, Grade grade) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.grade = grade;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}

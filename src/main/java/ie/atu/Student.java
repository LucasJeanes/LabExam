package ie.atu;

public class Student {
    private String name;
    private String address;
    private Integer idNum;
    private Integer age;

    public Student() {
    }

    public Student(String name, String address, Integer idNum, Integer age) {
        this.name = name;
        this.address = address;
        this.idNum = idNum;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(Integer idNum) {
        this.idNum = idNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" + "Student name: " + name + ", Student ID: " + idNum + ", Student Age: " + age + ", Student Address: " + address + "}";
    }
}

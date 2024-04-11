import java.time.LocalDate;

public class Human {

    private String name;
    private LocalDate dob;
    private LocalDate dod;
    private Gender gender;
    private Human mother;
    private Human father;

    public Human(String name, LocalDate dob, LocalDate dod, Gender gender, Human mother, Human father) {
        this.name = name;
        this.dob = dob;
        this.dod = dod;
        this.gender = gender;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, Gender gender, LocalDate dob) {
        this(name, dob, null, gender, null, null);
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getDod() {
        return dod != null ? dod : LocalDate.now();
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }
}
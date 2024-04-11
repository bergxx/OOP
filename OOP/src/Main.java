import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Human father = new Human("Sergey", Gender.Male , LocalDate.of(1975, 6, 20));
        Human mother = new Human("Elena", Gender.Female, LocalDate.of(1980, 9, 12));
        Human child1 = new Human("Maxim", Gender.Male, LocalDate.of(2005, 1, 14));
        Human child2 = new Human("Egor", Gender.Male, LocalDate.of(2008, 8, 10));
        Human child3 = new Human("Sofia", Gender.Female, LocalDate.of(2012, 11, 5));

        child1.setMother(mother);
        child1.setFather(father);
        child2.setMother(mother);
        child2.setFather(father);
        child3.setMother(mother);
        child3.setFather(father);

        FamilyTree family = new FamilyTree();
        family.addMember(father);
        family.addMember(mother);
        family.addMember(child1);
        family.addMember(child2);
        family.addMember(child3);

        System.out.println(family.allMembers());
        System.out.println(family.allChildren(mother));
    }
}
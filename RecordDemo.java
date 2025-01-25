/*import java.util.Objects;

class Muthu{
    int id;
    String name;

    Muthu(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Muthu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Muthu muthu = (Muthu) o;
        return id == muthu.id && Objects.equals(name, muthu.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}*/

record Muthu(int id,String name){
    public Muthu{
        if(id==0)
            throw new IllegalArgumentException("Id must be greater than 0");
    }
}

public class RecordDemo {
    public static void main(String[] args) {
        Muthu m1 = new Muthu(0, "Mahesh1");
        Muthu m2 = new Muthu(1, "Mahesh");
        System.out.println(m1.id());
        System.out.println(m1);
        System.out.println(m1.equals(m2));
    }
}
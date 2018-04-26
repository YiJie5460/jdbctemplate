public class Student {

    private Long Id;
    private String name;

    public Student(){

    }
    public Student(String name){
        this.name=name;
    }
    public Student(String name,long id){
        this.name=name;
        this.Id=id;
    }
    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{姓名：" + name + "; id：" + Id + "}";
    }
}
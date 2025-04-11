public sealed abstract class Employee permits Manager, Salesman {
    //parecido com a final mas voce tem que descrever quais são as subclasse que podem herdar de uma sealed
    private String code;

    private String name;

    private int age;

    private String adress;

    private double salary;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Paciente {
    private String name;
    private double height;
    private double weight;
    private char sex;
    private int age;

    public Paciente() {
    }

    public Paciente(String name, double height, double weight, char sex, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }
    Double imc(int weight, int height){
        return (double) weight /(height*height);
    }
    public String compotition(Double imc){
    if (imc < 18.5){
        return "Underweight";
    } else if (imc >= 18.5 && imc < 25){
        return "Normal";
    } else if (imc >= 25 && imc < 25){
        return "Normal";
    } else if (imc >= 25 && imc < 30){
        return "Overweight";
    } else {
        return "Obesity";
    }
    }
}




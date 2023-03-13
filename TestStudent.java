public class TestStudent {
    public static void main(String[] args) {

        System.out.println("Probando clase student");

        Student Adalberto = new Student();
        Adalberto.setName("Adalberto");
        Adalberto.setLastName("Diaz");
        Adalberto.setCareer("Ingeniería en Informática");
        Adalberto.setControlNumber(21670125);
        Adalberto.setSemester("Segundo");

        Student estudend2 = new Student();
        estudend2.setName("Arnoldo");
        estudend2.setLastName("Martinez");
        estudend2.setCareer(" Ingenieria en informatica");
        estudend2.setSemester("Segundo");
        estudend2.setControlNumber(22683617);

        estudend2.mostrarInf();

        Adalberto.mostrarInf();
    }
}
public class multilevel{
     static class employee{
         int salary = 3333;
        
    }
    static class Engineer extends employee{
        int allowance = 3000;
    }
    static class Intern extends Engineer{
        int bonus = 60000;
    }

    public static void main(String[] args) {
        Intern i = new Intern();
        int total = i.salary + i.allowance + i.bonus;
        System.out.println("The salary is"+i.salary);
        System.out.println("The allowance is"+i.allowance);
        System.out.println("The interns total salary is"+ total);
    }

}
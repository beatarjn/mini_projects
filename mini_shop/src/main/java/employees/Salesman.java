package employees;

public sealed class Salesman permits SeniorSalesman, MidSalesman, Owner {


    public void sale(){
        System.out.println("Salesman job: sale products.");
    }

    public void advertise(){
        System.out.println("Salesman job: advertise.");
    }

    public void sayOpinion(){
        System.out.println("Salesman opinion");
    }

}
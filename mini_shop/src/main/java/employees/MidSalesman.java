package employees;

public non-sealed class MidSalesman extends Salesman {

    private Salesman salesman;

    public MidSalesman(Salesman salesman) {
        this.salesman = salesman;
    }

    @Override
    public void sale() {
        System.out.println("Midsalesman job: send message to client");
        System.out.println("Midsalesman job is also: ");
        salesman.sale();
        salesman.advertise();
    }

    @Override
    public void sayOpinion() {
        System.out.println("MidSalesman opinion");
    }

}
package employees;

public non-sealed class SeniorSalesman extends Salesman {

    private Salesman salesman;

    public SeniorSalesman(Salesman salesman) {
        this.salesman = salesman;
    }

    @Override
    public void sale() {
        System.out.println("SeniorSalesman job: do research ");
        System.out.println("SeniorSalesman job is also: ");
        salesman.sale();
        salesman.advertise();
    }

    @Override
    public void sayOpinion() {
        System.out.println("SeniorSalesman opinion");
    }
}
package employees;

public non-sealed class Owner extends Salesman {

    private Salesman salesman;

    public Owner(Salesman salesman) {
        this.salesman = salesman;
    }

    @Override
    public void sale() {
        System.out.println("Owner job: run the shop ");
        System.out.println("Owner job is also: ");
        salesman.sale();
        salesman.advertise();
    }

    @Override
    public void sayOpinion() {
        System.out.println("Owner opinion");
    }
}
public class Apartment extends Famile implements PaymentAble{
    public Apartment() {
    }
    @Override
    public void summa() {
        System.out.println("коммунальные услуги за месяц: 2500 сом");
    }
}

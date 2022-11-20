public class Main {
    public static void main(String[] args) {
        long[] sales = {99,30,5,100,78};
            SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
        System.out.println(salesManager.average());
    }
}
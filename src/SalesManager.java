public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int average(){
        int min = max();
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        int max = max();
        int amount = 0;
        int sum = 0;
        for (int sale : sales) {
            if (sale == max | sale == min) {
                continue;
            } else {
                sum += sale;
                amount++;
            }
        }
        return sum/amount;
    }
}
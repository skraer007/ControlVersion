public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
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
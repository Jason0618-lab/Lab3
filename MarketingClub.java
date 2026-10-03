public class MarketingClub extends Club {

    private int budget;

    public MarketingClub(String c, int m, int b) {
        super(c, m);
        budget = b;
    }

    public void useBudget(int amount) {
        if (budget - amount >= 0) {
            budget = budget - amount;
        }
    }

    @Override
    public int determineBudget() {
        if (budget > 1000) {
            return 0;
        } else {
            return super.determineBudget();
        }
    }
}
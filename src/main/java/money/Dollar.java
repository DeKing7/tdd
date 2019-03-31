package money;

public class Dollar {
    private double amount;

    private static final double CENTS_PER_DOLLAR = 100;

    public Dollar(double amount) {
        this.amount = (int) (amount * CENTS_PER_DOLLAR);
    }

    @Override
    public String toString() {
        return String.format("$%.2f", (double) amount / CENTS_PER_DOLLAR);
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Dollar) && amount == ((Dollar) o).amount;
    }

    public Dollar minus(Dollar substrahed) {
        Dollar result = new Dollar(0);
        result.amount = amount - substrahed.amount;
        return result;
    }
}


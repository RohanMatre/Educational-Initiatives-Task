interface ShippingStrategy {
    double calculateShippingCost(double weight);
}

class StandardShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight) {
        return weight * 2.0;
    }
}

class ExpressShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight) {
        return weight * 5.0;
    }
}

class ShoppingCart {
    private ShippingStrategy shippingStrategy;
    private double totalWeight;

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public double calculateTotalCost() {
        return totalWeight * shippingStrategy.calculateShippingCost(totalWeight);
    }
}
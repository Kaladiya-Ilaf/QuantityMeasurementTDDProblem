package quantitymeasurement;

public class AddQuantity {
    public double AddQuantities(QuantityMeasurement comparator1, QuantityMeasurement comparator2) {
        if (comparator1.unit.unitType.equals(comparator2.unit.unitType)) {
            return (comparator1.value * comparator1.unit.baseUnit) + (comparator2.value * comparator2.unit.baseUnit);
        }
        return 0;
    }
}

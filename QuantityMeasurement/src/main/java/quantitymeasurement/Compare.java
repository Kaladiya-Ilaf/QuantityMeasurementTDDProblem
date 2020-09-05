package quantitymeasurement;

public class Compare {
    public  boolean compareTo(QuantityMeasurement comparator1, QuantityMeasurement comparator2) {
       if (comparator1.unit.unitType.equals(comparator2.unit.unitType))
           return (Double.compare((comparator1.value * comparator1.unit.baseUnit), (comparator2.value * comparator2.unit.baseUnit)) == 0);
           return false;
    }
}

package quantitymeasurement;

import java.util.Objects;

public class QuantityMeasurement {

    public final double value;
    public Unit unit;
    private Compare compare;
    private AddQuantity add;

    public QuantityMeasurement(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
        compare = new Compare();
        add = new AddQuantity();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement feet = (QuantityMeasurement) o;
        return Double.compare(feet.value, value) == 0;
    }

    public  boolean compareUnits(QuantityMeasurement comparator1, QuantityMeasurement comparator2)
    {
        return compare.compareTo(comparator1,comparator2);
    }

    public double add(QuantityMeasurement comparator1, QuantityMeasurement comparator2)
    {
        return add.AddQuantities(comparator1,comparator2);
    }

    public boolean temperatureComparision(QuantityMeasurement comparator1, QuantityMeasurement comparator2){
        return compare.temperatureComparision(comparator1,comparator2);
    }
}

package quantitymeasurement;

public class Compare {
    public  boolean compareTo(QuantityMeasurement comparator1, QuantityMeasurement comparator2) {
       if (comparator1.unit.unitType.equals(comparator2.unit.unitType))
           return (Double.compare((comparator1.value * comparator1.unit.baseUnit), (comparator2.value * comparator2.unit.baseUnit)) == 0);
           return false;
    }

    public boolean temperatureComparision(QuantityMeasurement comparator1, QuantityMeasurement comparator2)  {
        if(comparator1.unit.equals(Unit.FAHRENHEIT) && comparator2.unit.unitType.equals(UnitType.TEMPERATURE))
            return (Double.compare(((comparator1.value-32)*5/9),comparator2.value*comparator2.unit.baseUnit) == 0 );
        if(comparator1.unit.equals(Unit.CELSIUS) && comparator2.unit.unitType.equals(UnitType.TEMPERATURE))
            return (Double.compare(((comparator1.value*9/5)+32),comparator2.value) == 0 );
        return false;
    }
}

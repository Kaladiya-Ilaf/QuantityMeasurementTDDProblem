package quantitymeasurement;

import java.util.Objects;

public class QuantityMeasurement {
    private final Unit unit;

    private final double value;

    public QuantityMeasurement(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement feet = (QuantityMeasurement) o;
        return Double.compare(feet.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}

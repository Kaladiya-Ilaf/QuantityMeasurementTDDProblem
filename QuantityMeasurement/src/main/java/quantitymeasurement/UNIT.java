package quantitymeasurement;

enum Unit {
    FEET(12.0),
    INCH(1.0),
    YARD(36.0);

    private final double baseUnit;

    Unit (double baseUnit) {
        this.baseUnit = baseUnit;
    }
    public double convertToUnit(double value){
        return value * baseUnit;
    }
}


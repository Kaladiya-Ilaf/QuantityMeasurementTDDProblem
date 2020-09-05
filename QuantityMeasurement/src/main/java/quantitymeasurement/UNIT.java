package quantitymeasurement;

enum Unit {
    FEET(UnitType.LENGTH, 12.0),
    INCH(UnitType.LENGTH, 1.0),
    YARD(UnitType.LENGTH, 36.0),
    CENTIMETER(UnitType.LENGTH, 0.4) ;

    public final double baseUnit;
    UnitType unitType;

    Unit(UnitType unitType, double baseUnit) {
        this.unitType = unitType;
        this.baseUnit = baseUnit;
    }

}


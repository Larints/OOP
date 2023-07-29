package task_001;

public class CalcModel<T extends Number> {

    public T sum(T value1, T value2) {
        if (value1 instanceof Integer) {
            return (T) Integer.valueOf(value1.intValue() + value2.intValue());
        } else if (value1 instanceof Double) {
            return (T) Double.valueOf(value1.doubleValue() + value2.doubleValue());
        } else if (value1 instanceof Long) {
            return (T) Long.valueOf(value1.longValue() + value2.longValue());
        }
        throw new IllegalArgumentException("Непподерживаемый тип значений");
    }

    public T sub(T value1, T value2) {
        if (value1 instanceof Integer) {
            return (T) Integer.valueOf(value1.intValue() - value2.intValue());
        } else if (value1 instanceof Double) {
            return (T) Double.valueOf(value1.doubleValue() - value2.doubleValue());
        } else if (value1 instanceof Long) {
            return (T) Long.valueOf(value1.longValue() - value2.longValue());
        }
        throw new IllegalArgumentException("Непподерживаемый тип значений");
    }

    public double div(T value1, T value2) {
        if (value2.doubleValue() != 0) {
            throw new IllegalArgumentException("Делить на 0 нельзя!");
        }
        return value1.doubleValue() / value2.doubleValue();
    }

    public T mul(T value1, T value2) {
        if (value1 instanceof Integer) {
            return (T) Integer.valueOf(value1.intValue() * value2.intValue());
        } else if (value1 instanceof Double) {
            return (T) Double.valueOf(value1.doubleValue() * value2.doubleValue());
        } else if (value1 instanceof Long) {
            return (T) Long.valueOf(value1.longValue() * value2.longValue());
        }
        throw new IllegalArgumentException("Введены недопустимые значения");
    }




}
public class App {
    public static void main(String[] args) throws Exception {
        Latitude lat = new Latitude(35.86);
        Longitude lon = new Longitude(139.6);
        Radius rad = new Radius(0.1);
        System.out.println("Latitude is " + lat.degree);
        System.out.println("Longitude is " + lon.degree);
        System.out.println("Radius is " + rad.degree);
    }
}

class Latitude {
    final double degree;

    public Latitude(double degree) {
        if (degree < -90 || degree > 90) {
            throw new IllegalArgumentException();
        }
        this.degree = degree;
    }
    
}

class Longitude {
    final double degree;

    public Longitude(double degree) {
        if (degree < -180 || degree > 180) {
            throw new IllegalArgumentException();
        }
        this.degree = degree;
    }

    
}

class Radius {
    final double degree;
    double UPPER_RADIUS_LIMIT = 0.1;

    public Radius(double degree) {
        if (degree <= 0 || degree > UPPER_RADIUS_LIMIT) {
            throw new IllegalArgumentException();
        }
        this.degree = degree;
    }

    
}

class MeasurementTime {
    long startTime = -1;
    long endTime = -1;

    public long Start() {
        this.startTime = System.currentTimeMillis();
        return this.startTime;
    }

    public long End() {
        this.endTime = System.currentTimeMillis();
        return this.endTime;
    }

    public long Measure() {
        if (this.startTime < 0 || this.endTime < 0) {
            throw new IllegalArgumentException();
        }
        return this.endTime - this.startTime;
    }
}
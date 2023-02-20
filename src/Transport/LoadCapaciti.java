package Transport;

public enum LoadCapaciti {
        N1(0, 3.5),
        N2(3.6, 12),
        N3(12.9, 100);
        double max;
        double min;

        LoadCapaciti(double max, double min) {
            this.max = max;
            this.min = min;
        }

        public static LoadCapaciti getValue(double value) {
            for (LoadCapaciti i : LoadCapaciti.values()) {
                if (value >= i.min && value <= i.max) {
                    System.out.println(i);
                    return i;
                }
            }
            return null;
        }

        public double getMax() {
            return max;
        }

        public double getMin() {
            return min;
        }

        @Override
        public String toString() {
            return "грузоподьемность от " + max + ", до " + min;
        }

}
